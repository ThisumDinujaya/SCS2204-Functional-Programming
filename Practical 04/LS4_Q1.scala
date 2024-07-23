object LS4_Q1 {
  def main(args: Array[String]) = {
    val item = Array("Books", "Pencils", "Pens", "Erasers");
    val quantities = Array(40, 20, 15, 10);

    displayInventory(item, quantities);
    restockItem(item, quantities, "Pencils", 15)
    displayInventory(item, quantities);
    sellItem(item, quantities, "Pens", 10);
    displayInventory(item, quantities);
  }

  def displayInventory(item: Array[String], quantities: Array[Int]): Any = {
    if (!(item.isEmpty || quantities.isEmpty)) {
      println(item.head + " --> " + quantities.head);
      displayInventory(item.tail, quantities.tail);
    } else {
      println();
    }
  }

  def restockItem(
      item: Array[String],
      quantities: Array[Int],
      addItem: String,
      addQuantity: Int
  ): Any = {
    var i = 0;
    if (!(item.isEmpty || quantities.isEmpty)) {
      for (n <- item) {
        i += 1
        if (n == addItem) {
          quantities(i - 1) += addQuantity;
          println(
            s"$addQuantity items was added to $n.\n$n --> ${quantities(i - 1)}\n"
          )
        }
      }
    }

  }

  def sellItem(
      item: Array[String],
      quantities: Array[Int],
      buyItem: String,
      removeQuantity: Int
  ): Any = {
    var i = 0;
    if (!(item.isEmpty || quantities.isEmpty)) {
      for (n <- item) {
        i += 1
        if (n == buyItem) {
          if (quantities(i - 1) > 0 && quantities(i - 1) > removeQuantity) {
            quantities(i - 1) -= removeQuantity;
            println(
              s"$removeQuantity items was removed from $n.\n$n --> ${quantities(i - 1)}\n"
            )
          } else {
            println("There is not enough quantity to sell\n")
          }
        }
      }
    }

  }

}
