package scalaTest

import scala.collection.mutable.ArrayBuffer

object Lesson_Array {

  def main(args: Array[String]): Unit = {
//    val arr = Array[String](xs = "a", "b", "c", "d")
//    //    val arr1 = new Array[Int](3)
//    val arr1 = new Array[String](3)
//    val array = new Array[Array[Int]](3)
//
//    array(0) = Array[Int](xs = 1, 2, 3)
//    array(1) = Array[Int](xs = 4, 5, 6)
//    array(2) = Array[Int](xs = 7, 8, 9)
//    Array.concat(arr, arr1)
//    val array2: Array[String] = Array.fill(5)("heloo")

    //    arr1(0) = 100
    //    arr1(1) = 200
    //    arr1(2) = 300
    //不能添加
//    arr1.foreach(println)

    val arr = ArrayBuffer[Int](elems = 1, 6, 8)
    arr.+=(4) //添加到末尾
    arr.+=:(100) //添加到头部
    arr.append(45, 56, 95)
    arr.foreach(println)

  }

}