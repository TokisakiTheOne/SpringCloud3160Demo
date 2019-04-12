import com.yyh.Application;
import com.yyh.service.ApiService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author YanYuHang
 * @create 2019-04-11-16:27
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

    @Resource
    private ApiService apiService;

    @org.junit.Test
    public void test1() {
        System.out.println(apiService.index());
    }

    @org.junit.Test
    public void test2() {
        System.out.println(apiService.index());
    }

    @org.junit.Test
    public void test3() {
        System.out.println(apiService.index());
    }
}
