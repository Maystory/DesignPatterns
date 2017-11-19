# DesignPatterns

Head First DesignPatterns
 
the  code&notes


## 命令模式 -------->(封装调用)

> 将请求封装成对象,以便使用不同的请求,队列,或日志 来参数化其他对象,命令模式也支持撤销的操作.

- 命令模式将发出请求的对象和执行请求的对象解耦
- 在被解耦的两者之间是通过命令对象进行沟通的,命令对象封装了接受者和一个或者一组对象
- 调用者通过调用命令对象的execute()发出请求,这会使得接收者的动作会被调用
- 调用者可以接收命令对象作为参数,甚至可以在运行的时候动态的进行
- 命令可以支持撤销,做法是实现一个undo方法来回到execute()被执行前的状态
- 宏命令是命令的一种简单的延伸,允许调用多个命令,宏方法也支持撤销
- 实际操作时,很常见的是使用"聪明的对象",也就是直接实现了请求,而不是将工作委托给了接受者
- 命令也可以实现日志和事务系统

## 单例模式

> 确保一个类只有一个实例,并提供一个全局的访问点

- Java中实现单例模式:构造方法私有化,一个静态方法,一个静态变量
- 两种方式实现单例:延迟实例化和急切实例化

## 适配器模式&&外观模式
> 适配器模式:将一个类的接口,转换成客户期望的另一个接口.适配器让原本接口不兼容的类可以合作无间.
> 外观模式:提供了一个统一的接口,用来访问子系统中的一群接口.外观定义了一个高层接口,让子系统更容易的使用.

- 适配器有两种模式:对象适配器和类适配器,类适配器需要用到多重继承.
- 实现一个适配器所需要做的工作与目标的接口大小成正比
- 一个适配器被被包装了多个被适配者就称为了外观模式
- 三种模式对比:
```
装饰者模式:不改变接口但改变责任
适配器模式:将一个接口转换成另一个接口
外观模式:让接口更简单
```





 

# 设计原则:
- 找出应用中的可能需要变化的地方,把他们独立出来,不要和那些不变的混合在一起
- 针对接口编程,而不是针对实现编程
- 多用组合少用继承
- 为了交互对象之间的松耦合设计而努力
- 类应该对扩展开发,对修改关闭
- 依赖倒置:要依赖抽象,不要依赖具体类
- 最少知识原则:减少对象之间的交互,只和你的密友谈话.
