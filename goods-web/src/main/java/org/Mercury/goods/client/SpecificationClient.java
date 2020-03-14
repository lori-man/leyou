package org.Mercury.goods.client;

import org.Mercury.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface SpecificationClient extends SpecificationApi {
}
