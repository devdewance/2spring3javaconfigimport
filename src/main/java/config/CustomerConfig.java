package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import core.Service;
import core.CustomerBo;

@Configuration
public class CustomerConfig 
{
	
	@Bean(name ="cust")
	public Service getObjectOfCustoerBo()
	{
		
		return new CustomerBo();
	}
	

}
