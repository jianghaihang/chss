<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/23
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.lang.String" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>公共卫生系统</title>
    <link rel="icon" href="img/favicon.ico">
<%--<link rel="shortcut icon" href="img/kiss4.png">--%>
    <%--<link rel="bookmark" href="img/kiss4.png">--%>
    <script type="text/javascript" src="../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../easyui/easyui-lang-zh_CN.js"></script>

    <link rel="stylesheet" href="../easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="../easyui/themes/icon.css">

    <link rel="stylesheet" type="text/css" href="main/north/north.css">
    <link rel="stylesheet" type="text/css" href="main/west/west.css">

    <script type="text/javascript" src="main/center/center.js"></script>
    <script type="text/javascript" src="main/west/west.js"></script>
    <script type="text/javascript" src="main/west/main.js"></script>

    <!-- 计时器 -->
    <%--<script type="text/javascript" src="utils/main_data.js"></script>--%>
</head>
<body class="easyui-layout">

    <%
        String username = (String) session.getAttribute("username");
        String perType = (String) session.getAttribute("perType");
    %>

    <!-- 上层 -->
    <div id="north_main" data-options="region:'north',split:false,border:false,noheader:true"
            style="background-image: url('img/indexHead.png');background-size: 100% 100%;">

        <div id="north_sys_name"></div>

        <div id="north_change_out" >
            <a id="north_change_a" href="javascript:location.href='login/logout.jsp';" title="切换账号" >
                <div id="north_change" style="background-image: url('img/chang.png');background-size: 100% 100%;"></div>
            </a>

            <a id="north_out_a" title="退出系统" style="text-decoration: none;">
                <div id="north_out" style="background-image: url('img/Exit.png');background-size: 100% 100%;">
                </div>
            </a>
        </div>

        <div id="north_user_data" >
            <div id="north_user"  style="text-align: center;color: #000000;font-size: 16px;padding-top: 7px;"><!-- padding: 15px 0 0 0; -->
                <span style="font-size: 16px;"><%= perType%></span>
                <span style="font-size: 16px;color: #0000ff;font-weight: bold;">【 <%= username%> 】</span>
            </div>
            <div id="north_data"  style="color: #000000;font-size: 16px;">
                <span id="north_show_time">计时器</span>
            </div>
        </div>
    </div>

    <!-- 左层 -->
    <div id="west_main" data-options="region:'west',title:'系统菜单栏',split:false,border:true,iconCls:'icon-system'">

        <div id="west_accordion" class="easyui-accordion" data-options="border: false,selected:'false'">

            <!-- 系统设置 -->
            <div title="系统设置" id="system" style="padding: 10px;overflow: hidden;">
                <div id="system_menu"></div>
            </div>

            <!-- 健康档案 -->
            <div title="健康档案" id="health">
                 <div id="heal_menu"></div>
            </div>

            <div title="高血压" id="blood" >
                <div id="blood_menu"></div>
            </div>


            <div title="II型糖尿病" id="diabetes">
                <div id="diabetes_menu"></div>
            </div>


            <div title="严重精神障碍" id="psychosis">
                <div id="psychosis_menu"></div>
            </div>


            <div title="老年人保健" id="elderly">
                <div id="elderly_menu"></div>
            </div>


            <div title="孕产妇健康" id="maternal">
                <div id="maternal_menu"></div>
            </div>


            <div title="儿童健康" id="children">
                <div id="children_menu"></div>
            </div>


            <div title="传染病及突发" id="infectious">
                <div id="infectious_menu"></div>
            </div>


            <div title="公卫融合" id="pub_health">
                <div id="pub_health_menu"></div>
            </div>


            <div title="肺结核" id="tuberculosis">
                <div id="tuberculosis_menu"></div>
            </div>


            <div title="免疫接种" id="immunization">
                <div id="immunization_menu"></div>
            </div>


            <div title="健康教育" id="heal_education">
                <div id="heal_education_menu"></div>
            </div>


            <div title="卫生监督" id="heal_supervision">
                <div id="heal_supervision_menu"></div>
            </div>

        </div>
    </div>

    <!-- 中间层-->
    <div id="center_main" data-options="region:'center',split:true,border:true" style="background:#eee;">
        <div id="center_page">
            <div title="系统主页" data-options="iconCls:'icon-house'" style="background-image: url('img/pick_nologo.png');background-size: 100% 100%;">
            </div>
        </div>
    </div>

    <!-- 下层 -->
    <div data-options="region:'south',title:'South Title',split:false,border:true,noheader:true"
         style="height:100px;background: rgb(238, 238, 238);height: 30px;text-align: center;">
        <div style="">
            <span style="font-size: 15px;font-weight: bold;font-family: 方正姚体;color: #0000ff;margin-top: 10px;">
                &COPY; 2019 - 2019 杭州小舵个人工作室 (^_^) 木马医生 (^_^)
            </span>
        </div>
    </div>

    <!-- 右层-->
    <%--<div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true,border:true"--%>
    <%--style="width:100px;"></div>--%>
</body>
</html>