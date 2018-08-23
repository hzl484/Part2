<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/17
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>网站后台管理系统HTML模板--模板之家 www.cssmoban.com</title>
    <link href="../../css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../../js/jquery.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $("#add").click(function () {
                location.href="addUser";
            })
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>


</head>


<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">客户列表</a></li>
    </ul>
</div>

<div class="rightinfo">
    <div class="tools">
        <ul class="toolbar">
            <li><span id="add"><a href="/add_customer"><img src="/images/t01.png" /></a></span><a href="/add_customer">添加用户</a></li>
            <li><span id="sousuo"></span><input id="searchq" type="text" style="height: 22px" >&nbsp;<a href="" onclick="cli()">搜索</a></li>
        </ul>
    </div>
    <table class="tablelist">
        <thead>
        <tr>
            <th>ID<i class="sort"><img src="/images/px.gif" /></i></th>
            <th>用户名</th>
            <th>编号</th>
            <th>姓名</th>
            <th>手机</th>
            <th>贷款金额</th>
            <th>放款金额</th>
            <th>审批进度</th>
            <th>佣金</th>
            <th>退件备注</th>
            <th>客户关注等级</th>
            <th>客户详情</th>
        </tr>
        </thead>
        <tbody>
        <%--<td>201801</td>--%>
        <%--<td>张三</td>--%>
        <%--<td>15876656366</td>--%>
        <%--<td>511027372778338272</td>--%>
        <%--<td>2018-01-02 09:51:47</td>--%>
        <c:forEach items="${list}" var="it">
            <tr>
                <td>${it.id}</td>
                <td>${it.username}</td>
                <td>${it.number}</td>
                <td>${it.name}</td>
                <td>${it.mobile}</td>
                <td>${it.loanamount}</td>
                <td>${it.finalloan}</td>
                <td>${it.status}</td>
                <td>${it.commission}</td>
                <td>${it.note}</td>
                <td>${it.focuslevel}</td>
                <td><a href="/Customer/getAllCustomer" target="getAllCustomer">详情页面</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
            <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
            <li class="paginItem"><a href="javascript:;">1</a></li>
            <li class="paginItem current"><a href="javascript:;">2</a></li>
            <li class="paginItem"><a href="javascript:;">3</a></li>
            <li class="paginItem"><a href="javascript:;">4</a></li>
            <li class="paginItem"><a href="javascript:;">5</a></li>
            <li class="paginItem more"><a href="javascript:;">...</a></li>
            <li class="paginItem"><a href="javascript:;">10</a></li>
            <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>
</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
<script>
    function cli() {
        var qw = document.getElementById("searchq").value;
        alert(qw);
        document.location="http://localhost:8080/searchUser?name="+qw;
    }
</script>
</body>
</html>
