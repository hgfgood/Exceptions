# 常见异常和错误总结
[TOC]

## NoClassDefFoundError

错误原因：在**隐式**加载类的时候，没有找到要加在的类。

触发隐式加载类的可能情况：
1. new 关键字
2. 属性引用某个类，即使用类实例作为成员变量
3. 继承类或者接口
4. 方法参数传递了某个类的引用

解决方法：
确保每个类都在当前的classpath里面。


## ClassNotFoundException

错误原因：在**显示**加载类的时候，没有找到要加在的类。

触发显示加载类的可能情况：
1. 类`Class`的`forName()`方法
2. 类`ClassLoader`的`loadClass()`方法
3. 类`ClassLoader`的`findSystemClass()`方法
4. 自定义类加载器加载类。

解决方法：
检查当前的 **classpath** 下面是否存在该类（包括包名路径完整）。

> 使用`this.getClass().getClassLoader().getResource("").toString()`产看当前的**classpath**。


