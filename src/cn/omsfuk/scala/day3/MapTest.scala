package cn.omsfuk.scala.day3

object MapTest {

  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 2)
    println(map.get("a"))
    println(map.get("b").getOrElse(1))
    println(map.get("c"))
  }
}
