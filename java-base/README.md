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

## Java 中的自动拆装箱
自动拆装箱即编译器会在作者将一个基本变量 int 赋给一个 Integer 时,将其自动装箱,改为Integer类型,反之则为自动拆箱.

自动拆装箱的对应关系如下所示:
- byte Byte
- short Short
- int Integer
- long Long
- float Float
- double Double
- char Character
- bool Boolean

基本类型 -> 对象:
对象 -> 基本类型:xxxValue()

## JDK 和 JRE有什么区别
JDK:Java Development Kit,java开发包,其包括JRE和一些Java工具,如javac,javap等  

JRE:Java Runtime environment,Java运行时环境,其包括JVM和Java运行过程中所需要的一些核心类库.如lang,util等常用的...

## == 和equals的区别是什么
对于基本类型来说,== 是用来比较两者的字面值是否相同的,基本类型没有equals方法  

对于对象来说,== 是用来比较