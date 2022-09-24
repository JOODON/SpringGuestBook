package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"Dao"})
@Import({kr.or.connect.guestbook.config.DBConfig.class })
public class ApplicationConfig {

}