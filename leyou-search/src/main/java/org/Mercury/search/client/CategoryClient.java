package org.Mercury.search.client;

import org.Mercury.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface CategoryClient extends CategoryApi {
}
