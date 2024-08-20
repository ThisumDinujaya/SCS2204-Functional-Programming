object LS9_Q2 {
  def main(args: Array[String]) = {
    print("Input a integer number: ")
    val number = scala.io.StdIn.readInt()

    val matchNumber = number match {
      case n if (n <= 0) => "Negative/Zero is input"
      case n if (n % 2 == 0) => "Even number is given"
      case _ => "Odd number is given"
    }

    println(matchNumber)
  }
}
