package org.Mercury.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {

    private static final List<String> CONTEXT_TYPE = Arrays.asList("image/gif", "image/jpeg");
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);


    public String uploadImage(MultipartFile file) {
        String originName = file.getOriginalFilename();
        try {
            //校验文件类型
            String contexType = file.getContentType();
            if (!CONTEXT_TYPE.contains(contexType)) {
                LOGGER.info("参数不合法： {}", originName);
                return null;
            }

            //检验文件内容
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            if (bufferedImage == null) {
                LOGGER.info("文件内容不合格: {}", originName);
                return null;
            }
            //保存服务器
            file.transferTo(new File("D:\\leyou\\image\\" + originName));

            //返回url，进行回显
            return "http://image.leyou.com/" + originName;
        } catch (IOException e) {
            LOGGER.info("服务器内部错误： {}",originName);
            e.printStackTrace();
        }
        return null;
    }
}
