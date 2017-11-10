package cn.omsfuk.scala.day3

object Homeword02_05 {

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (A) => f(g(A))
  }

  def main(args: Array[String]): Unit = {
    val x2 = (a: Int) => a << 1
    val x4 = (a: Int) => a << 2
    val x8 = compose(x2, x4)
    println(x8(10))

  }

}
