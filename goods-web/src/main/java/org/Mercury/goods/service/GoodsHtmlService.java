package org.Mercury.goods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.PrintWriter;

@Service
public class GoodsHtmlService {
    @Autowired
    private TemplateEngine engine;

    @Autowired
    private GoodsService goodsService;

    /**
     * 页面静态化生成代码
     * @param spuId
     */
    public void createHtml(Long spuId) {
        //创建上下文
        Context context = new Context();
        context.setVariables(this.goodsService.loadData(spuId));

        File file = new File("D:\\leyou\\leyou\\html\\" + spuId + ".html");  //设置静态页面的存储位置,联系nginx修改

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
            this.engine.process("item", context, printWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

    }
}
