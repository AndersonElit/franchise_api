package franchise.domain.ports.out;

import franchise.domain.model.StoreProduct;
import reactor.core.publisher.Mono;

public interface StoreProductRepository {
    Mono<StoreProduct> save(StoreProduct storeProduct);
    Mono<Void> updateStock(Long storeId, Long productId, int stock);
    Mono<Void> deleteProduct(Long storeId, Long productId);
}
