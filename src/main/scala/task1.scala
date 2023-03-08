import scala.util.control.Breaks._
object task1 {
  def main(args: Array[String]): Unit = {
    var mylist = new Array[Int](15)
    for (x <- 0 to 14) {
      val rand = new scala.util.Random
      var number = rand.between(50, 500)
      mylist(x) = number
    }

    var prime_list = List(Int)
    for (y <- mylist) {
      var ab = y
      //      println(y)
      if (ab > 1) {
        breakable {
          for (s <- 2 to (ab / 2) + 1) {
            var prime_check = ab % s
            if (prime_check == 0) {
//              println(ab, "is not a prime number")
              break
            }
            else {
//              println(ab, "is a prime number")
              prime_list :+ ab
            }
          }
        }
      }
    }
    for (cv <- prime_list){
    println(cv)
    }
    val map1 = prime_list.zipWithIndex.map{ case (v,i) => (i,v) }.toMap
    println("The values of map : "+ map1)
  }
}
