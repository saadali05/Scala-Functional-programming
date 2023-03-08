object ex4 {
  def calculator(X:Double, Y:Double, F:(Double,Double)=>Double): Double = F(X,Y)

  def main(args: Array[String]): Unit = {
    var add = calculator(10,15,(X,Y)=>X+Y)
    println(add)
    var sub = calculator(10, 15, (X, Y) => X - Y)
    println(sub)
    var mul = calculator(10, 15, (X, Y) => X * Y)
    println(mul)
    var div = calculator(10, 15, (X, Y) => X / Y)
    println(div)

  }
}
