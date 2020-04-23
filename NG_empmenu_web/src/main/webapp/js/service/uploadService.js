app.service('uploadService',function ($http) {
    //文件上传方法
    this.uploadfile=function () {
        //封装表单数据的对象
        var formData = new FormData();
        //把上传表单中的文件对象封装起来
        formData.append("file",file.files[0]);
        //利用$http原始设置进行上传
        return $http({
            method:'post',
            url:'../upload.do',
            data:formData,
            headers:{'Content-Type':undefined},//未定义请求头
            transformRequest:angular.identity  //以angular序列化方式传输
        });

    }
});