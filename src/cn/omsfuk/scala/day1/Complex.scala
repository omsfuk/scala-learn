package cn.omsfuk.scala.day1

case class Complex(x: Int, y: Int) {

  def +(a: Complex) = Complex(x + a.x, y + a.y)

  def =-=(a: Complex) = Complex(x + a.x, y + a.y)

  override def toString: String = "(" + x + ", " + y + ")"
}

object launcher {
  def main(args: Array[String]): Unit = {
    var a = Complex(1, 2)
    var b = Complex(2, 3)
    var c = a =-= b
    println(c)
  }
}
