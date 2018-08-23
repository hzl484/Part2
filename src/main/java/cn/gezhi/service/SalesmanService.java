package cn.gezhi.service;

import cn.gezhi.po.Customer;
import cn.gezhi.po.Salesman;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SalesmanService {
    //业务员登录
    Salesman salesManLogin(String username);
    //业务员界面显示客户列表
    PageInfo<Customer> showCustomer(int id, int pageNum, int pageSize);

}
