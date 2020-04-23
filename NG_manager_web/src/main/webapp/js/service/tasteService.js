app.service('tasteService',function ($http) {

    this.findAll=function () {
        return $http.get('../taste/findAll.do');
    };

    this.add=function (entity) {
        return $http.post('../taste/add.do',entity);
    };

    this.findOne=function (id) {
        return $http.get('../taste/findOne.do?id='+id);
    };

    this.update=function (taste) {
        return $http.post('../taste/update.do',taste);
    };

    this.findTaste=function (taste) {
        return $http.post('../taste/findTaste.do',taste);
    };

    this.delete=function (selectIds) {
        return $http.get('../taste/delete.do?ids='+selectIds);
    }

    this.findTasteList=function () {
        return $http.get('../taste/selectOptionList.do');
    }
});