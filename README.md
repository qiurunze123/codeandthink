### 前言
生产环境内存性能调优方法与代码实践！
 QQ:3341386488
 邮箱：QiuRunZe_key@163.com

我会不断完善，希望大家有好的想法拉一个分支提高，一起合作！


    觉得不错对您有帮助，麻烦右上角点下star以示鼓励！长期维护不易 多次想放弃 坚持是一种信仰 专注是一种态度！


## java ---- GEEKQ的生态系统

    第一部分:
   ![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/codeandthink.png)
   
    代理模式： 黄牛-- 中介 --经纪人 --媒人（都满足条件）穷举法
    
    1.执行者 被代理人
    2.对于被代理人来说这件事情是一定要做的但是我自己又不想做或者没有时间做，所以找代理
    3.需要获取到被代理人的个人资料 
    代理模式关心的是过程，他是一个执行者
    
    代理模式梳理：
    1.拿到最原始被代理对象的引用 获取他的接口
    2.JDK代理重新生成一个类，同时实现我们的代理对象所实现的接口
    3.把被代理对象的引用拿到
    4.重新动态生成一个class的字节码
    5.重新编译
    
    

    
    