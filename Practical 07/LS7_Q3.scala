object LS7_Q3 {
  def main(args: Array[String]) = {
    val inputList = (List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    val primeList = filterPrime(inputList);
    println(primeList);
  }

  def filterPrime(inputList: List[Int]): List[Int] = {
    inputList.filter(x => isPrime(x));
  }

  def isPrime(num: Int): Boolean = {
    if (num <= 1) {
        return false
    }
    for (i <- 2 to num-1) {
         if (num % i == 0) {
            return false
        }
    }
    return true
  }
}