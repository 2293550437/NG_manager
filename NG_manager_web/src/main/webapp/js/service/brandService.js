app.service('brandService',function ($http) {
	//获取下拉菜单的数据
	this.selectOptionList=function () {
		return $http.post('../brand/selectOptionList.do');
	};

	this.findOne=function (id) {
		return $http.get('../brand/findOne.do?id='+id);
	};

	this.add=function (entity) {
		return $http.post('../brand/add.do',entity);
	};

	this.update=function (entity) {
		return $http.post('../brand/update.do',entity);
	};

	this.delete=function (ids) {
		return $http.get('../brand/delete.do?ids='+ids);
	};

	this.search=function (page,rows,searchEntity) {
		return $http.post('../brand/search.do?page='+page+'&rows='+rows,searchEntity);
	};

});