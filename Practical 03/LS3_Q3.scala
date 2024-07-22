object LS3_Q3 {
  def main(args: Array[String]) = {
    val num1: Int = 21;
    val num2: Int = 30;
    val avg: Float = average(num1, num2)
    println("Average: " + avg);
  }

  def average(num1: Int, num2: Int): Float = {
    val average: Float = (num1 + num2)/2f
    val round: Float = BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat;
    round
  }
}