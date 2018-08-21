package cn.gezhi.service;

import cn.gezhi.po.Customer;
import cn.gezhi.po.Salesman;

import java.util.List;

public interface SalesmanService {
    //业务员登录
    Salesman salesManLogin(String username,String password);
    //业务员界面显示客户列表
    List<Customer> showCustomer();

}
