package franchise.rest.api.controller.router;

import franchise.rest.api.controller.handler.FranchiseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class FranchiseRouter {

    @Bean
    public RouterFunction<ServerResponse> routeFranchise(FranchiseHandler franchiseHandler) {
        return RouterFunctions
                .route()
                .POST("/franchise/save", franchiseHandler::savefranchise)
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> routeStore(FranchiseHandler franchiseHandler) {
        return RouterFunctions
                .route()
                .POST("/franchise/store/save", franchiseHandler::saveStore)
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> routeProduct(FranchiseHandler franchiseHandler) {
        return RouterFunctions
                .route()
                .POST("/franchise/product/save", franchiseHandler::saveProduct)
                .build();
    }

}
