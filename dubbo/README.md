# dubbo

这个工程是个人在学习dubbo是写的demo

### 1. 版本及包的分类
```
使用jar包的版本情况如下：
    springboot:2.5.2
    dubbo:2.7.5
    zookeeper:2.7.5

本工程中dubbo为父工程，common,consumer,provider,service为子工程
common:提供model类
consumer:服务消费者
provider:服务提供者
service：提供接口

utils文件夹中的文件与本工程中的代码无关，里面是zookeeper压缩包和dubbo查看控制台的jar包
后续启动项目需要这两个文件配合
```


### 2. 运行步骤
```$xslt
步骤1： 解压utils文件夹中zookeeper压缩包到你想要的位置(如果没有解压.7z格式的软件可以去下载软件7z解压)，双击运行刚刚解压的zookeeper\bin目录下的zkServer.cmd文件

        如果出现闪退的情况，可以用文本形式打开zkServer.cmd,
        在endlocal(最后一行)上面添加pause，保存退出。
        这样子再打开zkServer.cmd会在控制台中显示对应的错误，再去搜索解决问题。

步骤2：启动该项目的ProviderApplication和ConsumerApplication(先启动服务提供者再启动消费者)

步骤3：cmd打开控制台，切换到utils的目录下，输入下面一行的命令(在有配置jdk环境变量的情况)
java -jar dubbo-admin-0.0.1-SNAPSHOT.jar 

打开浏览器访问地址，默认账号密码都是root，点击服务治理可以看到注册上来的服务提供者和消费者
http://localhost:7001/
```

### 3. 测试
```
打开浏览器访问地址
http://localhost:8081/find
若返回 用户小明的JSON字符串 那么则启动成功
```