package cn.omsfuk.scala.day1

object ArrayTest {

  case class Node(left: Node, right: Node, value: Int)

  def main(args: Array[String]) : Unit = {
    val a = Array(1, 2, 3, 4, 5)
    for (ele <- a) println(ele)
//    a.sortBy()
    scala.util.Sorting.quickSort(a)
    println(a);
    for (i <- 0 to a.length - 1) {
      println(a(i))
    }
  }

}
