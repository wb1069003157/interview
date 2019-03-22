# Java 常见基础面试题

## 什么是 Java 虚拟机,为什么Java是平台无关性的语言?
jvm相关3个概念:jvm,jre,jdk
- jdk:Java开发工具包,包含jre和Java开发工具,如javac等
- jre:Java运行环境,包括JVM和一些核心类库
- jvm:Java虚拟机,Java代码运行的地方,本质是一个进程,用来执行Java字节码

Java平台无关性的原因就是因为Java在编译后会生成Java字节码,而不是与底层机器相关的机器码,这样字节码在经过JVM后就可以转化为不同机器码,达到平台无关性.

## static 关键字的意义? private 和 static 的方法是否可以重写(override)?
static 表示申明的类或方法或变量是静态的,即不属于某个对象,而属于整个类.由此可见,在static内部是无法操作非static变量的,因为非static变量在对象生成时才会出现,而static在类初始化时就已经存在了.

private 和 static 方法无法重写.private 方法只属于对象自身,无法被外界访问,不存在重写.static 方法属于整个类,也不存在重写的情况.
