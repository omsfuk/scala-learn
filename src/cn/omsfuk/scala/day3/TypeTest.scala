package cn.omsfuk.scala.day3

abstract class BulkReader {
  type in
  val source: in
  def read: String
}

class StringBulkReader(val source: String) extends BulkReader {
  type in = String
  def read: String = source
}

object TypeTest {



}
