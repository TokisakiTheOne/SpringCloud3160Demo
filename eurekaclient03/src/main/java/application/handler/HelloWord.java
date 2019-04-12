package application.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanYuHang
 * @create 2019-04-07-16:13
 */
@RestController
public class HelloWord {
    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index() {
        return "Hello World!!!!!!!!!!!! SpringCloud   端口是"+port;
    }
}
