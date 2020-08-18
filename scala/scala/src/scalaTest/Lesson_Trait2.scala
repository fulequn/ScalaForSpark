package scalaTest

/**
 * Trait中可以有方法体的实现或者方法体的不实现，类继承了Trait要实现Trait中没有实现的方法
 */

trait IsEqual{
  
  def isEqu(o: Any): Boolean
  def isNotEqual(o: Any): Boolean = !isEqu(o)
  
}


class Point(xx:Int, xy: Int) extends IsEqual{
  
  val x = xx
  val y = xy
  
  override def isEqu(o: Any): Boolean = {
    o.isInstanceOf[Point] && o.asInstanceOf[Point].x == this.x
  }
  
}


object Lesson_Trait2 {
  
  def main(args: Array[String]): Unit = {
    val p1 = new Point(xx = 1, xy = 2)
    val p2 = new Point(xx = 1, xy = 3)
    println(p1.isEqu(p2))
  }
  
}