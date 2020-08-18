package scalaTest

import scala.collection.mutable
import scala.collection.immutable


object Lesson_Set {
  
  def main(args: Array[String]): Unit = {
    val set = immutable.Set[Int](1,2,3,4,4)
    val set1 = immutable.Set[Int](3,4,5,6)
    
    for(elem <- set){
      println(elem)
    }
    set.foreach(println)
    
    val result : Set[Int] = set1.diff(set) //差集 
    result.foreach(println)
    
    val result1 : Set[Int] = set1.intersect(set)  //交集
    result1.foreach(println)
    
    //求交集的另外的方式
//    set & set1
//    set.&(set1)
    
    //求差集
//    set &~ set1
//    set.&~(set1)
    
//    filter过滤出满足条件的元素
//    val ints:Set[Int] = set.filter(elem =>{
//      elem >2
//    })
    
    //可变的Set
//    import scala.collection.mutable.Set
//    val set2 = Set[Int](1, 2)
//    val set3 = set.+(3)//不改变set2
//    set2.+=(4)//改变set2
  }
  
}