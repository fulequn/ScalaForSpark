package scalaTest

import java.util.Date;

object Lesson_Function {

  def main(args: Array[String]): Unit = {

    /**
     * 1.方法定义
     *   1） 方法体中最后赶回值可以使用return，如果使用了return，那么方法体的返回值类型一定要指定
     *   2） 如果方法体中没有return，默认将方法体中最后一行计算的结果当做返回值返回。方法体的返回值类型可以省略，会自动腿短返回值类型
     *   3） 定义方法传入的参数一定要指定类型
     *   4） 方法的方法体如果可以一行搞定，那么方法体的“{……}”可以省略
     *   5） 如果定义方法时，省略了方法名称和方法体之间的“=”，无论方法体最后一行计算的结果是什么，都会被丢弃，返回Unit
     */

    //    def max(a: Int, b: Int): Int = {
    //      if (a > b) {
    //        return a;
    //      } else {
    //        return b;
    //      }
    //    }

    //    def max(a: Int, b: Int): Int = {
    //      if (a > b) {
    //        a
    //      } else {
    //        b
    //      }
    //    }

    //    def max(a: Int, b: Int) = if (a > b) a else b;

    /**
     * 2.递归方法
     *   递归方法必须指明返回的参数类型
     */
    //    def fun(num: Int): Int = {
    //      if (num == 1) {
    //        return 1;
    //      } else {
    //        return num * fun(num - 1);
    //      }
    //    }

    /**
     * 3.参数有默认值的方法
     */
    //    def Default_parameters(a: Int = 10, b: Int = 20) = {
    //      a + b
    //    }

    /**
     * 4.参数可变的方法
     */

    //    def Variable_parameters(s: String*) = {
    //      // =>匿名函数
    //      //      s.foreach(elem => { println(elem) })
    //      //当foreach当中的参数只用了一次可以使用下划线 "_" 进行代替
    //      //s.foreach(println(_))
    //      //或者再进行省略
    //      s.foreach(println)
    //      //      for(elem <- s){
    //      //        println(ele)
    //      //      }
    //    }
    //    Variable_parameters("hello", "world", "changsha")

    /**
     * 5.匿名函数
     *   “=>”就是匿名函数，多用于方法的参数是函数时，常用匿名函数
     *   ()=>{} 参数类型=>返回类型，自动推断，直接调用即可。
     */
    //    def Anonymous_function = (a: Int, b: Int) => {
    //      a + b
    //    }

    /**
     * 6.嵌套方法
     *   在一个方法当中再定义一个方法，实现嵌套方法。
     */
    //    def nesting(x: Int): Int = {
    //      def nesting1(y: Int): Int = {
    //        if (y == 1) 1 else y * nesting1(y - 1)
    //      }
    //      nesting1(x)
    //    }

    /**
     * 7.偏应用函数
     *   参数过多且参数大部分是不变的，就可以使用偏应用函数对其进行简化。
     */
    //    def application(date: Date, log: String): Any = {
    //      println("Date is " + date + ", log is " + log)
    //    }

    //    val date = new Date()
    //    application(date, "a")
    //    application(date, "b")
    //    application(date, "c")

    //    val date = new Date()
    //    def app = application(date, _: String)
    //    app("a")
    //    app("b")
    //    app("c")

    /**
     * 8.高阶函数
     *   1）方法的参数是函数
     *   2）方法的返回是函数
     *   3）方法的参数和返回都是函数
     */
    //方法的参数是函数
    //    def fun(a: Int, b: Int): Int = {
    //      a + b
    //    }
    //
    //    def fun1(f: (Int, Int) => Int, s: String): String = {
    //      val i: Int = f(100, 200);
    //      i + "#" + s
    //    }
    //
    //    val result = fun1(fun, "scala") //也可以使用匿名函数
    //    println(result)

    /**
     * 方法的返回是函数
     * 返回类型需要给出，而不能使用推断类型
     */
    //    def return_fun(a: String): (String, String) => String = {
    //      def return_fun1(s1: String, s2: String): String = {
    //        s1 + " " + s2 + " " + a
    //      }
    //      //return_fun1
    //      return_fun1 _ //使用这种方式就不需要给出返回类型,后面的下划线可以将方法直接看成函数，就不必声明返回类型
    //    }
    //
    //    println(return_fun("a")("b", "c"))

    /**
     * 方法的参数和返回都是函数
     */
    //    def fun(f:(Int, Int) => Int): (String, String)=>String = {
    //      val i: Int = f(1, 2)
    //      def fun1(s1: String, s2: String): String = {
    //        s1+"@"+s2+"*"+i
    //      }
    //      fun1
    //    }
    //
    //    val res= fun((a,b)=>{a+b})("hello","changsha")
    //    println(res)

    /**
     * 9.柯里化函数
     *   是对高阶函数的一个简化
     */
//    def Currie(a: Int, b: Int)(c: Int, d: Int): Int = {
//      a + b + c + d
//    }
//    println(Currie(1, 2)(4, 3))

  }

}