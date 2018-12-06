### 前言
生产环境内存性能调优方法与代码实践！
 QQ:3341386488
 邮箱：QiuRunZe_key@163.com

我会不断完善，希望大家有好的想法拉一个分支提高，一起合作！


    觉得不错对您有帮助，麻烦右上角点下star以示鼓励！长期维护不易 多次想放弃 坚持是一种信仰 专注是一种态度！


## java ---- GEEKQ的生态系统

    第一部分:
   ![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/codeandthink.png)
   
    代理模式： 黄牛-- 中介 --经纪人 --媒人（都满足条件）穷举法  核心 -- 解耦
    
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
    
    //InvocationHandler Proxy classLoader 三要素 
    
    ---------------------------------------->>>>核心区别 
    JDK的动态代理是通过接口来进行强制转换的
    生成以后的代理对象，可以强制转换为接口
    ----------------------------------
    CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
    生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
    子类引用赋值给父类
    -------------------------------
    springaop代理模式使用比较多.....
    

    -----------------------------------------------------------------||||||
    工厂模式 --复杂的逻辑处理过程隐藏掉 只关心执行结果
    
    简单工厂： 代码复杂，没有隐藏复杂逻辑，不好管理
    工厂： 能够实现各自逻辑
    抽象工厂：实现各自该有的逻辑,隐藏逻辑,解放双手
    
    spring的工场模式 各种bean的生产如果不用工厂模式那将会很复杂，代码很冗杂 ,维护很困难
    达到解耦
    -----------------------------------------------------------------||||||
    单例模式
    保证系统从开始到停止都只会产生一个实例
    常用的单例模式：
    穷举：
    配置文件： 如果不是单例则容易混淆不知道
    计数器：类似于计数器之类的存在，一般都需要使用一个实例来进行记录，若多例计数则会不准确。
    ----------------------------------------------->>>>>
    　单例模式有以下特点：
    　　1、单例类只能有一个实例。
    　　2、单例类必须自己创建自己的唯一实例。
    　　3、单例类必须给所有其他对象提供这一实例。
    ----------------------------------------------->>>>>>
      基础知识普及一下在开始前：
      1.从上往下java的变量需要先声明才能使用
      2.先静态后动态（对象实例化）（静态块和static关键字修饰在实例化以前分配内存空间）
      3.先属性后方法（成员变量不能定义在方法中，只能定义在class下）
      ---------------------------->>>>>>
      成员变量是在类范围内定义的变量
      局部变量是在一个方法内定义的变量
    有七种写法：（身为老司机的大家应该都知道）
    懒汉式（4种） -- 饿汉式（1种） -- 双重加锁机制 -- 内部类方式 -- 枚举类 -- 以及各自衍生
    
    ----------------------------------------------------------------|||||||||
    
    委托模式：
    类B和类A是两个互相没有任何关系的类，但是B具有和A一模一样的方法和属性
    并且调用B中的方法/属性就是调用A中同名的方法和属性
    B好像就是一个受A授权委托的中介，第三方的代码不需要知道A的存在
    也不需要和A发生直接的联系，通过B就可以直接使用A的功能，
    这样既能够使用到A的各种公能，又能够很好的将A保护起来
    委派模式使得我们可以用聚合来代替继承
    --------------------------------------------------->
    关心结果.不关心过程 主要为了隐藏具体的实现模式  持有被委托人的引用
    IOC容器中，有一个register的东西（为了告诉我们的容器，在这个类的初始化的过程中，需要做很多的不同逻辑的处理需要实现
    多个的任务执行者分别实现各自的功能）
    
    
    ----------------------------------------------------------------|||||||||
    策略模式：到达目的地有多种的方法去到达，旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略
    
    结果是不变的，但是到达目的地的过程是千变万化的  ---------
    
    ----------------------------------------------------------------|||||||||
    原型模式：创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式，对对象进行拷贝
    
    浅克隆不会克隆原对象之间的引用类型，仅仅拷贝了引用类型的指向
    深克隆则拷贝了所有。也就是说深克隆能够做到原对象和新对象之间完全没有影响。
    
    1.浅克隆：只复制基本类型的数据，引用类型的数据只复制了引用的地址，引用的对象并没有复制，在新的对象中修改引用类型的数据会影响原对象中的引用。
    2.深克隆：是在引用类型的类中也实现了clone，是clone的嵌套，复制后的对象与原对象之间完全不会影响。
    3.使用序列化也能完成深复制的功能：对象序列化后写入流中，此时也就不存在引用什么的概念了，再从流中读取，生成新的对象，新对象和原对象之间也是完全互不影响的。
    4.使用clone实现的深克隆其实是浅克隆中嵌套了浅克隆，与toString方法类似
    
    ---------------------------------------------------------------- |||||||||
    模板模式：完成一件事情，有固定的数个步骤，但是每个步骤根据对象的不同，而实现细节不同；就可以在父类中定义一个完成该事情的总方法，
    按照完成事件需要的步骤去调用其每个步骤的实现方法。每个步骤的具体实现，由子类完成。
    
     