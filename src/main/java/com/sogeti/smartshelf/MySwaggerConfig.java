package com.sogeti.smartshelf;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Fadi Abdin
 */
@Configuration
@EnableSwagger //Loads the spring beans required by the framework
public class MySwaggerConfig {
    
    private SpringSwaggerConfig springSwaggerConfig;
    
       /**
    * Required to autowire SpringSwaggerConfig
    */
   @Autowired
   public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
      this.springSwaggerConfig = springSwaggerConfig;
   }
   
   
    @Bean
   public SwaggerSpringMvcPlugin customImplementation(){
      return new SwaggerSpringMvcPlugin(this.springSwaggerConfig);
              
   }
    
}
