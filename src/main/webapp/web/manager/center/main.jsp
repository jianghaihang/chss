<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/27
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <script type="text/javascript" src="../../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../../easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../../easyui/easyui-lang-zh_CN.js"></script>

    <link rel="stylesheet" href="../../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" href="../../../easyui/themes/icon.css">

    <%--<link rel="stylesheet" href="main.css">--%>
    <%--<script type="text/javascript" src="main.js"></script>--%>
    <%--<script type="text/javascript" src="incident.js"></script>--%>
    <%-- CSS样式 --%>
    <style type="text/css">

        /*定义datagrid的body背景*/
        .datagrid-body{
            background: #eeeeee;
        }
        /*定义每行的高度*/
        .datagrid-row{
            height: 38px;
        }
        /*定义数据头部导航栏背景*/
        .datagrid-header{
            background: #E0ECFF;
        }

        #main{
            width:600px;
            height:400px;
        }

        /*北部*/
        #north{
            height: 70px;
            background:#eee;
            font-weight: bold;
            font-size: 15px;
            font-family: 方正姚体;
        }

        /*
            上层：
                用户名，管理员，查询
        */
        #user{
            padding-top: 6px;
            padding-left: 5px;
        }

        #username{
            width: 250px;
            position: relative;
            display: inline-block;
        }

        #manager{
            width: 250px;
            position: relative;
            display: inline-block;
        }

        #search{
            width: 100px;
            position: relative;
            display: inline-block;
        }

        /*
            下区域：
                用户账号，用户角色，重置
        */
        #property{
            padding-top: 5px;
            padding-left: 5px;
            position: relative;
        }

        #account{
            width: 250px;
            position: relative;
            display: inline-block;
        }

        /*用户角色*/
        #role{
            width: 250px;
            position: relative;
            display: inline-block;
        }

        #rest{
            width: 100px;
            position: relative;
            display: inline-block;
        }

        #center{
            padding:5px;
            background:#eee;
        }


    </style>
