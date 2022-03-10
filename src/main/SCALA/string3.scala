object string3 extends App {
  def reverseString(string1: String): Unit = {
    var revString = ""
    for (i <- string1.length - 1 to 0 by -1) {
      revString = revString + string1(i)
    }
    println(revString)
  }
  reverseString("RAHUL1695")

}
