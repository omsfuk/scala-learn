package cn.omsfuk.scala.day3

object Homework03_05 {

  def dropWhile[A](l: List[A])(f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(h, t) if !f(h) => Cons(h, dropWhile(t)(f))
    case Cons(h, t) if f(h) => dropWhile(t)(f)
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5, 6)
    println(List.toArry(dropWhile(l)(_ % 2 == 0)).toList)
  }

}
