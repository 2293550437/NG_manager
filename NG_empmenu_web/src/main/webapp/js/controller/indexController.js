app.controller('indexController',function ($scope,loginService) {
    //获取当前登录的账号
    $scope.showLoginName=function () {
        loginService.loginName().success(function (response) {
            $scope.loginName=response.loginName;
        })
    };
});