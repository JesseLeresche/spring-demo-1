package za.co.bootcamp.demo;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public SQLServerDataSource dataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setDatabaseName("MyDatabase");
        dataSource.setUser("me");
        dataSource.setPassword("password");
        return dataSource;
    }
}
