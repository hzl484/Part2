<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/17
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录后台管理系统--模板之家 www.cssmoban.com</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="/js/jquery.js"></script>
    <script src="/js/cloud.js" type="text/javascript"></script>

    <script language="javascript">
        $(function(){
            $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
            $(window).resize(function(){
                $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
            })
        });
    </script>

</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



<div id="mainBody">
    <div id="cloud1" class="cloud"></div>
    <div id="cloud2" class="cloud"></div>
</div>


<div class="logintop">
    <span>欢迎登录后台管理界面平台</span>
    <ul>
        <li><a href="#">回首页</a></li>
        <li><a href="#">帮助</a></li>
        <li><a href="#">关于</a></li>
    </ul>
</div>

<div class="loginbody">

    <span class="systemlogo" style="margin-top: 65px"></span>
    <form id="add_form" method="post">
        <div class="formtitle"><span>新增客户信息</span></div>
        <ul class="forminfo" style="padding-left: 460px">
            <li><label>用户名</label><input name="username" type="text" class="dfinput" /><i>用户名不能为空</i></li>
            <li><label>密码</label><input name="password" type="text" class="dfinput" /><i>密码不能空</i></li>
            <li><label>姓名</label><input name="name" type="text" class="dfinput" /><i>姓名不能空</i></li>
            <li><label>身份证号</label><input name="idCardNum" type="text" class="dfinput" /><i>身份证号不能空</i></li>
            <li><label>手机号码</label><input name="mobile" type="text" class="dfinput" /><i>手机号码不能空</i></li>
            <li><label>社保卡号</label><input name="socialsecurity" type="text" class="dfinput" /><i>社保卡号不能为空</i></li>
            <li><label>&nbsp;</label><input name="" type="button" class="btn" value="确认新增" onclick="addSubmit()" /></li>
        </ul>
    </form>
</div>
<div class="loginbm">版权所有  2013  .com 仅供学习交流，勿用于任何商业用途</div>
</body>
</html>
<script language="JavaScript" src="/js/jquery.js"></script>
<script>
    function addSubmit() {
        $.ajax({
            dataType: "json",
            type: "post",
            url: "/Customer/register",
            data: $("#add_form").serialize(),
            success: function (msg) {
                if (msg === 1) {
                    alert("数据添加成功")
                    window.open("/employee/show","_self")
                } else {
                    alert("数据添加失败")
                }
            }
        })
    }
</script>