package org.Mercury.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class LeyouCorsConfiguration {

    @Bean
    public CorsFilter corsFilter(){
        //初始化cors配置对象
        CorsConfiguration configuration = new CorsConfiguration();
        //允许跨域的域名，如果携带Cokkie，不能写*。*：代表所有域名都可以访问
        configuration.addAllowedOrigin("http://manage.leyou.com");
        configuration.addAllowedOrigin("http://www.leyou.com");
        configuration.setAllowCredentials(true);  //是否允许携带cookie
        configuration.addAllowedMethod("*");  //代表所有的请求方法：get post put
        configuration.addAllowedHeader("*");  //允许携带任何信息头

        //初始化cors配置源对象
        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**", configuration);

        //返回CorsFilter 实例，参数：cors配置源对象
        return new CorsFilter(corsConfigurationSource);
    }
}
