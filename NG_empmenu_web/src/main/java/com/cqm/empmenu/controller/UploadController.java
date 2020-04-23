package com.cqm.empmenu.controller;

import com.cqm.entity.Result;
import com.cqm.utils.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @Value("${FILE_SERVER_URL}")   //必须确保springmvc里已经扫描对应属性文件
    private String FILE_SERVER_URL;//文件服务器访问ip

    @RequestMapping("/upload")
    public Result upload(MultipartFile file){
        //1、获取上传文件的原始名称
        String filename = file.getOriginalFilename();
        //2、获取文件的扩展名
        String extName = filename.substring(filename.lastIndexOf(".") + 1);
        //3、创建FastDFS客户端
        try {
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:config/fdfs_client.conf");
            //4、上传文件到FastDFS服务器
            String fileName = fastDFSClient.uploadFile(file.getBytes(), extName);
            return new Result(true,FILE_SERVER_URL+fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"上传文件失败");
        }
    }

}
