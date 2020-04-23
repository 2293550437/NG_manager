app.controller('baseController',function ($scope) {
    //定义分页选项
    $scope.paginationConf={
        currentPage: 1,//当前页
        totalItems: 10,//总记录数
        itemsPerPage: 5,//每页显示记录数
        perPageOptions: [10,15,20,30],//下拉选择每页要显示的记录数
        onChange:function () {
            //当页码发生变化。调用的方法
            //$scope.reloadList();
            $scope.reloadList();
        }
    };

    //封装findList--reloadList
    $scope.reloadList=function(){
        $scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    };


    //定义一个数组存储用户选中的要删除的菜品的编号
    $scope.selectIds=[];

    //当用户点击或者取消要删除的品牌进行处理
    $scope.updateSelection=function ($event, id) {
        if ($event.target.checked){
            //选中
            $scope.selectIds.push(id);
        }else {
            //取消选中
            //获取id在数组中的角标
            var index = $scope.selectIds.indexOf(id);
            //根据角标删除数组中元素
            $scope.selectIds.splice(index,1);
        }
    };


});