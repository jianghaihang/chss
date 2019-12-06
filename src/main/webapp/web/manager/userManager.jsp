<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/26
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <script type="text/javascript" src="../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../easyui/easyui-lang-zh_CN.js"></script>

    <link rel="stylesheet" href="../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="../../easyui/themes/icon.css">

    <%--<script type="text/javascript" src="west.js"></script>--%>

</head>
<body>
    <div id="user_manager" class="easyui-layout" style="width:100%;height:100%;">

        <!-- 左区域 -->
        <div data-options="region:'west',title:'组织机构',split:true,noheader:true" style="width:200px;background:#eee;">
            <span class="west_menu"></span>
        </div>

        <!-- 中区域 -->
        <div data-options="region:'center',title:'业务用户',noheader:true" style="padding:5px;background:#eee;">

            <iframe scrolling='auto' frameborder='0' src='/web/manager/center/main.jsp' style='width:100%; height:100%; display:block;'></iframe>

        </div>

    </div>

    <!-- 行政区划菜单 -->
    <script type="text/javascript">
        $(".west_menu").tree({
            url: "../../areas/area_menu",
            lines: true,
            animate: true,
            onLoadSuccess: function (node, data) {
                if (data) {

                    $(data).each(function (index, value) {

                        if (this.state == 'closed') {

                            $('#west_menu').tree('expandAll');
                        }
                    });

                    // $.messager.show({
                    //
                    //     title: "通知",
                    //     msg: "加载成功！area"
                    // })
                }
            },
            onLoadError: function (arguments) {

                $.messager.show({
                    title: "严重错误",
                    msg: "加载失败area"
                });
            }
        });
    </script>

</body>

</html>
