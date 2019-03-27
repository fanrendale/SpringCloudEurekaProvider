package com.xjf.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient      // 启用 eureka client 相关默认配置，在 Edgware 以后的版本该注解可以省略
public class SpringCloudEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProviderApplication.class, args);
    }

}
