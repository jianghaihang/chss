
$(function () {

    alert("area.js");

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

                $.messager.show({

                    title: "通知",
                    msg: "加载成功！area"
                })
            }
        },
        onLoadError: function (arguments) {

            $.messager.show({
                title: "严重错误",
                msg: "加载失败"
            })
        }
    });
});













































