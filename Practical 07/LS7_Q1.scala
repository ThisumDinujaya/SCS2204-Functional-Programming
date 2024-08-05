object LS7_Q1 {
  def main(args: Array[String]) = {
    val inputList = (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    val evenList = filterEvenNumbers(inputList);
    println(evenList);
  }

  def filterEvenNumbers(inputList: List[Int]): List[Int] = {
    inputList.filter(x => x % 2 == 0);
  }

}
