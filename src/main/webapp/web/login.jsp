<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/23
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登录</title>
    <link rel="icon" href="img/favicon.ico">
    <%--<link rel="shortcut icon" href="img/kiss4.png">--%>
    <%--<link rel="bookmark" href="img/kiss4.png">--%>
    <script type="text/javascript" src="../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../easyui/easyui-lang-zh_CN.js"></script>

    <link rel="stylesheet" href="../easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="../easyui/themes/icon.css">

    <!-- 用户登录 -->
    <%--<meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">--%>
    <%--<meta name="author" content="Vincent Garreau" />--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">--%>
    <link rel="stylesheet" type="text/css" href="login/reset.css">
    <link rel="stylesheet" type="text/css" href="login/style.css">
    <script type="text/javascript" src="login/login.js"></script>

</head>
<body>
<div id="particles-js">
    <div class="login" style="background-image: url('login/ChineseStyle.png');background-size: 100% 100%;">
        <form id="form_login">

            <div class="login-top">
                登录
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="login/name.png"/></div>
                <div class="login-center-input">
                    <input type="text" id="account" name="account" placeholder="请输入您的用户账号" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户账号'"/>
                    <div class="login-center-input-text">用户账号</div>
                </div>
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="login/password.png"/></div>
                <div class="login-center-input">
                    <input type="password" id="password" name="password" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
                    <div class="login-center-input-text">密码</div>
                </div>
            </div>
            <div class="login-button">
                登陆
            </div>
            <div class="sweep-button">
                扫码登录
            </div>
        </form>
    </div>
    <!-- 图片旋转 -->
    <%--<div class="sk-rotating-plane"></div>--%>
</div>

<!-- 图片翻转 -->
<script  src="login/particles.min.js"></script>
<script  src="login/app.js"></script>
</body>
</html>



































