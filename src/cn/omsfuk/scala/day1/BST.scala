package cn.omsfuk.scala.day1

case class BST(left: BST, right: BST, value: Int) {

  def insert(bst: BST, x: Int): BST =
    if (bst == null) BST(null, null, x)
    else if (x < bst.value) BST(insert(bst.left, x), bst.right, bst.value)
    else BST(bst.left, insert(bst.right, x), bst.value)

  def preorder(bst: BST): Unit = {
    if (bst != null) {
      println(bst.value)
      preorder(bst.left)
      preorder(bst.right)
    }
  }
}

object BST {
  def main(args: Array[String]): Unit = {
    var bst = BST(null, null, 5)
    bst = bst.insert(bst, 1)
    bst = bst.insert(bst, 1)
    bst.preorder(bst)
  }
}