</head>
<body>

    <div id="main" data-options="fit:true">

        <div id="north" data-options="region:'north',title:'北区域',split:false,noheader:true" >

            <!--
                上层：
                    用户名，管理员，查询
            -->
            <div id="user">

                <div id="username">
                    <span>用户姓名&nbsp;</span>
                    <input id="name_text">
                </div>

                <div id="manager">
                    <span>管理员</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input id="mag_switch" data-options="onText:'Yes',offText:'No'">
                </div>

                <div id="search">
                    <span id="sear_link" onclick="search();" >查询</span>
                </div>

            </div>

            <!--
                下层：
                    用户账号，用户角色，重置
            -->
            <div id="property">

                <div id="account">
                    <span>用户账号&nbsp;</span>
                    <input id="acc_text">
                </div>

                <div id="role">
                    <span>用户角色&nbsp;</span>
                    <select id="ro_combobox" ></select>
                </div>

                <div id="rest">
                    <span id="rest_link" onclick="reset();">重置</span>
                </div>

            </div>
        </div>

        <div id="center" data-options="region:'center',title:'业务用户一览',tools:'#tools'" >

            <!-- 用户数据列表 -->
            <div id="all_user" style="background: #eee;"></div>

        </div>

    </div>

    <!--工具栏-->
    <div id="tools" style="font-size: 12px;">
        <div id="add"><span >新增</span></div>
        <div id="update"><span >修改</span></div>
        <div id="delete"><span >删除</span></div>
        <div id="lock" ><span >锁定/解锁</span></div>
    </div>

    <!-- 用户添加 -->
    <div id="addNew">
        <div id="add-user"></div>
    </div>

    <%-- 菜单JS --%>
    <script type="text/javascript">

        $(function () {

            $("#main").layout({
            });

            /**
             * 工具栏
             */
            $("#add").linkbutton({
                width: 70,
                height: 17,
                plain: true,
                iconCls: "icon-add-new",
                onClick:function () {

                    $("#add-user").dialog({
                        title: "新增用户",
                        width: 800,
                        height: 530,
                        resizable: false,
                        draggable: false,
                        modal: true,
                        iconCls: "icon-add-new",
                        toolbar: "#add_tools",
                        content: "<iframe scrolling='auto' frameborder='0' src='/web/manager/center/add/addNew.html' style='width:100%; height:100%; display:block;'></iframe>"
                    });

                }
            });

            $("#update").linkbutton({
                width: 70,
                height: 17,
                plain: true,
                iconCls: "icon-edit-new"
            });

            $("#delete").linkbutton({
                width: 70,
                height: 17,
                plain: true,
                iconCls: "icon-delete-new"
            });

            $("#lock").linkbutton({
                width: 100,
                height: 17,
                plain: true,
                iconCls: "icon-login"
            });

            /*
                上区域：
                    用户名，管理员，查询
             */
            $("#name_text").textbox({
                width: 150,
                height: 25,
                prompt: "Please username"
            });

            $("#mag_switch").switchbutton({
                width: 60,
                height: 20,
                handleWidth: 20
            });

            $("#sear_link").linkbutton({
                width: 60,
                height: 26,
                // iconCls: 'icon-search'
            });

            /**
             * 下区域：
             *      用户账号，用户角色，重置
             */
            $("#acc_text").textbox({
                width: 150,
                height: 25,
                prompt: "Please account"
            });

            /**
             *  用户角色多选框
             */
            $("#ro_combobox").combobox({
                url: "/roles/role",
                width: 160,
                height: 25,
                value: "Check Role",
                editable: false,
                multiple: true,
                valueField: "roleId",
                textField: "roleName",
                onShowPanel: function () {

                    $("#ro_combobox").combobox({
                       value: ""
                    });

                    // $("#role_menu").appendTo($("#ro_combobox").combobox('panel'));
                },
                onHidePanel: function () {

                    var vals = $("#ro_combobox").combobox('getValues');

                    if (vals == ""){
                        $("#ro_combobox").combobox({
                            value: "Check Role"
                        });
                    }
                }
            });

            $("#rest_link").linkbutton({
                width: 60,
                height: 26
            });

            /**
             * 业务用户一览
             */

            $("#all_user").datagrid({
                fit: true,
                columns: [[
                    {
                        field: "check",
                        title: "复选框",
                        checkbox: true
                    },{
                        field: "userName",
                        title: "医生姓名",
                        align: "center",
                    },{
                        field: "account",
                        title: "医生账号",
                        align: "center",
                    },{
                        field: "doc_title",
                        title: "医生职称",
                        align: "center",
                    },{
                        field: "sub_dept",
                        title: "所属科室",
                        align: "center",
                    },{
                        field: "address",
                        title: "医疗机构",
                        align: "center",
                    },{
                        field: "role",
                        title: "医生权限",
                        align: "center",
                    },{
                        field: "isDelete",
                        title: "账号状态",
                        align: "center",
                    },{
                        field: "modifiedName",
                        title: "账号操作",
                        align: "center",
                    }
                ]],
                pagination: true,
                striped: true,// 行条纹化
                singleSelect: true,// 只允许选择一行
                rownumbers: true,
            })
        });

        /**
         * 当页面加载的时候调用函数
         */
        $(document).ready(function(){

            // showRoleMenu();
        });

        /**
         * 获取用户角色菜单
         */
        function showRoleMenu() {
            var url = "/roles/role";

            $.ajax({
                url: url,
                type: "POST",
                dataType: "json",
                success: function (json) {

                    if (json.state != 200) {

                        $.messager.alert('数据异常', '您要查找的数据不存在！', 'error');
                    } else {

                        $("#ro_combobox").empty();

                        $.messager.show({
                            title: "加载成功！",
                            msg: "用户角色列表加载完毕！共：" + json.rows.length + " 条数据！"
                        });

                        var list = json.rows;

                        for (var i = 0; i < list.length; i++) {

                            // console.log(list[i].roleName);

                            // var html = '<input type="checkbox" id="{role_id}" name="role" value="{role_val}">'
                            //             + '<label for="{role_id}">{role_name}</label><br>';

                            var html = '<option id="{role_id}">{role_name}</option>';

                            html = html.replace('{role_name}', list[i].roleName)
                                .replace('{role_id}', list[i].roleId);

                            // var head = '<input type="checkbox" id="0" name="role" value="0">请选择<br>';

                            // console.log(html);

                            $("#ro_combobox").append(html);

                            // $("#ro_combobox").innerHTML(html);

                        }
                    }
                }

            });
        };

    </script>

    <!-- 添加用户保存 -->
    <script type="text/javascript">

        function save() {

            var name_info = $("#name-info").textbox('getText');
            var user_pwd = $("#user-pwd").val();
            var user_account = $("#user-account").textbox('getText');
            var user_info = $("#user-info").textbox('getText');
            var sub_org = $("#sub-org").combotree('getText');
            var business_role = $("#business-role").combobox('getValue');
            var manager = $("#manager").val();
            var staff_code = $("#staff-code").textbox('getText');
            var id_number = $("#id-number").textbox('getText');
            var phone = $("#phone").textbox('getText');
            var land_line = $("#land-line").textbox('getText');
            var alpha_bre_code = $("#alpha-bre-code").textbox('getText');
            var person_type = $("#person-type").combobox('getText');
            var sub_departments = $("#sub-departments").combobox('getValue');
            var doctor_title = $("#doctor-title").combobox('getText');
            var health_auth = $("#health-auth").combobox('getText');
            var doctor_code = $("#doctor-code").textbox('getText');

            if (name_info == '' || user_pwd == '' || user_account == '' || staff_code == ''){

                $("#name-tip").show();
                $("#pwd-tip").show();
                $("#acc-tip").show();
                $("#staff-tip").show();

                // $.messager.alert('基本信息','basic_info: ' + name_info + ' | ' + user_pwd + ' | ' + user_account + ' | ' + staff_code,'icon-cancel','question');

                if (name_info != ''){
                    $("#name-tip").hide();
                }
                if (user_pwd != ''){
                    $("#pwd-tip").hide();
                }
                if (user_account != ''){
                    $("#acc-tip").hide();
                }
                if (staff_code != ''){
                    $("#staff-tip").hide();
                }

                $.messager.show({
                    title: "保存失败",
                    msg: "您有必填项没有输入！",
                    timeout: 100,
                    showSpeed: "fade",
                    width: 180,
                    height: 100,
                    style: {
                        top: 50,
                        left: 700
                    }
                });

            }

            if(person_type == '全科医生' || person_type == '住院医师' || person_type == '门诊医师') {

                $("#code-tip").show();

                if (doctor_code != '') {

                    $("#code-tip").hide();

                }else {

                    // $.messager.alert('基本信息','doc_code: ' + doctor_code,'icon-cancel','question');

                    $.messager.show({
                        title: "保存失败",
                        msg: "您有必填项没有输入！",
                        timeout: 100,
                        showSpeed: "fade",
                        width: 180,
                        height: 100,
                        style: {
                            top: 50,
                            left: 700
                        }
                    });
                }
            }

            if (name_info != '' && user_pwd != '' && user_account != '' && staff_code != '') {

                $("#name-tip").hide();
                $("#pwd-tip").hide();
                $("#acc-tip").hide();
                $("#staff-tip").hide();

                if (person_type == '全科医生' && person_type == '住院医师' && person_type == '门诊医师') {

                    if (doctor_code != '') {
                        $("#code-tip").hide();
                    }
                }

                // 将多参数以Json对象的字符串形式传给Java后端
                var prams = [{
                    "name_info": name_info,
                    "user_pwd": user_pwd,
                    "user_account": user_account,
                    "user_info": user_info,
                    "sub_org": sub_org,
                    "business_role": business_role,
                    "manager": manager,
                    "staff_code": staff_code,
                    "id_number": id_number,
                    "phone": phone,
                    "alpha_bre_code": alpha_bre_code,
                    "person_type": person_type,
                    "sub_departments": sub_departments,
                    "doctor_title": doctor_title,
                    "health_auth": health_auth,
                    "doctor_code": doctor_code,
                    "land_line": land_line
                }];

                // prams[0] = name_info;
                // prams[1] = user_pwd;
                // prams[2] = user_account;
                // prams[3] = sub_org;
                // prams[4] = business_role;
                // prams[5] = manager;
                // prams[6] = staff_code;
                // prams[7] = id_number;
                // prams[8] = phone;
                // prams[9] = land_line;
                // prams[10] = alpha_bre_code;
                // prams[11] = person_type;
                // prams[12] = sub_departments;
                // prams[13] = doctor_title;
                // prams[14] = health_auth;
                // prams[15] = doctor_code;

                // for (var i = 0; i < prams.length; i ++){
                //
                //     console.log(i + ' = ' + prams[i] + ' | ');
                //
                // }

                // console.log(JSON.stringify(prams));
                //JSON.stringify(prams)
                // ${pageContext.request.contextPath }：获取url请求路径

                $.ajax({
                    url: "/users/reg",
                    type: "POST",
                    data: JSON.stringify(prams),
                    dataType: "json",
                    contentType: "application/json;charset-UTF-8",
                    success: function (json) {
                        if (json.state == '200') {

                            $.messager.show({
                                title: "添加用户",
                                msg: "添加成功"
                            });
                        }
                    }
                });
            }
        }

    </script>

    <%-- 用户数据查询 --%>
    <script type="text/javascript">

        function search() {

            var username = $("#name_text").val();
            var account = $("#acc_text").val();
            var role = $("#ro_combobox").combobox('getValues');

            if (role == null) {

                role = "";
            }
            if (role == 'Check Role') {

                role = "";
            }

            // alert("username="+ username + ", account=" + account + ", role=" + role);

            var url = "/accounts/user_account";

            var data = "username=" + username + "&account=" + account + "&role=" + role;

            $("#all_user").datagrid({
                url: url + "?" + data
            });
        }
    </script>

    <%-- 重置 --%>
    <script type="text/javascript">

        function reset() {

            $("#ro_combobox").combobox('setValues','');
            $("#acc_text").textbox('clear');
            $("#name_text").textbox('clear');
        };

    </script>
</body>
</html>






































