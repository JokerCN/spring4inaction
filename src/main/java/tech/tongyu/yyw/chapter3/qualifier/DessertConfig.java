package tech.tongyu.yyw.chapter3.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import tech.tongyu.yyw.chapter3.qualifier.annotation.Cold;
import tech.tongyu.yyw.chapter3.qualifier.annotation.Creamy;
import tech.tongyu.yyw.chapter3.qualifier.annotation.Fruity;
import tech.tongyu.yyw.chapter3.qualifier.impl.Cake;
import tech.tongyu.yyw.chapter3.qualifier.impl.NormalEater;
import tech.tongyu.yyw.chapter3.qualifier.impl.Popsicle;
import tech.tongyu.yyw.chapter3.qualifier.intel.Dessert;
import tech.tongyu.yyw.chapter3.qualifier.intel.Eater;

@Configuration
@ComponentScan(basePackageClasses = DessertConfig.class)
public class DessertConfig {

    @Bean
//    @Primary
    public Dessert getDessert(){
        return new Cake();
    }

    @Bean
//    @Qualifier("cold")
    @Fruity
    public Dessert getAnotherDessert(){
        return new Popsicle();
    }

    @Bean
    public Eater getEater(@Qualifier("cold") Dessert dessert){
        return new NormalEater(dessert);
    }


}
