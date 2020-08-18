package scalaTest
/**
 * scala:
 * 1.Scala object相当于java中的单例，object中定义的全是静态的.相当于java中的工具类，Object不可以传参，对象要传参，使用apply方法。
 * 2.Scala中定义变量使用var，定义常量使用val，变量可变，常量不可变.变量和常量类型可以不写，会自动类型腿短
 * 3.Scala中每行后面都会有分号自动推断机制，不用显式写出";"
 * 4.建议在Scala中命名使用驼峰命名法
 * 5.定义值尽可能使用val
 * 6.Scala类中可以传参，传参一定要指定类型，有了参数就有了默认了构造。类中的属性默认有getter和setter方法
 * 7.重写构造使用this，且第一行必须调用默认构造。
 * 8.Scala中当new clas 时，类中除了方法不执行【除了构造方法】
 * 9.在同一个scala文件中，class名称和0bject名称一样时，这个类叫做个对象的伴生类，这个对象叫做这个类的伴生对象，他们之间可以互相访问私有变量。
 */
//定义类的时候可以传入参数
class Person(xname: String, xage: Int) {

  //  private val name = xname;
  val name = xname;
  var age = xage;
  var gender = 'M';

  //可以在创建的时候直接执行，类似于java的静态代码块
  println("*****************Person*********************")

  //重写构造
  def this(yname: String, yage: Int, ygender: Char) = {
    this(yname, yage);
    this.gender = ygender;
  }

  def sayName(): Unit = {
    println("hello world " + Person.name)
  }

}

//object不能写构造方法，不能传参，如果出现Person()则说明重写apply方法
object Person {

  val name = "ls";

  //也会执行
  println("***************Lesson_ClassAndObj*************")

  def main(args: Array[String]): Unit = {
    //    val p = new Person(xname = "zs", xage = 20);
    //    println(p.name);
    //    println(p.age);
    //    p.sayName();
    //    val i: Int =100;
    //    println(i);

    //    /**
    //     * if...else....
    //     */
    //    val age = 20
    //    if(age <= 20){
    //      println("age <= 20")
    //    }else if(age <= 30){
    //      println("20 <= age <= 30")
    //    }else{
    //      println("age > 30")
    //    }

    /**
     * for
     */
    //    val r = 1 to 10 //包含10
    //    val r1 = 1 until 10 //不包含10
    //    //操作符函数
    ////    val r = 1.to(10)
    ////  val r1 = 1.until(10)
    //    println(r)
    //    println(r1)

    //小九九
    //    for(i <- 1 until 10){
    //      for(j <- 1 until 10){
    //        if(i >= j){
    //          print(i+"*"+j+"="+i*j+"\t")
    //        }
    //        if(i == j){
    //          println()
    //        }
    //      }
    //    }

    //第二种方式
    //    for(i <- 1 until 10 ; j <- 1 until 10){
    //      if(i >= j){
    //        print(i+"*"+j+"="+i*j+"\t")
    //      }
    //      if(i == j){
    //        println()
    //      }
    //    }

    //    for(i <- 1 to 100; if(i>50); if(i%2==0)){
    //      println(i)
    //    }

    //    val result = for(i <- 1 to 100; if(i>50); if(i%2==0)) yield i
    //    print(result)//Vector类型

    //
    //    var i = 0
    //    while(i<100){
    //      println(s"第 $i 次求婚。。。")
    //      i = i+1
    //      //或者 i += 1 但是不能使用 ++
    //    }

    //使用do while循环
    var i = 0
    do {
      println(s"第 $i 次")
      i = i + 1
    } while (i < 10)
  }

  def apply(i: Int): Unit = {
    println("Score is " + i);
  }

  def apply(i: Int, xage: String): Unit = {
    println("Score is " + i + " age=" + xage);
  }

}

//object Lesson_ClassAndObj {
//  
//  val name = "ls";
//  
//  //也会执行
//  println("***************Lesson_ClassAndObj*************")
//  
//  def main(args:Array[String]): Unit = {
//    val p = new Person(xname = "zs", xage = 20);
//    println(p.name)
//    println(p.age)
//    p.sayName()
////    val i: Int =100;
////    println(i);
//  }
//  
//}