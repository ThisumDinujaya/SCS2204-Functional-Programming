import scala.io.StdIn.readInt

object LS4_Q2 {
  def main(args: Array[String]) = {
    print("Input a integer number: ")
    var number = readInt()

    PatternMatching(number)
  }

  def PatternMatching(number: Int) = {
    number match {
      case x if x <= 0       => println("Negative/Zero")
      case x if (x % 2 == 0) => println("Input is even")
      case _x                => println("Input is odd")
    }
  }

}
