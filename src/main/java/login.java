import com.hzq.bean.User;
import com.hzq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class login {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-core.xml", "spring/spring-transaction.xml");
        UserService service=context.getBean("aaa",UserService.class);
        User user=service.login("admin","1");
        System.out.println(user);
    }
}
