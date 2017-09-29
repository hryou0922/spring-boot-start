# 博客
- 这里的代码的说明和用法，详细见我的博客[Spring Boot系列七 实现自己的spring boot starter工程](http://blog.csdn.net/hry2015/article/details/78127567)

# spring-boot-start
- 通过spring boot实现自己的start工程
- 实现自己的start工程
# first : 模块
- first: 真正的实现模块，不包含spring boot相关的包
- first-spring-boot：start的父工程，pom.xml引入spring boot类，通过dependencyManagement预定义子工程需要用到的jar
- first-spring-boot-autoconfigure：定义需要
- first-spring-boot-starter：空工程类，只在pom.xml

# 测试工程
- test-main：演示如何使用自己的first-spring-boot-starter


