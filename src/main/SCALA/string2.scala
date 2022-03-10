object string2 extends App {
  def indexCharacter(string1: String, index1: Int): Unit = {
    if (index1 <= string1.length)
      println(string1.length)
      println(string1.charAt(index1-1))
    if (index1 <= 0)
      println("Please Specify Correct INDEX")
    else
      println("")
  }
  indexCharacter("r", 1)
  indexCharacter("RAHUL", 2)
  indexCharacter("something", 4)
}