package cn.omsfuk.scala.day3

object Homework03_10 {

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5, 6)
    println(List.foldLeft(l, "")(_ + _))
    println(List.foldRight(l, "")(_ + _))
  }
}
