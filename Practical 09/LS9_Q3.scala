object LS4_Q3 {
  def main(args: Array[String]) = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val formatedNames = List(
      formatNames(names(0))(name => name.toUpperCase),
      formatNames(names(1))(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase),
      formatNames(names(2))(name => name.toLowerCase),
      formatNames(names(3))(name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase)
    )

    formatedNames.foreach(println)
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
