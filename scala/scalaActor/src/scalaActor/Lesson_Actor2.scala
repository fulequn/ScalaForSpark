package scalaActor

import scala.actors.Actor

case class Msg(actor: Actor, msg: String) {
  
}

//Actor之间的通信
class MyActor1 extends Actor {
  override def act(): Unit = {
    while (true) {
      receive {
        case msg: Msg => {
          println("type is String , s is " + msg.msg)
          msg.actor ! " this is yueyue niao"
        }
        case _ => { println("no match ...") }
      }
    }
  }
}

class MyActor2(actor: Actor) extends Actor {
  actor ! Msg(this, "this is huang yueyue ...")
  override def act(): Unit = {
    while (true) {
      receive {
        case s: String => { println("type is String , s is " + s) }
        case _         => { println("no match ...") }
      }
    }
  }
}

object Lesson_Actor2 {

  def main(args: Array[String]): Unit = {
    val actor1 = new MyActor1()
    val actor2 = new MyActor2(actor1)

    actor1.start()
    actor2.start()
  }

}