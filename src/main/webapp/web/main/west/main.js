
$(function () {

    $("#north_out").click(function () {

        if (confirm("您确定要退出系统吗？")){

            top.window.opener = top;
            top.window.open("","_self","");
            top.window.close();

            // window.opener = null;
            // window.open("","_self");
            // window.close();
        }
    });

});