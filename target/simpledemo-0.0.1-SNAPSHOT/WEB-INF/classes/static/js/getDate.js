$(function () {
    $.post({
        url:"user/getAll",
        success:function (data) {
           for (var i = 0; i <data.length; i++){
               data[i].username
               console.log(data[i].username)
           }

        }
    })
})