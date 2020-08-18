package scalaActor

import scala.actors.Actor

class MyActor extends Actor{
  override def act(): Unit = {
    receive{
      case s:String =>{println("type is String , s is " + s)}
      case _=> {println("no match ...")}
    }
  }
}
object Actor1 {
  def main(args: Array[String]): Unit = {
    val actor = new MyActor()
    actor.start()
    //actor ! "hello changsha"
    actor ! 100
  }
}
