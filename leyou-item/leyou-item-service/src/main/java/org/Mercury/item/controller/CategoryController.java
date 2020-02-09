package org.Mercury.item.controller;

import org.Mercury.entity.Category;
import org.Mercury.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 根据父节点的id查询子节点
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategory(@RequestParam(defaultValue = "0", value = "pid") Long pid) {
        try{
            //400:参数不合格
            if (pid == null || pid < 0) {
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
                return ResponseEntity.badRequest().build();
            }
            List<Category> categories = categoryService.queryCategory(pid);
            if (CollectionUtils.isEmpty(categories)) {
                //404:资源服务器未找到
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            //200:查询成功
            return ResponseEntity.ok(categories);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500:服务器内部错误
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    /**
     * 根据多级分类id查询分类名称
     * @param ids
     * @return
     */
    @GetMapping
    public ResponseEntity<List<String>> queryNamesByIds(@RequestParam("ids") List<Long> ids) {
        List<String> nanes = this.categoryService.queryNamesByIds(ids);
        if (CollectionUtils.isEmpty(nanes)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(nanes);
    }
}
