package franchise.pgs.db.adapter;

import franchise.application.mapper.Mapper;
import franchise.domain.model.Franchise;
import franchise.domain.ports.out.FranchiseRepository;
import franchise.pgs.db.entities.FranchiseEntity;
import franchise.pgs.db.repository.PgsFranchiseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class FranchiseAdapter implements FranchiseRepository {
    private final PgsFranchiseRepository franchiseRepository;


    @Override
    public Mono<Franchise> save(Franchise franchise) {
        return franchiseRepository.save(Mapper.map(franchise, FranchiseEntity.class))
                .map(franchiseEntity -> Mapper.map(franchiseEntity, Franchise.class));
    }
}
