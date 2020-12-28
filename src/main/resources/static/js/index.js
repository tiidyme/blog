$(function (){
    $("#kind").bind('click',function (){

        alert("跳转分类页面");
    });
    indexPage = function (name){
        if(name!=="5")
            alert("跳转首页"+name);
        switch (name) {
            case "6":
                alert("正在跳转");
                window.location.href="login.html";
                break;
            case "7":
                alert("正在跳转");
                window.location.href="login.html";
                break;
            case "8":
                alert("正在跳转");
                window.location.href="login.html";
                break;
            default: break;
        }
    };
    search = function () {
        alert(vue.value);
    };
    var vue = new Vue({
        el: '#app',
        data: {
            theme1: 'primary',
            value: '',
            value1: 0
        }
    });
})

