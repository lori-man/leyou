package org.Mercury.client;

import org.Mercury.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface GoodsClient extends GoodsApi {
}
