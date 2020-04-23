app.service('menuClassService',function ($http) {
    this.search=function (entity,page,rows) {
        return $http.post('../typetemplate/findPage.do?page='+page+"&rows="+rows,entity);
    };

    this.add=function (entity) {
        return $http.post('../typetemplate/add.do',entity);
    };

    this.findOne=function (id) {
        return $http.get('../typetemplate/findOne.do?id='+id);
    };

    this.update=function (entity) {
        return $http.post('../typetemplate/update.do',entity);
    };

    this.delete=function (ids) {
        return $http.get('../typetemplate/delete.do?ids='+ids);
    }

});