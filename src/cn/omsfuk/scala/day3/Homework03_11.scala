package cn.omsfuk.scala.day3

object Homework03_11 {

  def sum(l: List[Int]): Int = List.foldLeft(l, 0)((x, y) => x + y)

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3, 4, 5, 6)))
  }

}
