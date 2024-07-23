import scala.io.StdIn.readLine;
object LS5_Q3 {
  def main(args: Array[String]) = {
    println("Enter the list of products. (Enter 'done' to stop.)")
    val list = getProduntList(List())
    printProductList(list)
    println(
      "\nTotal products: " + getTotalProducts(list) + "\n"
    )
  }

  def getProduntList(list: List[String]): List[String] = {
    val str = readLine().trim
    if (str.toLowerCase == "done") list
    else getProduntList(list :+ str)
  }

  def printProductList(list: List[String]): Unit = {
    println("\nProducts list: ")
    list.foreach(item => println(s"${list.indexOf(item) + 1} ${item}"))
  }

  def getTotalProducts(list: List[String]): Int = list.length

}
