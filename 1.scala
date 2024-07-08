object demo {

  var itemNames: Array[String] = Array("Apple", "Banana", "Orange")
  var itemQuantities: Array[Int] = Array(12, 7, 25)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(Name: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(Name)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $Name. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $Name does not exist in inventory.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. New quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in stock to sell $quantity. Current quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $itemName does not exist in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apple", 5)
    sellItem("Banana", 2)
    sellItem("Orange", 25)
    restockItem("Grapes", 10)
    displayInventory()
  }
}
