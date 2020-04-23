app.service('foodsService',function ($http) {
    this.findMenuList=function () {
        return $http.get('../foods/findAll.do');
    };

    //增加
    this.add=function (entity) {
        return $http.post('../foods/add.do',entity);
    };

    //查找单个模板对象
    this.findOne=function (menuId) {
        return $http.get('../foods/findOne.do?menuId='+menuId);
    };

    //根据条件查询菜名数据
    this.findPage=function (entity,page,rows) {
        return $http.post('../foods/findPage.do?page='+page+"&rows="+rows,entity);
    }

    //根据选中对象删除
    this.delete=function (selectIds) {
        return $http.get('../foods/delete.do?ids='+selectIds);
    }
});