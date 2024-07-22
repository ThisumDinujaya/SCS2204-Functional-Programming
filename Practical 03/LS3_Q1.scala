object LS3_Q1 {
  def main(args: Array[String]) = {
    val str = "Hello, world"
    println("Orginal String: " + str)
    println("Reversed String: " + reverseString(str))
  }

  def reverseString(str: String): String = {
    if (str.isEmpty()) str
    else (reverseString(str.tail) + str.head)
  }
}
