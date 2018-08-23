package cn.gezhi.controller;

import cn.gezhi.po.Auditor;
import cn.gezhi.po.Customer;
import cn.gezhi.service.AuditorService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hzl
 * @date 2018.08.22
 * Auditor控制器
 */
@Controller
@RequestMapping("/auditor")
public class AuditorHandler {
    @Autowired
    private AuditorService service;
    @Autowired
    private HttpServletRequest request;

    private static final int PAGESIZE = 10;
    //跳转权证员登录页面
    @RequestMapping("/login")
    public String login(){ return "auditorLogin";}
    //权证员登录
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String doLogin(String username, String password, Model model){
        Auditor auditor = service.login(username);
        if (auditor == null){
            model.addAttribute("msg","用户不存在");
            return "auditorLogin";
        }else {
            if (username.equals(auditor.getUsername()) && password.equals(auditor.getPassword())){
                model.addAttribute("auditor",auditor);
                return "/showCustomer";
            }else {
                model.addAttribute("msg","用户名或密码错误");
                return "auditorLogin";
            }
        }
    }
    //显示客户数据
    @RequestMapping("/showCustomer")
    public String showCustomer(int id, Model model){
        int pageNum = 1;
        if (request.getParameter("pageNum") == null || "".equals(request.getParameter("pageNum")) || "0".equals(request.getParameter("pageNum"))){
            pageNum = 1;
        }else {
            pageNum = Integer.parseInt(request.getParameter("pageNum"));
        }
        PageInfo<Customer> pageInfo = service.showCustomer(id,pageNum,PAGESIZE);
        model.addAttribute("pageInfo",pageInfo);
        return "showCustomerByAuditor";
    }
}
