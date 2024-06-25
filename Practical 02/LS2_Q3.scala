object LS2_Q3 {
  def main(args: Array[String]) = {
    println("Take home salary of an employee = Rs. " + takeHome(40, 30));

    def normal(hours: Int): Int = hours * 250;
    def ot(hours: Int): Int = hours * 85;
    def income(norH: Int, otH: Int): Int = normal(norH) + ot(otH);
    def tax(income: Int): Double = income * 0.12;
    def takeHome(norH: Int, otH: Int): Double = income(norH, otH) - tax(income(norH, otH));
  }
}
 
