
$(function () {

    //系统设置
    $("#system_menu").tree({
        url: "../menus/menu_sys?menu_type=1",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#system_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: true,
                            href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 健康档案
    $("#heal_menu").tree({
        url: "../menus/menu_sys?menu_type=2",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#heal_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "个人档案管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 高血压管理
    $("#blood_menu").tree({
        url: "../menus/menu_sys?menu_type=3",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#blood_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 糖尿病管理
    $("#diabetes_menu").tree({
        url: "../menus/menu_sys?menu_type=4",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#diabetes_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 严重精神障碍管理
    $("#psychosis_menu").tree({
        url: "../menus/menu_sys?menu_type=5",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#psychosis_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 老年人保健
    $("#elderly_menu").tree({
        url: "../menus/menu_sys?menu_type=6",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#elderly_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 孕产妇健康
    $("#maternal_menu").tree({
        url: "../menus/menu_sys?menu_type=7",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#maternal_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 儿童健康
    $("#children_menu").tree({
        url: "../menus/menu_sys?menu_type=8",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#children_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 传染病及突发
    $("#infectious_menu").tree({
        url: "../menus/menu_sys?menu_type=9",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#infectious_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 公卫融合
    $("#pub_health_menu").tree({
        url: "../menus/menu_sys?menu_type=10",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#pub_health_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 肺结核
    $("#tuberculosis_menu").tree({
        url: "../menus/menu_sys?menu_type=11",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#tuberculosis_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 免疫接种
    $("#immunization_menu").tree({
        url: "../menus/menu_sys?menu_type=12",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#immunization_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 健康教育
    $("#heal_education_menu").tree({
        url: "../menus/menu_sys?menu_type=13",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#heal_education_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

    // 卫生监督
    $("#heal_supervision_menu").tree({
        url: "../menus/menu_sys?menu_type=14",
        lines: true,
        animate: true,
        selected: false,
        onLoadSuccess: function (node, data) {
            if (data) {

                $(data).each(function (index, value) {

                    if (this.state == 'closed') {

                        $('#heal_supervision_menu').tree('expandAll');
                    }
                });

                $.messager.show({
                    title: "通知",
                    msg: "加载成功！"
                })
            }
        },
        onClick: function (node) {

            // 判断标签是否存在
            if (node.text) {

                if ($("#center_page").tabs("exists",node.text)){

                    $("#center_page").tabs("select",node.text);
                }else {

                    if (node.text == "系统设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true
                        });
                    }else if(node.text == "全局字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 200
                        });
                    }else if (node.text == "机构字典设定") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else if (node.text == "业务用户管理") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            selected: false,
                            // href: "http://localhost:8080/web/manager/userManager.jsp"
                        });
                    }else if (node.text == "JSP") {

                        $("#center_page").tabs("add",{
                            title: node.text,
                            closable: true,
                            width: 100
                        });
                    }else {

                        $.messager.show({
                            title: "通知",
                            msg: "系统功能正在开发中,请耐心等待......"
                        });
                    }
                }

            }else {

                $.messager.show({
                    title: "通知",
                    msg: "系统功能正在开发中,请耐心等待......"
                });
            }
        }
    });

});




































