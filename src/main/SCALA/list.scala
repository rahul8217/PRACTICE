object list extends App {
  import scala.collection.mutable.ListBuffer
  def appendingElements(args: Array[String]): Unit = {
    var a = List.empty[String]
    a = List()
    a :+= "pear"
    println(a)
  }
}
