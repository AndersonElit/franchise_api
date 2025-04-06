package franchise.application.usecases;

import franchise.application.mapper.Mapper;
import franchise.domain.model.Franchise;
import franchise.domain.model.Product;
import franchise.domain.model.StoreProduct;
import franchise.domain.ports.in.FranchisePort;
import franchise.domain.ports.out.FranchiseRepository;
import franchise.domain.ports.out.ProductRepository;
import franchise.domain.ports.out.StoreProductRepository;
import franchise.domain.ports.out.StoreRepository;
import franchise.domain.request.*;
import franchise.domain.response.FranchiseResponse;
import franchise.domain.response.ProductResponse;
import franchise.domain.response.StoreResponse;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class FranchiseUseCase implements FranchisePort {

    private final FranchiseRepository franchiseRepository;
    private final StoreRepository storeRepository;
    private final ProductRepository productRepository;
    private final StoreProductRepository storeProductRepository;

    @Override
    public Mono<FranchiseResponse> saveFranchise(FranchiseRequest franchiseRequest) {
        return franchiseRepository.save(Mapper.map(franchiseRequest, Franchise.class))
                .map(franchise -> Mapper.map(franchise, FranchiseResponse.class));
    }

    @Override
    public Mono<StoreResponse> saveStore(StoreRequest storeRequest) {
        return storeRepository.save(Mapper.map(storeRequest, franchise.domain.model.Store.class))
                .map(store -> Mapper.map(store, StoreResponse.class));
    }

    @Override
    public Mono<ProductResponse> saveProduct(ProductRequest productRequest) {
        return productRepository.save(Product.builder()
                        .name(productRequest.getName())
                        .build())
                .flatMap(product -> storeProductRepository.save(StoreProduct.builder()
                                .productId(product.getId())
                                .stock(productRequest.getStock())
                                .storeId(productRequest.getStoreId())
                        .build())
                        .map(productStore -> ProductResponse.builder()
                                .id(productStore.getProductId())
                                .stock(productStore.getStock())
                                .name(product.getName())
                                .storeId(productStore.getStoreId())
                                .build()));
    }

    @Override
    public Mono<Void> updateStock(StockRequest stockRequest) {
        return storeProductRepository.updateStock(stockRequest.getStoreId(), stockRequest.getProductId(), stockRequest.getStock());
    }

    @Override
    public Mono<Void> deleteProduct(StoreProductRequest storeProductRequest) {
        return storeProductRepository.deleteProduct(storeProductRequest.getStoreId(), storeProductRequest.getProductId());
    }
}
