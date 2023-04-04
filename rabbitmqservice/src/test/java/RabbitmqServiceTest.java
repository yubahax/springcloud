import com.example.RabbitmqService;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes =  RabbitmqService.class)
public class RabbitmqServiceTest {

    @Resource
    RabbitTemplate template;

    @Test
    void publisher() {
        //使用convertAndSend方法一步到位，参数基本和之前是一样的
        //最后一个消息本体可以是Object类型，真是大大的方便
        template.convertAndSend("amq.direct", "yubahax", "Hello World!");
    }



}
