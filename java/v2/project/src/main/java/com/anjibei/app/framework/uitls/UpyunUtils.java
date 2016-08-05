package com.anjibei.app.framework.uitls;

import com.anjibei.app.framework.config.Config;
import main.java.com.UpYun;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import wedev.db.data.common.Path;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by MEX on 15/8/22.
 */
public class UpyunUtils {

    /**
     * 单张上传
     *
     * @param uploadPath
     * @param file
     * @return
     * @throws IOException
     */
    public static String ImageUpload(String uploadPath, MultipartFile file) throws IOException {
        String upyunUrl = null;
//        String savePath = "/Users/MEX/cosmos/AnJiBei_Java_Project/anjibei/upload/";
//        String savePath = "/D:\\work/upload/";
        String savePath = "/opt/AnJiBei_Java_Project/anjibei/upload/";
        String[] fileList = file.getOriginalFilename().split("\\.");
        int size = fileList.length;
        String su = fileList[size - 1];//获取文件后缀
        String fileName = MD5Utils.md5(Integer.toString(TimeUtils.time()) + Double.toString(Math.random())) + "." + su;

        file.transferTo(new File(savePath + fileName));
        // UpYUN上传
        UpYun upyun = new UpYun("anjibei", "anjibei", "anjibei2015");
        upyun.setApiDomain(UpYun.ED_AUTO);
        upyun.setTimeout(60);
        File file2 = new File(savePath + fileName);
        boolean res = upyun.writeFile(uploadPath + fileName, file2, true);

        if (res) {
//            file2.delete();
            upyunUrl = Config.UPYUN + uploadPath + fileName;
        }
        return upyunUrl;
    }

    /**
     * 多图上传
     *
     * @param path
     * @param multipartHttpServletRequest
     * @return
     * @throws IOException
     */
    public static List<Path> ImageListUpload(String path, MultipartHttpServletRequest multipartHttpServletRequest) throws IOException {
        Map fileMap = multipartHttpServletRequest.getFileMap();
        String res;
        List<Path> pathList = new ArrayList<>();
        if (!fileMap.isEmpty()) {
            System.out.println("上传的数据中包含文件");
            int size = fileMap.size();
            for (int i = 0; i < size; i++) {
                String key = "file" + i;
                MultipartFile file = (MultipartFile) fileMap.get(key);
                res = UpyunUtils.ImageUpload(path, file);
                if (res != null) {
                    Path returnPath = new Path();
                    returnPath.setPath(res);
                    pathList.add(returnPath);
                }
            }
        }
        return pathList;
    }

//    /**
//     * 缩略图上传
//     *
//     * @param uploadPath
//     * @param file
//     * @return
//     * @throws IOException
//     */
//    public static String ImageCompressUpload(String uploadPath, MultipartFile file) throws IOException {
//        String upyunUrl = null;
////        String savePath = "/Users/MEX/cosmos/AnJiBei_Web_Project/anjibei/upload/";
////        String savePath = "/D:\\work/upload/";
//        String savePath = "/opt/AnJiBei_Web_Project/anjibei/upload/";
//        String[] fileList = file.getOriginalFilename().split("\\.");
//        int size = fileList.length;
//        String su = fileList[size - 1];//获取文件后缀
//        String fileName = MD5Utils.md5(Integer.toString(TimeUtils.getTime()) + Double.toString(Math.random())) + "." + su;
//
//        file.transferTo(new File(savePath + fileName));
//        // UpYUN上传
//        UpYun upyun = new UpYun("anjibei", "anjibei", "anjibei2015");
//        upyun.setApiDomain(UpYun.ED_AUTO);
//        upyun.setTimeout(60);
//        File file2 = new File(savePath + fileName);
//
//        Map<String, String> params = new HashMap<String, String>();
//        // 设置缩略图类型
//        params.put(UpYun.PARAMS.KEY_X_GMKERL_TYPE.getValue(), UpYun.PARAMS.VALUE_FIX_BOTH.getValue());
//        // 设置缩略图参数值
//        params.put(UpYun.PARAMS.KEY_X_GMKERL_VALUE.getValue(), "150x150");
//        // 设置缩略图的质量，默认 95
//        params.put(UpYun.PARAMS.KEY_X_GMKERL_QUALITY.getValue(), "30");
//
//        boolean res = upyun.writeFile(uploadPath + fileName, file2, true, params);
//
//        if (res) {
//            file2.delete();
//            upyunUrl = Config.UPYUN + uploadPath + fileName;
//        }
//        return upyunUrl;
//    }
}
