#### Dagger2
	   言简意赅的说，Dagger2是Dagger的升级版，是一个依赖注入框架,
	   由Square公司开发出来，第二代则是由谷歌接手后推出的
	   那很多人会问什么是依赖注入？他的好处是什么，我们继续往下面介绍:

#### 什么是依赖注入
		依赖注入(Dependency injection) 简称DI。
		首先我们要了解类可通过以下几种方式获取所需的对象：
-	1.通过构造传入其所需的依赖项，或者setter。
-	2.某些 Android API（如 Context getter 和 getSystemService()）的工作原理便是如此。
-	3.以传参数形式提供。应用可以在构造类时提供这些依赖项，或者将这些依赖项传入需要各个依赖项的函数。
	其实第三种方式，就是依赖注入的简单说明，通过参数将所需要的对象传递进去，

		总结： 就是为了简化上面的提供获取对象的方式

#### 举个依赖注入的例子
1.有一个Person 类，他可以做任何他想做的事情，
```java
public class Person {
    public void doSomting(String somting) {
        System.out.print("Person can do " + somting);
    }
    ...
}
```

2.突然有一天，他遇到了一个富婆，组成了一个小家庭，
```java
public class SmallFamily {
   private Person xiaoming = new Person(); 
   public void doSmoting() {
       xiaoming.doSomting("!paly game !watch Tv");
   }
   ...
}
```

3.这个时候，其实问题就来了，小明已经和这个小家庭绑定在一起了(耦合性高)，
```java
	SmallFamily xiaomingFamily = new SmallFamily（);
```
4.有一天小明在家偷偷玩游戏,富婆看到了，一气之下把他赶走，
换了个新的男朋友，这时候你会发现，xiaoming已经存在了这个家庭里面，
无法替代，你只能拆了这个SmallFamily，重新修改你的代码， 这违背了设计模式中的 开闭原则(不了解的同学建议百度) 

5.那我们优化一下这个家庭，这样这个家庭就不绑定这个人person了
```java
public class SmallFamily {
   
   public Person boyFrieds;

   public void setPerson(Person person) {
        this.boyFrieds = person;
   }

   public void doSmoting() {
       xiaoming.doSomting("!paly game !watch Tv");
   }

    public static void main(String[] args) {
        SmallFamily xiaomingFamily = new SmallFamily();
        Person boyFrieds = new Person();
        xiaomingFamily.setPerson(boyFrieds);
    }
   ...
}
```
6.这个时候 你会说 what‘s f**k? 这不就是set 方法么，说了半天也只是说了什么明白啊，
其实就是这么简单，这就是依赖注入。

#### Dagger2 使用
    那Dagger2有什么用？ 和依赖注入的关系是什么？怎么使用呢

#####  什么是Dagger2
    我们前面说了，他是适用于 Java、Kotlin 和 Android 的热门依赖项注入库，由 Google 进行维护。Dagger 为您创建和管理依赖关系图，从而便于您在应用中使用 DI。
    
#####  和依赖注入的关系是什么
    真正的开发过程中，在多层架构（常见MVP）中，V层持有M、P层的引用，
    而多个View层的时候，就会有多个MP层，这个时候会产生大量样板代码

有一些库通过自动执行创建和提供依赖项的过程解决此问题。它们归为两类：
  - 基于反射的解决方案，可在运行时连接依赖项。
  - 静态解决方案，可生成在编译时连接依赖项的代码。

很显然Dagger ，它提供了完全静态和编译时依赖项，从实践的角度出发，会让我们更快的了解这个架构


##### 