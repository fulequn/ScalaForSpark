package scalaTest


/**
 * 一个类继承过个trait时，第一个使用extends，之后使用with
 */

trait Read {

  def read(name: String): Unit = {
    println(s"$name is reading……")
  }

}

trait Listen {

  def listen(name: String): Unit = {
    println(s"$name is listening……")
  }

}

class Human() extends Read with Listen {

}

object Lesson_Trait {

  def main(args: Array[String]): Unit = {
    val h = new Human()
    h.read("zs")
    h.listen("ls")
  }

}