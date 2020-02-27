import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //Spring容器，就类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();

        User user2 = (User) context.getBean("user");
        System.out.println(user == user2);

        User user3 = (User) context.getBean("userNew");
        user3.show();
    }
}
