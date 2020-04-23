app.controller('employeeController',function ($scope,$location,$controller,employeeService) {

    //继承baseController
    $controller('baseController',{$scope:$scope});

    //根据id查找职工对象
    $scope.findOne=function(empId){
        employeeService.findOne(empId).success(function (response) {
                $scope.entity=response;
        })

    };
    //初始化搜索条件对象
    $scope.searchEntity={};
    //根据条件查询职工信息
    $scope.search=function (page,rows) {
        //判断审核状态要求,根据传递的flag参数查询相应的职工对象
        $scope.flag = $location.search()['flag'];
        $scope.flag1 = parseInt($scope.flag);
        if ($scope.flag1==1){
            $scope.searchEntity.status="0";
        }else {
            $scope.searchEntity.status="1";
        }
        employeeService.search(page,rows,$scope.searchEntity).success(function (response) {
           //更新分页总记录数
            $scope.paginationConf.totalItems=response.total;
            //更新list
            $scope.list=response.rows;
        })
    };

    //定义一个职位的数组
    $scope.position=["经理","主厨","服务员"];

    //定义职工审核状态数组
    $scope.status=["未审核","审核通过","已驳回"];

    //删除选中的职工对象
    $scope.delete=function () {
        employeeService.delete($scope.selectIds).success(function (response) {
            if (response.success){
                alert(response.message);
                //删除成功，初始化选中数组
                $scope.selectIds=[];
                $scope.reloadList();
            } else {
                alert(response.message);
            }
        })
    };

    //提交审核结果
    $scope.updateStatus=function (status) {
        employeeService.updateStatus($scope.entity,status).success(function (response) {
                alert(response.message);
                $scope.reloadList();
        })
    };


});