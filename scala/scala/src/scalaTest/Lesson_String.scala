package scalaTest

object Lesson_String {
  
  def main(args: Array[String]): Unit = {
    val s = "wanan"
    val s1 = "WANAN"
    println(s.equals(s1))
    println(s.indexOf("n"))
    println(s.indexOf(97))
  }
  
}