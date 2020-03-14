package org.Mercury.item.mapper;

import org.Mercury.item.entity.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<Brand> {

    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) values (#{cid},#{bid})")
    void insertCategoryAndBrand(@Param("cid") Long cid, @Param("bid") Long id);

    @Select("SELECT * FROM tb_brand a  INNER JOIN tb_category_brand b on a.id=b.brand_id where b.category_id=#{cid}")
    List<Brand> selectBrandsByCid(Long cid);
}
