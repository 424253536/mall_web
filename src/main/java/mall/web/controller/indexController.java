package mall.web.controller;

import mall.user.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class indexController {

    @Value("${ff.name}")
    private String configName;

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/findById")
    public String findById(){
        String name = userFeign.findById();
        return name;
    }

    @GetMapping("/login")
    public String login(){
        return userFeign.login();
    }


    @GetMapping("/findById2")
    public String findById2(){
        String name = userFeign.findById();
        return name;
    }
}
