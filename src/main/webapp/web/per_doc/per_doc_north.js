
$(function () {

    $("#blood_main").layout({
        fit: true
    });

    // 居民属地
    $("#local").combotree({
        data:[
            {
                id:"0",
                text: "杭州市",
                children: [
                    {
                        id:"1",
                        text:"江干区"
                    },{
                        id:"2",
                        text:"西湖区"
                    },{
                        id:"3",
                        text:"滨江区"
                    },{
                        id:"4",
                        text:"余杭区"
                    }
                ]
            }
        ],
        panelWidth: 150,
        panelHeight: 135,
        editable: false,
        hasDownArrow: false
    });

    // 档案号类别
    $("#type").switchbutton({
        width: 70,
        height: 22,
        onText: "新档",
        offText: "旧档",
        checked: true
    });

    // 档案编号
    $("#num").textbox({

    });

    // 查询
    $("#search").linkbutton({
        text: "查询",
        iconCls: "icon-search"
    });

    // 姓名
    $("#name").textbox({

    });

    // 档案状态
    $("#state").combobox({
        valueField: "sta_id",
        textField: "sta_name",
        data:[
            {
                sta_id:"1",
                sta_name:"活动"
            },{
                sta_id:"2",
                sta_name:"注销"
            },{
                sta_id:"3",
                sta_name:"迁出"
            },{
                sta_id:"4",
                sta_name:"死亡"
            }
        ],
        panelWidth: 90,
        panelHeight: 135,
        editable: false,
        hasDownArrow: false
    });

    // 出生日期
    $("#birthday").datetimebox({
        editable: false
    });

    // 至
    $("#to").datetimebox({
        editable: false
    });

    // 健康卡/身份证
    $("#id_num").textbox({

    });

    // 管档机构
    $("#org").combotree({
        data:[
            {
                id:"0",
                text: "杭州市卫生局",
                children: [
                    {
                        id:"1",
                        text:"下沙卫生服务中心"
                    },{
                        id:"2",
                        text:"西湖卫生服务中心"
                    },{
                        id:"3",
                        text:"杭州第一人民医院"
                    },{
                        id:"4",
                        text:"杭州市中医院"
                    }
                ]
            }
        ],
        panelWidth: 200,
        panelHeight: 135,
        editable: false,
        hasDownArrow: false
    });

    // 管档医生
    $("#doctor").combobox({
        valueField: "doc_id",
        textField: "doc_name",
        data:[
            {
                doc_id:"1",
                doc_name:"姜小舵"
            },{
                doc_id:"2",
                doc_name:"法海"
            },{
                doc_id:"3",
                doc_name:"鹿晗"
            },{
                doc_id:"4",
                doc_name:"关晓彤"
            }
        ],
        panelWidth: 90,
        panelHeight: 135,
        editable: false,
        hasDownArrow: false
    });

    // 重置
    $("#rest").linkbutton({
        text: "重置",
        iconCls: "icon-no"
    });


    /**
     * 工具类
     */

    // 读健康卡
    $("#health_card").linkbutton({
        width: 100,
        height: 17,
        plain: true,
        iconCls: "icon-plfz"
    });

    // 新增
    $("#add").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-zlfa",
        onClick: function () {
            $("#add_new").dialog({
                width: 850,
                height: 580,
                title: '新增个人档案',
                iconCls: 'icon-add-new',
                draggable: false,
                content: "<iframe src='add/add.html' seamless='true' width='100%' height='100%'></iframe>"
            });
        }
    });

    // 编辑
    $("#update").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-hzdmb"
    });

    // 删除
    $("#delete").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-ygxwh"
    });

    // 签约
    $("#signed").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-ssjl"
    });

    // 体检
    $("#physical").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-jyyqwh"
    });

    // 服务记录
    $("#ser_log").linkbutton({
        width: 100,
        height: 17,
        plain: true,
        iconCls: "icon-bcjl"
    });

    // 档案调出
    $("#callout").linkbutton({
        width: 100,
        height: 17,
        plain: true,
        iconCls: "icon-mbwh"
    });

    // 状态变更
    $("#modify").linkbutton({
        width: 100,
        height: 17,
        plain: true,
        iconCls: "icon-hzfz"
    });

    // 档案调阅器
    $("#consult").linkbutton({
        width: 120,
        height: 17,
        plain: true,
        iconCls: "icon-hzxxcx"
    });

    // 导出
    $("#export").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-tmhzbd"
    });

    // 履历
    $("#record").linkbutton({
        width: 70,
        height: 17,
        plain: true,
        iconCls: "icon-dictionary"
    });
});