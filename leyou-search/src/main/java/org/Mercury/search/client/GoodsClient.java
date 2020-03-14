package org.Mercury.search.client;

import org.Mercury.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface GoodsClient extends GoodsApi {
}
