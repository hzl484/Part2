package cn.gezhi.service.ServiceImpl;

import cn.gezhi.mapper.CustomerMapper;
import cn.gezhi.po.Customer;
import cn.gezhi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper mapper;
    @Override
    public Customer getCustomer(String username) {
        return mapper.selectCustomerByUsername(username);
    }

    @Override
    public Customer getCustomer(String username, String password) {
        return mapper.selectCustomer(username,password);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return mapper.selectByExample();
    }

    @Override
    public int addCustomer(Customer customer) {
        return mapper.insert(customer);
    }

    @Override
    public int deleteCustomer(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int changeCustomer(Customer customer) {
        return mapper.updateByPrimaryKey(customer);
    }
}
