package cn.omsfuk.scala.day3

trait RNG {
  type Rand[+A] = RNG => (A, RNG)
  val int: Rand[Int] = _.nextInt
  def nextInt: (Int, RNG)
  def nextNInt(n: Int): Array[(Int, RNG)]
}


case class SimpleRNG(seed: Long) extends RNG {
  override def nextInt: (Int, RNG) = {
    val newSeed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL
    val nextRNG = SimpleRNG(newSeed)
    val n = (newSeed >>> 16).toInt
    (n, nextRNG)
  }

  override def nextNInt(n: Int): Array[(Int, RNG)] = n match {
    case 1 => Array(nextInt)
    case _ => {
      val (num, rng) = nextInt
      Array((num, rng)) ++ rng.nextNInt(n - 1)
    }
  }
}

object main {
  def main(args: Array[String]): Unit = {
    val rng0 = SimpleRNG(111)
    val (num1, rng1) = rng0.nextInt
    println(num1)
    val (num2, rng2) = rng1.nextInt
    println(num2)
    rng0.nextNInt(100).foreach(x => println(x._1))
  }
}