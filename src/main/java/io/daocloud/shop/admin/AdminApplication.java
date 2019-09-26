package io.daocloud.shop.admin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import io.daocloud.annotation.EnableDaocloudDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
@EnableDaocloudDiscovery
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}
