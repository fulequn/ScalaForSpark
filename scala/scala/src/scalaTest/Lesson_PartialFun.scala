package scalaTest

/**
 * 偏函数，只能匹配一个值，匹配上T放回某个值
 * PartialFunction[A，B]  A是匹配的类型，B是匹配上返回的类型
 */
object Lesson_PartialFun {

  /**
   * 写明匹配什么类型，然后输出什么类型
   */
  def MyTest: PartialFunction[String, Int] = {
    case "abc" => 3
    case "a"   => 1
    case "b"   => 2
    case _     => 0
  }

  def main(args: Array[String]): Unit = {
    val res: Int = MyTest("abc")
    println(res)
  }

}