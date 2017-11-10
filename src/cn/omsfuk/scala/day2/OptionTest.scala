package cn.omsfuk.scala.day2

sealed trait Option[+A]

case class Some[+A](get: A) extends Option[A]

case object None extends Option[Nothing]

object option {
  def main(args: Array[String]): Unit = {
    def main() {}
  }
}
