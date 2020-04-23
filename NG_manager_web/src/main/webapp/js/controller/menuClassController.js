app.controller('menuClassController',function ($scope,$controller,menuClassService,brandService,tasteService) {
    $controller('baseController',{$scope:$scope});

    //初始化搜索条件
    $scope.searchEntity={};
    //根据条件查询模板信息
    $scope.search=function (page, rows) {
        menuClassService.search($scope.searchEntity,page,rows).success(function (response) {
            //更新分页总记录数
            $scope.paginationConf.totalItems=response.total;
            //更新list
            $scope.list=response.rows;
        })
    };



    //定义菜品select2所需的下拉数据
    $scope.greensBrandList={data:[]};

    //获取所有的菜品品牌下拉数据
    $scope.findBrandList=function () {
        brandService.selectOptionList().success(function (response) {
            $scope.greensBrandList={data:response};
        })
    };

    //定义口味select所需的下拉数据
    $scope.greensTasteList={data:[]};

    //获取所需的口味下拉数据
    $scope.findTasteList=function () {
        tasteService.findTasteList().success(function (response) {
            $scope.greensTasteList={data:response};
        })
    };

    //保存-修改
    $scope.save=function () {
        var obj="";
        if ($scope.entity.meclassId!=null){
            //保存修改后的模板
           obj = menuClassService.update($scope.entity);
        } else {
            //保存模板信息
            obj = menuClassService.add($scope.entity);
        }
        obj.success(function (response) {
            if (response.success){
                alert(response.message);
                $scope.reloadList();//重新加载
            } else {
                alert(response.message);
            }
        })
    };

    //根据id查找模板对象
    $scope.findOne=function (id) {
        menuClassService.findOne(id).success(function (response) {
          $scope.entity=response;
          //处理菜品的数据，把字符串转换成json对象
          $scope.entity.greensBrand = JSON.parse($scope.entity.greensBrand);
          //转换规格数据，把字符串转换成json对象
          $scope.entity.greensTaste = JSON.parse($scope.entity.greensTaste);
      })
    };

    //根据选中的id删除模板对象
    $scope.delete=function () {
        menuClassService.delete($scope.selectIds).success(function (response) {
            if (response.success){
                alert(response.message);
                $scope.reloadList();
            } else {
                alert(response.message);
            }
        })
    };

    //提取json字符串中指定key的数据，拼接成字符串
    $scope.jsonToString = function (jsonStr, key) {
        if (jsonStr){
            //把json字符串转换为json的对象
            var jsonObj = JSON.parse(jsonStr);
            //遍历json数组
            var value = "";
            for (var i=0;i<jsonObj.length;i++){
                if (i>0){
                    value += ",";
                }
                //获取到单个json对象
                value += jsonObj[i][key];
            }

            return value;
        }
    };

});