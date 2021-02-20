$(function () {
    $.post({
        url:"user/getAll",
        success:function (data) {
           for (var i = 0; i <data.length; i++){
               var  text = "<tr>\n" +
                   "                <td>"+data[i].id+"</td>\n" +
                   "                <td>"+data[i].username+"</td>\n" +
                   "                <td>"+data[i].password+"</td>\n" +
                   "                <td>"+data[i].createtime+"+</td>\n" +
                   "                <td>"+data[i].status+"</td>\n" +
                   "                <td>\n" +
                   "                    <a href=\"user/deleteByid?id="+data[i].id+"\" class=\"btn btn-danger\">delete</a>\n" +
                   "                    <a href=\"update.html?id="+data[i].id+" \" class=\"btn btn-success\">correct</a>\n" +
                   "                </td>\n" +
                   "            </tr>"
                   var obj =$(".pool");
               obj.append(text);
           }

        }
    })
})