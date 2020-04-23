app.service('loginService',function ($http) {
   //读取当前登录的用户名
   this.loginName=function () {
       return $http.get('../login/name.do');
   } 
});