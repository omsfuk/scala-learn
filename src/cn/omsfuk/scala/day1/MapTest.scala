package cn.omsfuk.scala.day1

import scala.collection.mutable.Map

class Test {
  def apply(index: Int): Int = {
    return 1;
  }
}

object MapTest {

  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map.getOrElse("1", 1111));
    println(for((k, v) <- map) yield (k, v << 2));

    var test = new Test()
    println(test(20))
  }
}
