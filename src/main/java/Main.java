import com.example.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.Student;
public class Main {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Address address=(Address)context.getBean("address");
        System.out.println("城市:"+address.getCity());
        Student student=(Student)context.getBean("student");
        System.out.println("学生姓名："+student.getName());
        System.out.println("学生地址："+student.getAddress().getCity());
        System.out.println("--------------------------------");
        student.displayInfo();
    }
}