object string extends App{
  def stingConversion(string1: String): String = {
    if (string1.length >= 4)
      (string1.take(string1.length()-4) + string1.drop(string1.length()-4).toUpperCase)
    else
      string1.toUpperCase
  }
  println(stingConversion(string1 = "some"))
  println(stingConversion("something"))
  println(stingConversion("can"))
}
