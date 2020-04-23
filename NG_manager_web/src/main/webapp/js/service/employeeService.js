app.service('employeeService',function ($http) {


   this.search=function (page,rows,employee) {
       return $http.post('../emp/findStatusEmpList.do?page='+page+"&rows="+rows,employee);
   };

   this.findOne=function (empId) {
       return $http.get('../emp/findOne.do?empId='+empId);
   };

   this.delete=function (ids) {
       return $http.get('../emp/delete.do?ids='+ids);
   };

   this.updateStatus=function (entity,status) {
       return $http.post('../emp/updateStatus.do?status='+status,entity);
   }
});