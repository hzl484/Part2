package cn.gezhi.controller;

import cn.gezhi.po.Customer;
import cn.gezhi.po.Salesman;
import cn.gezhi.service.SalesmanService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author hzl
 * @date 2018.8.22
 * Salesman控制器
 */
@Controller
@RequestMapping("/salesman")
public class SalesmanHandler {
    @Autowired
    private SalesmanService service;
    @Autowired
    private HttpServletRequest request;

    private static final int PAGESIZE = 10;

    @RequestMapping("/login")
    public String login(){return "salesmanLogin";}

    //      业务员登录
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(String username, String password, Model model){
        Salesman salesman = service.salesManLogin(username);
        if (salesman == null){
            model.addAttribute("msg","用户不存在");
            return "salesmanLogin";
        }else {
            if (username.equals(salesman.getUsername()) && password.equals(salesman.getPassword())){
                model.addAttribute("salesman",salesman);
                return "/showCustomer";
            }else {
                model.addAttribute("msg","用户名或密码错误");
                return "salesmanLogin";
            }
        }

    }
    //      显示客户列表
    @RequestMapping("/showCustomer")
    public String showCustomer(int id, Model model){
        int pageNum = 1;
        if(request.getParameter("pageNum")==null || "".equals(request.getParameter("pageNum")) || "0".equals( request.getParameter("pageNum"))){
            pageNum=1;
        }else{
            pageNum=Integer.parseInt(request.getParameter("pageNum"));
        }
        PageInfo<Customer> pageInfo = service.showCustomer(id,pageNum,PAGESIZE);
        model.addAttribute("pageInfo",pageInfo);
        return "showCustomerBySalesman";
    }
    //跳转添加客户数据
    @RequestMapping("/addCustomer")
    public String add(){ return "addCustomerBySalesman"; }

    //添加客户数据
}
