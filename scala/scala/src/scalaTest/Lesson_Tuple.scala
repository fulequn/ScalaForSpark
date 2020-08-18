package scalaTest

/**
 * 最多可以写上22个元组的数据类型
 */
object Lesson_Tuple {

  def main(args: Array[String]): Unit = {
    //可以写new 也可以不写new 
    //可以直接写括号
    val tuplel: Tuple1[String] = new Tuple1("hello")
    val tuple2: (String, Int) = new Tuple2("a", 100)
    val tuple3: (Int, Boolean, Char) = new Tuple3(1, true, 'C')
    val tuple5: (Int, Double, String, Boolean) = Tuple4(1, 3.4, "abc", false)
    val tuple6: (Int, Int, Int, Int, Int, String) = (1, 2, 3, 4, 5, "abe")
    val tuple22 = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)//最多支持22个元素
    (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)//最多支持22个元素
//    println(tuple22._13)  //序号从1开始
    val iter:Iterator[Any] = tuple3.productIterator
//    while(iter.hasNext){
//      println(iter.next())
//    }
    
//    iter.foreach(println)
    
    println(tuple2.swap)    //反转
  }

}