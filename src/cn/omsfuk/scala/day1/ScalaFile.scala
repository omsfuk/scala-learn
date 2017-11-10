package cn.omsfuk.scala.day1

import scala.io.Source

object ScalaFile {

  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("/Users/omsfuk/js.js")
    file.getLines().foreach(println)
  }

}
