object practice extends App {
  def checkingTwoNumbers(num1: Int, num2: Int ): Unit = {
    println("first number is", num1)
    println("second number is", num2)
    if (num1 == 30) {
      true
      println("first number is 30 therefore condition 1 is true")
    } else if (num2 == 30) {
      true
      println("second number is 30 therefore condition 2 is ture")
    } else if (num1 + num2 == 30) {
      true
      println("since their sum is 30 therefore the code is executed")
    } else {
      false
      println("none of the number is 30 so can't display anything")
    }

  }
  checkingTwoNumbers(30, 45)
  checkingTwoNumbers(53, 30)
  checkingTwoNumbers(25, 5)
  checkingTwoNumbers(37, 41)

}
