object sum extends App {
  def sum(num1: Int, num2: Int): Unit = {
    println(num1)
    println(num2)
    if (num1 == num2)
      println("since the values are same its triple is", (num1 + num2) * 3)
    else
      println("sum of the digits is ", num1 + num2)
  }
  sum(54, 54)
}
