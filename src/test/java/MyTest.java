import cn.gezhi.po.Customer;
import cn.gezhi.po.Salesman;
import cn.gezhi.service.AuditorService;
import cn.gezhi.service.SalesmanService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring-placeholder.xml"})
public class MyTest {
    @Autowired
    private AuditorService service;
    @Test
    public void test1(){
        PageInfo<Customer> pageInfo = service.showCustomer(2,1,10);
        List<Customer> list = pageInfo.getList();
        for (Customer customer:list
             ) {
            System.out.println(customer);
        }
    }
//    @Test
////    public void test2(){
////        Salesman salesman = service.salesManLogin("zhangsan");
////        System.out.println(salesman);
////    }
}
