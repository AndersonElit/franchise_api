package franchise.pgs.db.adapter;

import franchise.application.mapper.Mapper;
import franchise.domain.model.Store;
import franchise.domain.ports.out.StoreRepository;
import franchise.pgs.db.entities.StoreEntity;
import franchise.pgs.db.repository.PgsStoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StoreAdapter implements StoreRepository {

    private final PgsStoreRepository storeRepository;

    @Override
    public Mono<Store> save(Store store) {
        return storeRepository.save(Mapper.map(store, StoreEntity.class))
                .map(storeEntity -> Mapper.map(storeEntity, Store.class));
    }
}
