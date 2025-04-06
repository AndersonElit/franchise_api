package franchise.pgs.db.repository;

import franchise.pgs.db.entities.StoreProductEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PgsStoreProductRepository extends ReactiveCrudRepository<StoreProductEntity, Void> {
    @Query("UPDATE store_product SET stock = :stock WHERE store_id = :storeId AND product_id = :productId")
    Mono<Integer> updateStock(Long storeId, Long productId, int stock);
    Mono<Void> deleteByStoreIdAndProductId(Long storeId, Long productId);
}
