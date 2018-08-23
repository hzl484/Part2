<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/17 0017
  Time: 下午 6:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>新增客户信息</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置:</span>
    <ul class="placeul">
        <li><a href="main.jsp">首页</a></li>
        <li><a href="addCustomer.jsp">新增客户信息</a></li>
    </ul>
</div>

<div class="formbody">
    <form action="/Customer/addcustomer" method="post">
        <div class="formtitle"><span>新增客户信息</span></div>

        <ul class="forminfo">
            <li><label>姓名</label><input name="name" type="text" class="dfinput" /><i>姓名不能空</i></li>
            <li><label>编号</label><input name="number" type="text" class="dfinput" /><i>编号不能空</i></li>
            <li><label>贷款金额</label><input name="loanamount" type="text" class="dfinput" /><i>贷款金额不能空</i></li>
            <li><label>放款机构</label><input name="bankid" type="text" class="dfinput" /><i>放款机构不能空</i></li>
            <li><label>放款金额</label><input name="finalloan" type="text" class="dfinput" /><i>放款金额不能为空</i></li>
            <li><label>审批进度</label><input name="status" type="text" class="dfinput" /><i>审批进度不能为空</i></li>
            <li><label>佣金</label><input name="commission" type="text" class="dfinput" /><i>佣金不能为空</i></li>
            <li><label>退件备注</label><input name="note" type="text" class="dfinput" /><i>退件备注不能为空</i></li>
            <li><label>业务员</label><input name="salesmanid" type="text" class="dfinput" /><i>业务员不能为空</i></li>
            <li><label>客户关注等级</label><input name="focuslevel" type="text" class="dfinput" /><i>客户关注等级不能为空</i></li>
            <li><label>权证员</label><input name="auditorid" type="text" class="dfinput" /><i>权证员不能为空</i></li>
            <li><label>客户等级</label><input name="level" type="text" class="dfinput" /><i>客户等级不能为空</i></li>
            <li><label>办理时间</label><input name="date" type="text" class="dfinput" /><i>办理时间不能为空</i></li>
            <li><label>&nbsp;</label><input type="submit" class="btn" value="确认新增" /></li>
        </ul>
    </form>
</div>
</body>
</html>
