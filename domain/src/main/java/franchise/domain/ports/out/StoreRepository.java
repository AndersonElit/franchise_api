package franchise.domain.ports.out;

import franchise.domain.model.Store;
import reactor.core.publisher.Mono;

public interface StoreRepository {
    Mono<Store> save(Store store);
}
