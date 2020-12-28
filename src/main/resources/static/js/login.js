$(function () {
    var vue = new Vue({
        el: '#login',
        data: {
            formInline:
                {
                    user: '',
                    password: ''
                },
            ruleInline: {
                user: [
                    {required: true, message: 'Please fill in the user name', trigger: 'blur'}
                ],
                password: [
                    {required: true, message: 'Please fill in the password.', trigger: 'blur'},
                    {
                        type: 'string',
                        min: 6,
                        message: 'The password length cannot be less than 6 bits',
                        trigger: 'blur'
                    }
                ]
            }
        }

    })
    handleSubmit = function () {
        console.log(vue.formInline.user);
        $.post("login", vue.formInline, function (flag) {
            console.log(flag);
        });
    }
    jump = function (){
        window.location.href="register.html";
    }
})

