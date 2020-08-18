package scalaTest


class Animal(name: String){
  
  def canFly(): Unit = {
    println(s"$name can fly……")
  }
  
}

class Rabbit(xname: String){
  
  val name = xname
  
}

object Lesson_implicitTrans2 {
  
  
  /**
   * 隐式转化函数
   * 将Rabbit转化为Animal，就可以调用Animal的方法
   */
  implicit def RabbitToAnimal(r: Rabbit): Animal = {
    new Animal(r.name)
  }
  
  //不能出现相同类型，哪怕名称不同
//  implicit def RabbitToA(r: Rabbit): Animal = {
//    new Animal(r.name)
//  }
  
  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit(xname="rabbit")
    rabbit.canFly()
  }
  
}