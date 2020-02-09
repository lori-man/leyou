package org.Mercury.client;

import org.Mercury.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface BrandClient extends BrandApi {
}
