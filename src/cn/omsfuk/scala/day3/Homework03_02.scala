package cn.omsfuk.scala.day3

import scala.annotation.tailrec
import scala.reflect.ClassTag

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def tail[A](a: List[A]): List[A] = a match {
    case Cons(h, Nil) => Nil
    case Cons(h, t) => Cons(h, tail(t))
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  def toArry[A: ClassTag](l: List[A]): Array[A] = l match {
    case Cons(h, Nil) => Array.fill[A](1)(h)
    case Cons(h, t) => Array.fill[A](1)(h) ++ toArry(t)
  }

  @tailrec
  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => foldRight(xs, f(x, z))(f)
  }

  def length[A](as: List[A]): Int = foldRight(as, 0)((_, b) => b + 1)


  @tailrec
  def foldLeft[A,B](as:List[A],z:B)(f:(B,A)=>B):B = as match {
    case Nil =>z
    case Cons(x,xs) => foldLeft(xs,f(z,x))(f)
  }

  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3, 4, 5)
    println(toArry(tail(a)).toList)
  }
}
