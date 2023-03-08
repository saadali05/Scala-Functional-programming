//import scala.collection.mutable.ListBuffer
//object testing {
//  def evencheck(num_array: Array[Int]): Int = {
//    if (num_array.isEmpty) {
//      0
//    }
//    else if (num_array.head % 2 == 0) {
//      var num_even = 1 + evencheck(num_array.tail)
//      print( num_even )
//      num_even
//    }
//    else {
//      evencheck(num_array.tail)
//    }
//  }
//
//  def main(args:Array[String]): Unit = {
//    val even_num = Array.fill(100)(util.Random.nextInt(100))
////    var even_set = scala.collection.mutable.Set[Int]()
////    for (i <- 0 to even_num.length){
////      if (even_num(i) % 2 == 0) {
////        even_set =+ even_num(i)
////      }
////    }
////    println("List of even number below")
////    for (even_no <- even_set){
////      println(even_no)
////    }
//    val count2 = even_num.count(_%2 == 0)
//    println("number of even values in the array " + count2)
//  }
//}
//object  testing {
//  def main(args: Array[String]): Unit = {
//    def buildMap[A, B](data: Seq[A], f: A => B): Map[B, A] = {
//      data.map(x => (f(x), x)).toMap
//    }
//
//    val lst = Array(95, 2, 79, 4, 5)
//    def func(x: Int): Boolean = x % 2 == 0
//    val result = buildMap(lst, func)
//    println(result)
//    // Output: Map(1 -> false, 2 -> true, 3 -> false, 4 -> true))
//  }
//}
