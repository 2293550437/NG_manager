app.controller('foodsController',function ($scope, $controller, foodsService,uploadService) {
    $controller('baseController',{$scope:$scope});


    //获取所有的模板下拉数据
    $scope.findMenuList=function () {
        foodsService.findMenuList().success(function (response) {
            $scope.menuClassList=response;
        })
    };

    //侦测分类模板是否发生变化
    //$watch是一个内置组件，该组件可以检测指定变量是否发生变化
    $scope.$watch('entity.foods.meclassId',function (newValue, oldValue) {
        //newValue新切换到的数据的值
        //oldValue原有数据的值
        if (newValue){
            //调用模板分类的菜品和口味数据数据
            foodsService.findOne(newValue).success(function (response) {
                $scope.menuClass = response;
                //把菜品json字符串传换成json对象
                $scope.menuClass.greensBrand = JSON.parse($scope.menuClass.greensBrand);
                $scope.menuClass.greensTaste = JSON.parse($scope.menuClass.greensTaste);
            })

        }

    });


    //增加
    $scope.add=function () {
        $scope.entity.foodsCat.introduction = editor.html();
        foodsService.add($scope.entity).success(function (response) {
            if (response.success){
                alert(response.message);
                //清空表单内容
                //$scope.entity={};
                $scope.entity={"foods":{},"foodsCat":{"foodsImg":[]}};
            } else {
                alert(response.message);
            }
        })
    };


    //删除选中的菜名
    $scope.delete=function(){
        foodsService.delete($scope.selectIds).success(function (response) {
            if (response.success){
                alert(response.message);
                $scope.reloadList();
            } else {
                alert(response.message);
            }
        })
    };


    //图片上传
    $scope.uploadFile=function () {
        uploadService.uploadfile().success(function (response) {
            if (response.success){//上传成功，返回url
                $scope.image_entity.url=response.message;

            }
        }).error(function () {
            alert("图片上传失败");
        })
    };

    //定义图片列表集合
    $scope.entity={"foods":{},"foodsCat":{"foodsImg":[]}};

    //点击保存 把图片对象存储到图片列表数组
    $scope.add_image_entity=function () {
        $scope.entity.foodsCat.foodsImg.push($scope.image_entity)
    };

    //点击删除按钮，移除图片
    $scope.remove_image_entity=function (index) {
        $scope.entity.foodsCat.foodsImg.splice(index,1);
    };

    //初始化搜索条件
    $scope.searchEntity={};

    //根据条件查询菜名信息
    $scope.search=function (page,rows) {
        foodsService.findPage($scope.searchEntity,page,rows).success(function (response) {
            //更新分页总记录数
            $scope.paginationConf.totalItems=response.total;
            //更新list集合
            $scope.list = response.rows;
        })
    };

    //定义一个审核状态的数组
    $scope.status=["待审核","审核通过","审核未通过"];

    //定义一个存储全部分类数据数组
    $scope.menuBrandList=[];
    $scope.menuTasteList=[];
    //编写获取全部分类数据的方法
    $scope.findMenuClassList=function () {
        foodsService.findMenuList().success(function (response) {
            //遍历全部分类数据集合
            for (var i=0;i<response.length;i++){
                $scope.menuBrandList.greensBrand=JSON.parse(response[i].greensBrand);
                $scope.menuTasteList.greensTaste=JSON.parse(response[i].greensTaste);
                for (var j=0;j<$scope.menuBrandList.greensBrand.length;j++){
                    $scope.menuBrandList[$scope.menuBrandList.greensBrand[j].id]=$scope.menuBrandList.greensBrand[j].text;
                }
                for (var k=0;k<$scope.menuTasteList.greensTaste.length;k++){
                    $scope.menuTasteList[$scope.menuTasteList.greensTaste[k].id]=$scope.menuTasteList.greensTaste[k].text;
                }
            }
        })
    };

});