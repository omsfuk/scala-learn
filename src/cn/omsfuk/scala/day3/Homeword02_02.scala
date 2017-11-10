package cn.omsfuk.scala.day3

object Homeword02_02 {

  // 为了便于Scala类型推导，使用柯里化
  def isSorted[A](as: Array[A])(ordered: (A, A) => Boolean): Boolean = {
    if (as eq as.sortWith(ordered)) true else false
  }

  def main(args: Array[String]): Unit = {
    val as:Array[Int] = Array(1, 2, 3, 4, 5)
    println(isSorted(as)((x, y) => x < y))
  }

}
