package cn.gezhi.service;

import cn.gezhi.po.Auditor;
import cn.gezhi.po.Customer;
import com.github.pagehelper.PageInfo;

public interface AuditorService {
    //权证员登录
    Auditor login(String username);
    //显示客户信息
    PageInfo<Customer> showCustomer(int id, int pageNum, int pageSize);
}
