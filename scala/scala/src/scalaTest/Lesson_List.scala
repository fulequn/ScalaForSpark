package scalaTest

import scala.collection.mutable.ListBuffer

object Lesson_List {

  def main(args: Array[String]): Unit = {
    //    val list1 = List[Int](xs = 1,2,3)
    //    for(elem <- list1){
    //      println(elem)
    //    }
    //    list1.foreach(println)

    //    val list = List[String]("hello scala", "hello changsha") //注意泛型,不写也可以，尽量要写
    //    val res = list.+("aaa")
    //    print(res)
    //    val result: List[Array[String]] = list.map {
    //      s => s.split(" ")
    //    }
    //    result.foreach(arr => {
    //      println("新的数组")
    //      arr.foreach(println)
    //    })

    //    val nameList = List(
    //      "hello hunan",
    //      "hello changsha",
    //      "hello mingzhen")
    //    val flatmapResult: List[String] = nameList.flatMap {
    //      x => x.split(" ")
    //    }
    //    flatmapResult.foreach(println)

    //    val nameList = List(
    //      "hello hunan",
    //      "hello changsha",
    //      "hello mingzhen")
    //    val strings: List[String] = nameList.filter(s => {
    //      "hello hunan".equals(s)
    //    })
    //    strings.foreach(println)

//    val list = List(1, 2, 3, 4, 5)
//    val value = list.count { x => x > 3 }
//    println(value)

    val list = ListBuffer[Int](1,2,3)
    list.append(4,5,6)
    list.foreach(println)

    
  }

}