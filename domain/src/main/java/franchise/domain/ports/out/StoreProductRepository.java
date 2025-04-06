package franchise.domain.ports.out;

import franchise.domain.model.StoreProduct;
import reactor.core.publisher.Mono;

public interface StoreProductRepository {
    Mono<StoreProduct> save(StoreProduct storeProduct);
}
