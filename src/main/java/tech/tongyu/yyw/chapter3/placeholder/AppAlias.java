package tech.tongyu.yyw.chapter3.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppAlias {
    private String appAlias;

    public AppAlias(
            @Value("${app.name}")String appAlias
    ){
        this.appAlias = appAlias;
    }

    public String getAppAlias() {
        return appAlias;
    }
}
