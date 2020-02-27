import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        * Student{name='憨批',
        *  address=Address{address='null'},
        * books=[红楼梦, 西游记, 水浒传, 三国演义],
        *  hobbies=[听歌, 敲代码, 看电影],
        *  card={身份证=1555555555, 银行卡=5555555555},
        *  games=[lol, wow],
        *  wife='null',
        * info={password=123456, driver=com.mysql.jdbc.Driver, root=root, url=jdbc:mysql://localhost:3306/news}}
         * */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
