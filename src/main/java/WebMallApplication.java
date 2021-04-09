
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"mall.web.controller","mall.security.config"})
@EnableFeignClients(basePackages={"mall.user.feign"})
public class WebMallApplication {

    public static void main(String[] args) {
        System.out.println("11111111111111111111");
        SpringApplication.run(WebMallApplication.class,args);
    }
}
