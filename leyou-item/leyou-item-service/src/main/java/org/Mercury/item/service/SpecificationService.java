package org.Mercury.item.service;

import org.Mercury.item.entity.SpecGroup;
import org.Mercury.item.entity.SpecParam;
import org.Mercury.item.mapper.SpecGroupMapper;
import org.Mercury.item.mapper.SpecParamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationService {
    @Autowired
    private SpecGroupMapper specGroupMapper;

    @Autowired
    private SpecParamMapper specParamMapper;

    /**
     * 根据分类id查询分类组
     *
     * @param cid
     * @return
     */
    public List<SpecGroup> queryGroupById(Long cid) {
        SpecGroup record = new SpecGroup();
        record.setCid(cid);
        return this.specGroupMapper.select(record);
    }

    /**
     * 根据条件查询规格参数
     *
     *
     * @param cid
     * @param gid
     * @param generic
     * @param searching
     * @return
     */
    public List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching) {
        SpecParam record = new SpecParam();
        record.setGroupId(gid);
        record.setCid(cid);
        record.setGeneric(generic);
        record.setSearching(searching);

        return this.specParamMapper.select(record);
    }

    /**
     * 根据分类id获取参数组的集合
     *
     * @param cid
     * @return
     */
    public List<SpecGroup> queryGroupsWithParam(Long cid) {
        List<SpecGroup> groups = queryGroupById(cid);
        groups.forEach(group->{
            List<SpecParam> params = queryParams(group.getId(), null, null, null);
            group.setParams(params);
        });
        return groups;
    }
}
