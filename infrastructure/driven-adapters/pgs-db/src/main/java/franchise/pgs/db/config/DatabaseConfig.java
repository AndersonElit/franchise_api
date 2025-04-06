package franchise.pgs.db.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories(basePackages = "franchise.pgs.db.repository")
public class DatabaseConfig {
}
