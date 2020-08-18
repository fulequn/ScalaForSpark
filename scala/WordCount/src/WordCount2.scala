
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount2 {
  
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("wordcount").setMaster("local")
    val sc = new SparkContext(conf)
    sc.textFile("./data/word").flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _).foreach(println)
    sc.stop()
  }
  
}
