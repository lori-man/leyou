package org.Mercury.item.api;

import org.Mercury.common.entity.PageResult;
import org.Mercury.item.entity.Sku;
import org.Mercury.item.entity.Spu;
import org.Mercury.item.entity.SpuBo;
import org.Mercury.item.entity.SpuDetail;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public interface GoodsApi {
    /**
     * 根据条件分页查询spu
     * @param key
     * @param saleable
     * @param page
     * @param row
     * @return
     */
    @GetMapping("spu/page")
    public PageResult<SpuBo> querySpuByPage(
            @RequestParam(value = "key", required = false) String key,
            @RequestParam(value = "saleable", required = false) Boolean saleable,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "row", defaultValue = "5") Integer row
    ) ;

    /**
     * 新增商品
     *
     * @param spuBo
     * @return
     */
    @PostMapping("goods")
    public Void saveGoods(@RequestBody SpuBo spuBo);

    /**
     * 根据spuId查询SpuDetail
     * @param spuId
     * @return
     */
    @GetMapping("spu/detail/{spuId}")
    public SpuDetail querySpuDetailBySpuId(@PathVariable("spuId") Long spuId);

    /**
     * 根据spuId查询sku集合
     * @param spuId
     * @return
     */
    @GetMapping("sku/list")
    public List<Sku> querySkusBySpuId(@RequestParam("id") Long spuId);

    /**
     * 根据spu的id查询spu
     * @param id
     * @return
     */
    @GetMapping("spu/{id}")
    public Spu querySpuById(@PathVariable("id") Long id);
}
