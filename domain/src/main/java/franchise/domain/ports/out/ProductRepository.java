package franchise.domain.ports.out;

import franchise.domain.model.Product;
import reactor.core.publisher.Mono;

public interface ProductRepository {
    Mono<Product> save(Product product);
}
