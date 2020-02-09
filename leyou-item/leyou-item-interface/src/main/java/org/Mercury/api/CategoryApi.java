package org.Mercury.api;

import org.Mercury.entity.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("category")
public interface CategoryApi {

    /**
     * 根据父节点的id查询子节点
     * @param pid
     * @return
     */
    @GetMapping("list")
    public List<Category> queryCategory(@RequestParam(defaultValue = "0", value = "pid") Long pid);

    /**
     * 根据多级分类id查询分类名称
     * @param ids
     * @return
     */
    @GetMapping
    public List<String> queryNamesByIds(@RequestParam("ids") List<Long> ids);
}
