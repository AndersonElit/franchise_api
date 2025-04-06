package franchise.pgs.db.adapter;

import franchise.application.mapper.Mapper;
import franchise.domain.model.StoreProduct;
import franchise.domain.ports.out.StoreProductRepository;
import franchise.pgs.db.entities.StoreEntity;
import franchise.pgs.db.entities.StoreProductEntity;
import franchise.pgs.db.repository.PgsStoreProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StoreProductAdapter implements StoreProductRepository {

    private final PgsStoreProductRepository storeProductRepository;

    @Override
    public Mono<StoreProduct> save(StoreProduct storeProduct) {
        return storeProductRepository.save(Mapper.map(storeProduct, StoreProductEntity.class))
                .map(storeProductEntity -> Mapper.map(storeProductEntity, StoreProduct.class));
    }
}
