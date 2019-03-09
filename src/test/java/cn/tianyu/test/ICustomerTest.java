package cn.tianyu.test;

import cn.tianyu.entitys.Customer;
import cn.tianyu.service.CustomerServiceImpl;
import cn.tianyu.service.ICustomerService;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.fail;

public class ICustomerTest {


    @Test
    public void fun1() throws ClassNotFoundException, SQLException {
		/*
		 * jdbc四大配置参数：
		 * > driverClassName：com.mysql.jdbc.Driver
		 * > url：jdbc:mysql://localhost:3306/mydb3
		 * > username：root
		 * > password：123
		 */
		/*
		 * 所有的java.sql.Driver实现类，都提供了static块，块内的代码就是把自己注册到
		 * DriverManager中！
		 */
		/*
		 * jdbc4.0之后，每个驱动jar包中，在META-INF/services目录下提供了一个名为java.sql.Driver的文件。
		 * 文件的内容就是该接口的实现类名称！
		 */
        Class.forName("com.mysql.jdbc.Driver");// 加载驱动类(注册驱动)
//		com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
//		DriverManager.registerDriver(driver);
        // 使用url、username、password，得到连接对象
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "19941008");
        System.out.println(con);
    }


    @Test
    public void testFindAllCustomer() {
        ICustomerService cs = new CustomerServiceImpl();
        List<Customer> list = cs.findAllCustomer();
        for(Customer c : list){
            System.out.println(c);
        }
    }

    @Test
    public void testSaveCustomer() {
        ICustomerService cs = new CustomerServiceImpl();
        Customer c = new Customer();
        c.setCust_name("dbutils customer");
        cs.saveCustomer(c);
    }

    @Test
    public void testUpdateCustomer() {
        fail("Not yet implemented");
    }

    @Test
    public void testDeleteCustomer() {
        fail("Not yet implemented");
    }

    @Test
    public void testFindCustomerById() {
        fail("Not yet implemented");
    }
}
