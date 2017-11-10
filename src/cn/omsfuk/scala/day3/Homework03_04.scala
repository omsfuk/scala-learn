package cn.omsfuk.scala.day3

object homework {

  def setHead[A](a: A, l: List[A]): List[A] = l match {
    case Cons(h, Nil) => Cons(a, Nil)
    case Cons(h, t) => Cons(h, setHead(a, t))
  }

  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3, 4, 5)
    println(List.toArry(setHead(6, a)).toList)
  }
}
