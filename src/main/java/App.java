import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        //获取Ioc容器
//        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//        //获取bean
//        BookService bookService= (BookService) ctx.getBean("bookService");
//        bookService.save();

//        //获取Ioc容器
//        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//        //获取bean
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
////        userDao.save();
//        System.out.println(userDao);
//        System.out.println(userDao1);

        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }

}
