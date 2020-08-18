

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount1 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf() //设置Spark运行的名称、资源
    //设置名称、
    conf.setAppName("wordcount") //设置运行模式，使用local本地模式
    conf.setMaster("local")

    //创建Spark的上下文,通往Spark集群的唯一通道
    val sc = new SparkContext(conf)

    //返回类型是一个RDD类型
    val lines: RDD[String] = sc.textFile("./data/word")
    //按空格进行切开
    val words: RDD[String] = lines.flatMap(line => {
      line.split(" ")
    }) //计数
    val PairWord: RDD[(String, Int)] = words.map(word => {
      new Tuple2(word, 1)
    })
    //先分组，再对value值进行计算
    val res: RDD[(String, Int)] = PairWord.reduceByKey((v1: Int, v2: Int) => {
      v1 + v2
    })

    //打印结果
    res.foreach(one => {
      println(one)
    })
  }
}
