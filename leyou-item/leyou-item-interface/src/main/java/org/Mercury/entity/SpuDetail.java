package org.Mercury.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_spu_detail")
public class SpuDetail {
    @Id
    private Long id; //对应SPU的id
    private String description; //商品描述
    private String specialSpec; //商品特殊规格的名称及可选值模板
    private String genericSpec; //商品的全局规格属性
    private String packingList; //包装清单
    private String afterSercice; //售后服务

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecialSpec() {
        return specialSpec;
    }

    public void setSpecialSpec(String specialSpec) {
        this.specialSpec = specialSpec;
    }

    public String getGenericSpec() {
        return genericSpec;
    }

    public void setGenericSpec(String genericSpec) {
        this.genericSpec = genericSpec;
    }

    public String getPackingList() {
        return packingList;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public String getAfterSercice() {
        return afterSercice;
    }

    public void setAfterSercice(String afterSercice) {
        this.afterSercice = afterSercice;
    }
}
