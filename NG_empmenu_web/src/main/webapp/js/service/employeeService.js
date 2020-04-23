app.service('employeeService',function ($http) {

    this.add=function (entity) {
       return $http.post('../employee/add.do',entity);
   };

   this.search=function (page,rows,entity) {
       return $http.post('../employee/findPage.do?page='+page+"&rows="+rows,entity);
   };

   this.findOne=function (empId) {
       return $http.get('../employee/findOne.do?empId='+empId);
   };

   this.update=function (entity) {
       return $http.post('../employee/update.do',entity);
   };

   this.delete=function (ids) {
       return $http.get('../employee/delete.do?ids='+ids);
   }
});