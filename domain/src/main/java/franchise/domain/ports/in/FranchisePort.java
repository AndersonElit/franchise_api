package franchise.domain.ports.in;

import franchise.domain.request.*;
import franchise.domain.response.FranchiseResponse;
import franchise.domain.response.ProductResponse;
import franchise.domain.response.StoreResponse;
import reactor.core.publisher.Mono;

public interface FranchisePort {
    Mono<FranchiseResponse> saveFranchise(FranchiseRequest franchiseRequest);
    Mono<StoreResponse> saveStore(StoreRequest storeRequest);
    Mono<ProductResponse> saveProduct(ProductRequest productRequest);
    Mono<Void> updateStock(StockRequest stockRequest);
    Mono<Void> deleteProduct(StoreProductRequest storeProductRequest);
}
