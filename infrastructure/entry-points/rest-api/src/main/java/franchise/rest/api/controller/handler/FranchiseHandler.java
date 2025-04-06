package franchise.rest.api.controller.handler;

import franchise.domain.ports.in.FranchisePort;
import franchise.domain.request.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class FranchiseHandler {

    private final FranchisePort franchisePort;

    public Mono<ServerResponse> savefranchise(ServerRequest request) {
        return request.bodyToMono(FranchiseRequest.class)
                .flatMap(franchisePort::saveFranchise)
                .flatMap(franchiseResponse -> ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(franchiseResponse));
    }

    public Mono<ServerResponse> saveStore(ServerRequest request) {
        return request.bodyToMono(StoreRequest.class)
                .flatMap(franchisePort::saveStore)
                .flatMap(storeResponse -> ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(storeResponse));
    }

    public Mono<ServerResponse> saveProduct(ServerRequest request) {
        return request.bodyToMono(ProductRequest.class)
                .flatMap(franchisePort::saveProduct)
                .flatMap(productResponse -> ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(productResponse));
    }

    public Mono<ServerResponse> updateStock(ServerRequest request) {
        return request.bodyToMono(StockRequest.class)
                .flatMap(franchisePort::updateStock)
                .then(ServerResponse
                        .ok()
                        .build());
    }

    public Mono<ServerResponse> deleteProduct(ServerRequest request) {
        return request.bodyToMono(StoreProductRequest.class)
                .flatMap(franchisePort::deleteProduct)
                .then(ServerResponse
                        .ok()
                        .build());
    }

}
