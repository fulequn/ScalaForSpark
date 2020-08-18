package scalaTest
package scalaTest

class Rabbit1(xname: String) {

  val name = xname

}

/**
 * 隐式类不能定义到外部
 * 相当于包装类
 */
object Lesson_implicitTrans3 {

  //只能传入一个参数
  implicit class Animal1(r: Rabbit1) {
    def showName(): Unit = {
      println("${r.name} is Rabbit")
    }
  }

  //  implicit class Animal1(r:Rabbit1, age: Int){
  //    def showName(): Unit = {
  //      println(s"${r.name} is Rabbit")
  //    }
  //  }

  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit1(xname = "RABBIT")
    rabbit.showName()
  }

}