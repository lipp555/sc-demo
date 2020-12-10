sc-provider-* 为服务提供者

sc-provider-8081 为服务提供者,只提供http接口

sc-provider-8082 注册到eureka

sc-provider-8083 copy by sc-provider-8082

sc-provider-8084 copy by sc-provider-8082

sc-comsumer-9091 为服务消费者，采用原始的http直接请求服务提供者

sc-comsumer-9092 为服务消费者，采用原始的http直接请求服务提供者,注册到eureka上

sc-comsumer-9092 为服务消费者，采用原始的http直接请求服务提供者

03-sc-comsumer-feign-9093 为服务消费者，采用feign(类似于dubbo)做客户端连接

04-sc-comsumer-feign-9094 为服务消费者，采用feign(类似于dubbo)做客户端连接,自己实现了路由方法IRule(ribbon)

05-sc-comsumer-hystrix-9095 copy by sc-comsumer-9092，增加了hystrix熔断

06-sc-comsumer-feign-9096为服务消费者，采用feign(类似于dubbo)做客户端连接,增加了hystrix的熔断

00-sc-zuul-9000 网关服务

spring-cloud技术栈
<br/>

    注册中心：Eureka
        zookeeper
    负载均衡：Ribbon
    API网关：Zuul
        Nginx
    REST调用：Feign
        dubbo
    容错处理：Hystrix
    统一配置管理：Config
        apollo
    服务追踪：Sleuth