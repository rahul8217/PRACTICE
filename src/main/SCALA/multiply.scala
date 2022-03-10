object multiply extends App {
  def multiplyTable( num1: Int): Int = {
    var i = 1
    var resu = 0
    while (i <= 10) {
      resu = i * num1
      println(resu)
      i += 1
    }
    num1
  }
  multiplyTable(5)
}
