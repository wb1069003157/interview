# Spring 问题
## 何为Spring,Spring的关键模块
为平常的Java应用开发所提供的一个Java开发平台.平常使用比较多的模块有核心模块,数据处理,日志,测试等.

## IOC 和　DI
### IOC　
IOC的含义是控制反转，即将对应的Bean注册入Spring容器中，将Bean的创建,初始化,销毁等都交给容器来管理,让开发者只关注业务场景的使用即可.

生命周期由Spring Bean Factory来进行管理

### DI
DI的含义是依赖注入,是IOC的基础,在编译阶段使其所需的依赖实例化.

有3种方式可以使用
1. 构造器注入
2. get/set方法注入
3. 接口注入


## Bean
### 作用域
1. singleton:单例模式,每个容器中只有一个实例
2. prototype:原型,每个bean请求创建一个实例
3. request:每一个请求一个实例
4. session:每一个session一个实例,当session过期后bean失效
5. application



