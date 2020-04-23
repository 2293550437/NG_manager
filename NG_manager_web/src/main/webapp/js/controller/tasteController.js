app.controller('tasteController',function ($scope,$controller, tasteService) {

    //继承baseController
    $controller('baseController',{$scope:$scope});

    //查找全部口味信息
    $scope.findAll=function () {
        tasteService.findAll().success(function (response) {
            $scope.list=response;
        })
    };

    //根据id查找口味对象
    $scope.findOne=function(id){
        tasteService.findOne(id).success(function (response) {
                $scope.entity=response;
        })
    };
    //添加修改一体化
    $scope.addAndUpdate=function () {
        var obj="";
        if ($scope.entity.id!=null){
            obj = tasteService.update($scope.entity);
        } else {
            obj = tasteService.add($scope.entity);
        }

        obj.success(function (response) {
            if (response.success){
                alert(response.message);
                $scope.findAll();
            } else {
                alert(response.message);
            }
        })
    };

    //根据条件查询口味信息
    $scope.findTaste=function () {
        if ($scope.searchEntity.name!=null){
            tasteService.findTaste($scope.searchEntity).success(function (response) {
                $scope.list=response;
            })
        } else {
            //如果查询条件为空，查询全部口味信息
            $scope.findAll();
        }
    };
    
    //删除指定口味对象
    $scope.delete=function () {
        tasteService.delete($scope.selectIds).success(function (response) {
            if (response.success){
                alert(response.message);
                $scope.findAll();
            } else {
                alert(response.message);
            }
        })
    }

});