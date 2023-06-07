import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class CloudSqlConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://google/jobshark?cloudSqlInstance=jobshark-389109:europe-west1:jobshark&socketFactory=com.google.cloud.sql.postgres.SocketFactory&user=postgres&password=jawsjawsjawsjaws");
        return dataSource;
    }
}




}
