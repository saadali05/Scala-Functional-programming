object task4 {
  def evencheck(num_array: Array[Int]): Int = {
    if (num_array.isEmpty) {
      0
    }
    else if (num_array.head % 2 == 0) {
      var num_even = 1 + evencheck(num_array.tail)
      print( num_even )
      num_even
    }
    else {
      evencheck(num_array.tail)
    }
  }

  def main(args:Array[String]): Unit = {
    val even_num = Array.fill(100)(util.Random.nextInt(100))
    //    var even_set = scala.collection.mutable.Set[Int]()
    //    for (i <- 0 to even_num.length){
    //      if (even_num(i) % 2 == 0) {
    //        even_set =+ even_num(i)
    //      }
    //    }
    //    println("List of even number below")
    //    for (even_no <- even_set){
    //      println(even_no)
    //    }
    val count2 = even_num.count(_%2 == 0)
    println("number of even values in the array " + count2)
  }
}