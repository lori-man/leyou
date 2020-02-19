# leyou
+ leyou后端部分：
    采用springboot+elasticsearch+thymeleaf组合的微服务项目

+ 准备部分
    前端部分：leyou-portal，leyou-manage-web，nginx配置文件，sql文件，SwitchHosts放置在resource文件夹中
    1.leyou-portal：使用live-server打开
        在所在目录下打开cmd输入：npm install -g live-server
        打开： live-server --port=9002

    2.leyou-manage-web：输入：npm start

    3.SwitchHosts用管理者模式打开，将所有域名都设置为本地：127.0.0.1
        127.0.0.1 manage.leyou.com
        127.0.0.1 api.leyou.com
        127.0.0.1 image.leyou.com
        127.0.0.1 www.leyou.com

    4.我都mysql是8.0，需要自己在每个模块的application.yml配置

    5.nginx.conf需要更改所有代理的绝对路径

+ ElaserchSearch
    在leyou-search的application.yml配置其节点

+ 目录介绍：
    微服务：gateway：网关
    goods-web：详细商品服务
    leyou-common：项目通用工具
    leyou-item：管理商品服务
    leyou-search：搜索商品接口
    leyou-upload：文件上传服务
    registy：注册机
    images：照片存储位置
    html：thymeleaf静态化存储位置
    leyou-user: 用户微服务
    leyou-auth: 授权中心微服务:配合用户微服务使用