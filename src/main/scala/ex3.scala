object ex3 {
  def fraction(num: Double, den:Double): Option[Double] = {
    if (den == 0) None
    else (Some(num/den))
  }

  def main(args:Array[String]): Unit = {
    println(fraction(34, 2))
    println(fraction(64, 0))
  }
}
//object ex3 {
//  def fraction(num: Double, den:Double, sign:Double): Option[Double] = {
//    if (sign == "+") {
//      var sum_num = num + den
//      sum_num
//    } else if (sign == "-") {
//      var sub_num = num - den
//      sub_num
//    }
//
//    //  else (Some(num/den))
//    //  }
//
//    def main(args:Array[String]): Unit = {
//      println(fraction(34, 0,"+"))
//      println(fraction(64, 4,"-"))
//    }
//  }