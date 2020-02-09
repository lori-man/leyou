package org.Mercury.client;

import org.Mercury.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "item-service")
public interface SpecificationClient extends SpecificationApi {
}
