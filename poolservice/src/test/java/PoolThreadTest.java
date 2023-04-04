import com.example.PoolThread;
import com.example.service.MyServcie;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = PoolThread.class)
public class PoolThreadTest {

    @Resource
    MyServcie template;

    @Test
    void test() throws InterruptedException {

        //使用convertAndSend方法一步到位，参数基本和之前是一样的
        //最后一个消息本体可以是Object类型，真是大大的方便
        template.getAllAsync();
        Thread.sleep(3000);
        template.getAll();

    }



}
