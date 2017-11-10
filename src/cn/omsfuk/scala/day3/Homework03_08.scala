package cn.omsfuk.scala.day3

object Homework03_08 {

  def main(args: Array[String]): Unit = {
    println(List.foldRight(List(1, 2, 3, 4, 5, 6), Nil: List[Int])(Cons(_, _)))
    println(List(1, 2, 3, 4, 5))
  }

}
