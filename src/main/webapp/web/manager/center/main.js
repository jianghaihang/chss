
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
       iconCls: "icon-add-new"
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
        value: "查询",
        iconCls: 'icon-search'
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

    $("#ro_combo").combotreegrid({
        width: 160,
        height: 25
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
            field: "userId",
            title: "用户编号",
            // width: "100"
        },{
            field: "userName",
            title: "医生姓名",
            // width: "100"
        },{
            field: "age",
            title: "医生年龄"
        },{
            field: "gender",
            title: "医生性别"
        },{
            field: "phone",
            title: "医生电话"
        },{
            field: "address",
            title: "医院地址"
        },{
            field: "role",
            title: "医生权限"
        },{
            field: "isDelete",
            title: "账号状态"
        },{
            field: "modifiedName",
            title: "账号操作"
        }
        ]],
        align: "center",
        pagination: true,
        striped: true,// 行条纹化
        singleSelect: true,// 只允许选择一行
        rownumbers: true
    })
});








































