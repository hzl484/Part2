package cn.gezhi.service.impl;

import cn.gezhi.mapper.AuditorMapper;
import cn.gezhi.po.Auditor;
import cn.gezhi.po.Customer;
import cn.gezhi.service.AuditorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditorServiceImpl implements AuditorService {
    @Autowired
    private AuditorMapper mapper;
    //权证员登录
    @Override
    public Auditor login(String username) {
        return mapper.selectByUsername(username);
    }
    /**
     * 分页显示客户信息列表
     * @param id            权证员id
     * @param pageNum       当前页数
     * @param pageSize      每页显示条数
     * @return              分页后的pageInfo实例
     */
    @Override
    public PageInfo<Customer> showCustomer(int id, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Customer> list = mapper.selectByAuditor(id);
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
