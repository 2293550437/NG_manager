app.controller('brandController',function ($scope,$controller, brandService) {


	//继承baseController
	$controller('baseController',{$scope:$scope});//继承

	//根据菜品id获取菜品信息
	$scope.findOne=function(id){
		brandService.findOne(id).success(function (response) {
			//响应的是菜品的信息
			$scope.entity=response;
		})
	};

	//保存修改一体化
	$scope.addAndUpdate=function () {
		var obj="";
		if ($scope.entity.id!=null){
			obj = brandService.update($scope.entity);
		}else {
			obj = brandService.add($scope.entity);
		}

		obj.success(function (response) {
			if (response.success){
				alert(response.message);
				//刷新列表页
				$scope.reloadList();
			}else {
				alert(response.message);
			}
		})

	};



	//删除方法
	$scope.delete=function () {
		brandService.delete($scope.selectIds).success(function (response) {
			if (response.success){
				alert(response.message);
				//刷新列表
				$scope.reloadList();
				//清除删除选择数组
				$scope.selectIds=[];
			}else {
				alert(response.message);
			}
		})
	};

	//初始化搜索条件对象
	$scope.searchEntity={};
	//搜索方法
	$scope.search=function (page,rows) {
		brandService.search(page,rows,$scope.searchEntity).success(function (response) {
			//更新分页的总记录数
			$scope.paginationConf.totalItems=response.total;
			//更新list
			$scope.list=response.rows;
		})
	}

});