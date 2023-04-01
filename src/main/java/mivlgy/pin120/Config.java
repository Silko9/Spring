package mivlgy.pin120;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("mivlgy.pin120")
@PropertySource("propertyConf.properties")
public class Config {
}
