package franchise.pgs.db.repository;

import franchise.pgs.db.entities.StoreEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PgsStoreRepository extends ReactiveCrudRepository<StoreEntity, Long>  {
}
