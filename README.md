# mybatis-plus-dynamic-data-source
该demo是使用的dynamic-datasource-spring-boot-starter由mybatis-plus官方提供，一个简单的 @DS 注解，即可实现动态数据源的切换
目前打算实现基于shiro的session机制，mybatis-plus提供的spel表达式，从session中实现动态数据源的切换，从而满足多租户应用场景。
## v1.0.1
新增swagger ，可以使用该swagger调试接口
新增spel，基于spel表达式从session、header实现动态数据源切换

