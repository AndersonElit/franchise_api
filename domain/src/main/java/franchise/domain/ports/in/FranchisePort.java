package franchise.domain.ports.in;

import franchise.domain.request.FranchiseRequest;
import franchise.domain.request.ProductRequest;
import franchise.domain.request.StockRequest;
import franchise.domain.request.StoreRequest;
import franchise.domain.response.FranchiseResponse;
import franchise.domain.response.ProductResponse;
import franchise.domain.response.StoreResponse;
import reactor.core.publisher.Mono;

public interface FranchisePort {
    Mono<FranchiseResponse> saveFranchise(FranchiseRequest franchiseRequest);
    Mono<StoreResponse> saveStore(StoreRequest storeRequest);
    Mono<ProductResponse> saveProduct(ProductRequest productRequest);
    Mono<Void> updateStock(StockRequest stockRequest);
}
