object LS7_Q2 {
  def main(args: Array[String]) = {
    val inputList = (List(1, 2, 3, 4, 5));
    val squareList = calculateSquare(inputList);
    println(squareList);
  }

  def calculateSquare(inputList: List[Int]): List[Int] = {
    inputList.map(x => x *x );
  }

}
