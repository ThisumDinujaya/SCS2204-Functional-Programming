object LS3_Q4 {
  def main(args: Array[String]) = {
    val num = List(1,2,3,4,5,6,7,8,9,10);
     println("Orginal list : " + num);
    val sumOfList = sumEvenNum(num);
    println("The sum of all the even numbers in the list : " + sumOfList);
  }

  def sumEvenNum(inputList: List[Int]): Int =
    val evenList = inputList.filter(_ % 2 == 0);
    evenList.sum
}