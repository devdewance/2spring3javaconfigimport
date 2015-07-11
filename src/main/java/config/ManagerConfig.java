package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import core.ManagerBo;

@Configuration
public class ManagerConfig
{
	@Bean(name ="manager")
	public ManagerBo getObjectOfManagerBo()
	{
		return new ManagerBo();
		
	}

}
