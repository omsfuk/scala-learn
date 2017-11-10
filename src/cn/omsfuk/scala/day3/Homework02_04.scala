package cn.omsfuk.scala.day3

object Homework02_04 {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (A) => (B => f(A, B))
  }

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (A, B) => f(A)(B)
  }

  def main(args: Array[String]): Unit = {
    val sum = curry((a: Int, b:Int) => a + b)
    println(uncurry(sum)(1, 4))
  }
}
