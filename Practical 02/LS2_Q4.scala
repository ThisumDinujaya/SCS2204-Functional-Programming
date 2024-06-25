object LS2_Q4 {
  def main(args: Array[String]) = {
    println("If ticket price = Rs. 5, profit = Rs. " + profit(5));
    println("If ticket price = Rs. 10, profit = Rs. " + profit(10));
    println("If ticket price = Rs. 15, profit = Rs. " + profit(15));
    println("If ticket price = Rs. 20, profit = Rs. " + profit(20));
    println("If ticket price = Rs. 25, profit = Rs. " + profit(25));
    println("If ticket price = Rs. 30, profit = Rs. " + profit(30));
    println("If ticket price = Rs. 30, profit = Rs. " + profit(35));
    println("If ticket price = Rs. 30, profit = Rs. " + profit(40));

    def attendees(price: Int): Int = 120 + (15 - price) / 5 * 20
    def revenue(price: Int): Int = attendees(price) * price
    def cost(price: Int): Int = 500 + attendees(price) * 3
    def profit(price: Int): Int = revenue(price) - cost(price)
  }
}
