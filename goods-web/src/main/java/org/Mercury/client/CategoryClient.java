package org.Mercury.client;

import org.Mercury.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface CategoryClient extends CategoryApi {
}
