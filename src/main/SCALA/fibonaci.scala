object Fibo_series extends App {
  def fib_series(n: Int): Int = {
    var num1 = 0
    var num2 = 1
    var i = 0
    println(num1)
    println(num2)
    while (i < n) {
      val res = num1 + num2
      println(res)
      num1 = num2
      num2 = res
      i = i + 1
    }
    num1
  }
  (fib_series(n = 10))
}
