package scalaTest

object Lesson_Map {
  
  def main(args: Array[String]): Unit = {
    val map = Map[String, Int]("a"->100, "b"->200, ("c", 300), ("c", 500)) //键相同会覆盖
    map.get("a")
    
//    map.foreach(println)
//    
//    println(map)
//    
//    for(elem <- map){
//      print(elem)
//    }
    
//    val value1 = map.get("a").get   //获取值
//    val value2 = map.get("a")    //获取对象
//    
//    println(value1)
//    println(value2)
    
//    val keys: Iterable[String] = map.keys
//    keys.foreach(key =>{
//      val value = map.get(key).get
//      println("key = "+key+" value = "+value)
//    })
    
//    val values: Iterable[Int] = map.values
//    values.foreach(println)
    
//    val map1 = Map[String, Int]("a"->1, "b"->2, ("c", 3), ("d", 4))
//    val map2 = Map[String, Int]("a"->100, "b"->200, ("c", 300), ("e", 500))
//    val result:Map[String, Int] = map1.++:(map2)//注意
//    result.foreach(println)
    
    //和Set类似，可以定义可变Map
    import scala.collection.mutable.Map
    val map4 = Map[String, Int]()
    map4.put("a", 100)
    map4.put("b", 200)
    map4.put("c", 300)
    map4.put("d", 400)
    map4.foreach(println)
    
    val result3: Map[String, Int] = map4.filter(tp =>{
      val key = tp._1
      val value = tp._2
      println("key = "+key+" value = "+value)
      value == 200
    })
    result3.foreach(println)
  }
  
}