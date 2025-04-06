package franchise.pgs.db.repository;

import franchise.pgs.db.entities.ProductEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PgsProductRepository extends ReactiveCrudRepository<ProductEntity, Long> {
}
