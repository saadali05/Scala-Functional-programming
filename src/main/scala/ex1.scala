object ex1 {

  def type1 (Array1: Array[String]): Unit = {
    array1(0) = "Raheel,1"
    array1(1) = "Faisal,2"
    array1(2) = "Noman,3"
    array1(3) = "Shayan,4"
    array1(4) = "Saad,5"
    for (x <- array1) {
      println(x)
    }
  }

//  def type2 (args: Array[Int]): Unit =  {
//    val array2 = Array.range(10)
//    var count = 100
//    for (x <- range(10)){
//      count = count + x
//      array2(x) = count
//    }
//    for (y <- array2){
//      println(y)
//    }
//  }

  var array1 =  new Array[String](5);
  def main(args: Array[String]): Unit = {
    println(type1(array1))
//    println(type2())
  }
}