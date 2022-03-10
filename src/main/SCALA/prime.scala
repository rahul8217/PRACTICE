object prime extends App {
  def isprime(n: Int) = {
    (2 until n) forall (n % _ != 0)
  }
  {
    for (i <- 2 to 50 if isprime(i))
    println(i)
}

}
