package cn.omsfuk.scala.day3

object homeword03_04 {

  def drop[A](l: List[A], n: Int): List[A] = {
    if (n != 0) {
      l match {
        case Cons(h, t) => drop(t, n - 1)
      }
    } else {
      l match {
        case Nil => Nil
        case Cons(h, t) => Cons(h, drop(t, n))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)
    println(List.toArry(drop(l, 2)).toList)
  }

}
