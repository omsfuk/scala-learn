package cn.omsfuk.scala.day3

import scala.annotation.tailrec

object TailRec {

  def e(x: Int*): Int = x(0)


  def fact(x: Int): Long = {

//    def  fc(x: Int, sum: Long): Long = x match {
//      case 0 => sum
//      case _ => fc(x - 1, x * sum)
//    }
    @tailrec
    def fc(x: Int, sum: Long): Long =
      if (x == 0) sum
      else fc(x - 1, x * sum)
    fc(x, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fact(5))
    e(12, 23)
  }

}
