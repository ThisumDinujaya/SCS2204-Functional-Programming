object LS9_Q1 {
  def main(args: Array[String]) = {
    println("Enter the deposit amount: ")
    val deposit = scala.io.StdIn.readDouble()
    val interest = calculateInterest(deposit)
    println(s"Interest earned for Rs. $deposit: Rs. $interest")
  }

  def calculateInterest(deposit: Double): Double = {
    val interestRate = deposit match {
        case d if (d <= 20000) => 0.02
        case d if (d <= 200000) => 0.04
        case d if (d <= 2000000) => 0.035
        case _ => 0.065
    }
    deposit * interestRate
  }
}