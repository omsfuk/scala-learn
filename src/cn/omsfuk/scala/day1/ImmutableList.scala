package cn.omsfuk.scala.day1

case class ImmutableList[+T](head: T, tail: ImmutableList[T]);

object ImmutableList {

  def push[T](list: ImmutableList[T], ele: T) = ImmutableList(ele, list)

  def pop[T](list: ImmutableList[T]) = list.tail

  def append[T](a: ImmutableList[T], b: ImmutableList[T]): ImmutableList[T] = a match {
    case null => b
    case ImmutableList(h, t) => ImmutableList(h ,append(t, b))
  }

  def toString[T](a: ImmutableList[T]):String = a match {
    case null => ""
    case _ => a.head + " " + toString(a.tail)
  }

  def main(args: Array[String]): Unit = {
    var list = ImmutableList(1, null)
    list = push(list, 2)
    list = push(list, 3)
    list = push(list, 4)

    var list1 = ImmutableList(2, ImmutableList(3, ImmutableList(4, null)))

    list = append(list, list1)
//    toString(list)
    println(toString(list))

  }
}



