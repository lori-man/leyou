package org.Mercury.goods.client;

import org.Mercury.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface BrandClient extends BrandApi {
}
