object LS3_Q2 {
  def main(args: Array[String]) = {
    val animals = List("Elephant", "Tiger", "Lion", "Monkey", "Penguin");
     println("Orginal list : " + animals);
    val newList = lengthGT5(animals);
    println("The strings that have a length greater than 5 : " + newList);
  }

  def lengthGT5(inputList: List[String]): List[String] =
    inputList.filter(_.length > 5)
}