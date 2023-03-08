object task3 {

  def Addition(array1: Array[Double], array2: Array[Double]): Array[Double] = {
    require(array1.length == array2.length)
    val added_numbers = new Array[Double](array1.length)
    for (i <- 0 until array1.length) {
      added_numbers(i) = array1(i) + array2(i)
      println(added_numbers(i))
    }
    added_numbers
  }

  val array1 = Array(1.0,2.0,3.0)
  val array2 = Array(4.0,5.0,6.0)
  def main(args: Array[String]): Unit = {
    println(Addition(array1,array2))
  }
}

