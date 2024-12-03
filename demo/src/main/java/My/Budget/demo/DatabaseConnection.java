package My.Budget.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConnection {
   private String databaseUrl;
   private String postgres;
   private String sesame;

   public DatabaseConnection() {
   }

   @Bean
   public DataSource dataSource() {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setUrl(this.databaseUrl);
      dataSource.setUsername(this.postgres);
      dataSource.setPassword(this.sesame);
      return dataSource;
   }
}
