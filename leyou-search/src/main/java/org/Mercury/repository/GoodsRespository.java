package org.Mercury.repository;

import org.Mercury.entity.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface GoodsRespository extends ElasticsearchRepository<Goods,Long> {
}
