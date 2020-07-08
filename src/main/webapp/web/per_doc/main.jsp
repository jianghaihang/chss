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

    <script type="text/javascript" src="per_doc_north.js"></script>
    <script type="text/javascript" src="per_doc_center.js"></script>
    <link rel="stylesheet" href="per_doc_north.css">
    <style type="text/css">
        .datagrid-body{
            background: #eeeeee;
        }
        .datagrid-row{
            height: 38px;
        }
        .datagrid-header{
            background: #E0ECFF;
        }
    </style>
</head>
<body>
    <div id="blood_main" >
        <div id="north" data-options="region:'north',title:'North Title',split:false,noheader:true" style="width: 100%; height: 100px;background: #eee;" >
            <div id="pre">
                <table>
                    <tr id="one">
                        <td>居民属地</td>
                        <td id="local"></td>
                        <td>&nbsp;&nbsp;&nbsp;</td>
                        <td>档案号类别</td>
                        <td id="type"></td>
                        <td>&nbsp;&nbsp;&nbsp;</td>
                        <td>
                            <table>
                                <tr>
                                    <td>档案编号</td>
                                    <td id="num"></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr id="two">
                        <td>姓名</td>
                        <td id="name"></td>
                        <td></td>
                        <td>档案状态</td>
                        <td id="state"></td>
                        <td></td>
                        <td>
                            <table>
                                <tr>
                                    <td>出生日期</td>
                                    <td id="birthday"></td>
                                    <td>至</td>
                                    <td id="to"></td>
                                    <td>&nbsp;&nbsp;&nbsp;</td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr id="three">
                        <td>健康卡/身份证</td>
                        <td id="id_num"></td>
                        <td></td>
                        <td>管档机构</td>
                        <td id="org"></td>
                        <td></td>
                        <td>
                            <table>
                                <tr>
                                    <td>管理医生</td>
                                    <td id="doctor"></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </div>
            <div id="rear">
                <div id="search"></div>
                <br><br>
                <div id="rest"></div>
            </div>
        </div>

        <div id="center" data-options="region:'center',title:'档案一览',split:true,iconCls:'icon-large-chart',tools: '#tools'" style="background: #eee;">
            <div id="data_table">

            </div>
        </div>
    </div>

    <!--
        工具类
    -->
    <div id="tools" style="font-size: 12px;">
        <div id="health_card"><span >读健康卡</span></div>
        <div id="add">
            <span >新增</span>
            <div id="add_new"></div>
        </div>
        <div id="update"><span >编辑</span></div>
        <div id="delete"><span >删除</span></div>
        <div id="signed"><span >签约</span></div>
        <div id="physical"><span >体检</span></div>
        <div id="ser_log"><span >服务记录</span></div>
        <div id="callout" ><span >档案调出</span></div>
        <div id="modify"><span >状态变更</span></div>
        <div id="consult"><span >档案调阅器</span></div>
        <div id="export"><span >导出</span></div>
        <div id="record" ><span >履历</span></div>
    </div>
</body>
</html>
