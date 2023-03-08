object ex2 {
  var myset1 = scala.collection.mutable.Set("My name is Saad")
// Using MUTABLE AND IMMUTABLE COLLECTIONS of scala we can characterise Set nature
//  By using scala.collection.mutable/immutable.Set()
  var mymap = Map[String,Int](("Team1",50),("Team2",40),("Team3",30),("Team4",20))

  def main(args:Array[String]): Unit = {
    println(myset1)
    println(myset1 + "I'm 19 years old")
    mymap += ("Team5"->10)
    println(s"Adding new element in map ${mymap}")
  }
}