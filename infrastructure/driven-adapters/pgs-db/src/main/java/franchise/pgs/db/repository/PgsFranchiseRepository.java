package franchise.pgs.db.repository;

import franchise.pgs.db.entities.FranchiseEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PgsFranchiseRepository extends ReactiveCrudRepository<FranchiseEntity, Long> {
}
