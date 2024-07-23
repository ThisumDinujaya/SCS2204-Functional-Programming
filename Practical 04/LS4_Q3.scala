object LS4_Q3 {
  def main(args: Array[String]) = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames(names(0))(toUpper))
    println(
      formatNames(names(1))(str => toUpper(str.take(2)) + toLower(str.drop(2)))
    )
    println(formatNames(names(2))(toLower))
    println(
      formatNames(names(3))(str =>
        toUpper(str.take(1)) + toLower(str.drop(1).init) + str.last.toUpper
      )
    )
  }

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }
}
