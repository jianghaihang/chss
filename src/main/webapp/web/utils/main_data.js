//
// // 显示当前时间
//
// function showData() {
//
//     // $("#north_data").empty();
//
//     var date = new Date();
//
//     var year = date.getFullYear();
//     var month = date.getMonth()+1;
//     var day = date.getDate();
//     var hour = date.getHours();
//     var minute = date.getMinutes();
//     var second = date.getSeconds();
//
//
//     $("#north_show_time").text( year + "年" + month + "月" +
//         day + "日 " + hour + ":" + minute + ":" + second);
//
//
//     // this.day = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")[date.getDay()];
//
//     // console.log("day: " + day);
//
//     // var html = '<span id="north_show_time">#{dateTime}</span>';
//
//     // var date_time = year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒";
//
//     // html = html.replace(/#{dateTime}/g, date_time);
//
//     // console.log(html);
//
//     // $("#north_data").append(html);
//
//     // console.log(hour + "时" + month + "分" + minute + "秒");
//
// };
//
// window.setInterval("showData()",1000);
//
// // $(document).ready(function () {
// //
// //     window.setInterval("showData()",1000);
// //
// //     showData();
// // });