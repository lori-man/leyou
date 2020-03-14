package org.Mercury.auth.client;

import org.Mercury.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service")
public interface UserClient extends UserApi {
}
