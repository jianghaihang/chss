<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/12/3
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>高血压管理</title>
    <script type="text/javascript" src="../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../easyui/easyui-lang-zh_CN.js"></script>

    <link rel="stylesheet" href="../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="../../easyui/themes/icon.css">

    <script type="text/javascript" src="blood_north.js"></script>
</head>
<body>
    <div id="blood_main" >
        <div id="north" data-options="region:'north',title:'North Title',split:true" style="width: 100%; height: 100px;" ></div>
        <div id="center" data-options="region:'center',title:'Center Title',split:true" ></div>
    </div>

    <%--<div id="cc" class="easyui-layout" style="width:600px;height:400px;">--%>
        <%--<div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>--%>
        <%--<div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>--%>
        <%--<div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>--%>
        <%--<div data-options="region:'west',title:'West',split:true" style="width:100px;"></div>--%>
        <%--<div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"></div>--%>
    <%--</div>--%>
</body>
</html>
