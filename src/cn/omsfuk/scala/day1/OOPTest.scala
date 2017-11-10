package cn.omsfuk.scala.day1

class OOPTest(name: String, age: Int) {

  oop =>

  class Inner {
    def run(): Unit = {
      println(oop.name + " : " + oop.age)
    }

    def foo(obj: Inner): Unit = {
      println(obj)
    }
  }

  private def go(): Unit = {
    println("GO")
  }

}

object oop {
  def main(args: Array[String]): Unit = {
    val obj = new OOPTest("omsfuk", 1024)
    val innerObj1 = new obj.Inner()
    val innerObj2 = new obj.Inner()
    innerObj1.foo(innerObj2)
    OOPTest.staticMethod()
    innerObj1.run()
  }
}

object OOPTest {
  def staticMethod(): Unit = {
    println("I'm static method")
  }
}
