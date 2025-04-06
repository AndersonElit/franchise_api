package franchise.pgs.db.adapter;

import franchise.application.mapper.Mapper;
import franchise.domain.model.Product;
import franchise.domain.ports.out.ProductRepository;
import franchise.pgs.db.entities.ProductEntity;
import franchise.pgs.db.repository.PgsProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductAdapter implements ProductRepository {

    private final PgsProductRepository pgsProductRepository;

    @Override
    public Mono<Product> save(Product product) {
        return pgsProductRepository.save(Mapper.map(product, ProductEntity.class))
                .map(productEntity -> Mapper.map(productEntity, Product.class));
    }
}
