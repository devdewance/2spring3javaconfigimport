package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import core.CustomerBo;

@Configuration
@Import({CustomerConfig.class,ManagerConfig.class})
public class AppConfig
{

	
}
