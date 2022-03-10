object string4 extends App {
  def compareStrings(string1: String, string2: String): Unit = {
    println(string1)
    println(string2)
    string1.compareTo(string2)
    if (string1 > string2) {
      println(string1+ "is greater than the"+ string2)
      return
    }
    //string1.compareTo(string2)
    if (string1 < string2) {
      println(string1+ "is smaller than the"+ string2)
      return
    }
    //string1.compareTo(string2)
    if (string1 == string2)
      println(string1+ "is equal to"+ string2)
    else
      println(string1+ "is not equal to"+ string2)
  }
  compareStrings("this is rahul kumar", "this is rahul kumar")
  compareStrings("rahul 12is kingmaker", "rahul 121is kingmaker")
  compareStrings("this is string 1", "this is string 2")
  compareStrings("this is blacky", "this is black")
}
