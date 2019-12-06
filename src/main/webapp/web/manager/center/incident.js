
function search() {

    var username = $("#name_text").val();
    var account = $("#acc_text").val();
    var role = $("#ro_combo").val();

    // alert("username="+ username + ", account=" + account + ", role=" + role);

    var url = "/accounts/user_account";

    var data = "username=" + username + "&account=" + account + "&role=" + role;

    $("#all_user").datagrid({
        url: url + "?" + data
    });

    // $.ajax({
    //    url: url,
    //    type: "POST",
    //    data: data,
    //    dataType: "json",
    //    success: function (json) {
    //
    //        if (json) {
    //
    //            $.messager.show({
    //               title: "SUCCESS",
    //               msg: "远程数据获取成功！"
    //            });
    //        }else {
    //
    //            $.messager.show({
    //                title: "ERROR",
    //                msg: "远程数据获取失败！"
    //            });
    //        }
    //    }
    // });

};

































