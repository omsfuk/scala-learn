package cn.omsfuk.scala.day3

import scala.annotation.tailrec

object Homework02_01 {

  def fib(x: Int): Int = x match {
    case 1 => 0
    case 2 => 1
    case _ => fib(x - 1) + fib(x - 2)
  }

  def main(args: Array[String]): Unit = {
    println(fib(5))
  }

}
