package cn.omsfuk.scala.day4

object NaturalInvoke {

  def isEven(x: Int): Boolean = x % 2 == 0

  def main(args: Array[String]): Unit = {
    List(1, 2, 3, 4, 5) filter isEven foreach println

    val a = 1
    val b = 5
    val c = if (a > b) 1 else 3.3
    (1 to 10) foreach print
    val for { i <- (1 to 10) } yield i

  }

}
