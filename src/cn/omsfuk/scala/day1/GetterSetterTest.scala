package cn.omsfuk.scala.day1

class GetterSetterTest {

  var field1: String = _

  var field2: String = _

  private var field3: String = _

  private[this] var field4: String = _

}

object GetterSetterTest {
  def tes(): Array[Int] = Array(1, 2, 3)
  def main(args: Array[String]): Unit = {
    var test = new GetterSetterTest
    println(test.field1)
    println(test.field2)
    println(test.field3)
    for (ele <- tes) {
      println(ele)
    }

  }
}

