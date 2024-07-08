object demo {
  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Applying different formats to the names
    println(formatNames(names(0))(toUpper))   // BENNY
    println(formatNames(names(1))(name => toUpper(name.substring(0, 2)) + name.substring(2))) // NIroshan
    println(formatNames(names(2))(toLower))   // saman
    println(formatNames(names(3))(name => toUpper(name.substring(0, 1)) + name.substring(1, name.length - 1) + toUpper(name.substring(name.length - 1)))) // KumarA
  }
}

