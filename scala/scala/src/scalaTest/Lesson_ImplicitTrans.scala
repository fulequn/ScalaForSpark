package scalaTest

object Lesson_ImplicitTrans {
  
//  //隐式参数
//  def sayName(implicit name: String): Unit = {
//    println(s"$name is a student")
//  }
  
  def sayName (age: Int) (implicit name: String) : Unit = {
    println(s"$name is a student , age = $age" )
  }
  
  def main(args: Array[String]): Unit = {
    implicit val name: String = "zhangsan"//隐式值
//    implicit val name1: String = "lisi"//隐式值
    sayName(age = 100)
  }
  
}