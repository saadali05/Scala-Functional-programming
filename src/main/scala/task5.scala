import  scala.annotation.tailrec
object task5 {

  def buildMap[A,B](data:Seq[A],f:A=>B): Map[B,A] = {
    val KV_map = scala.collection.immutable.Map[A,B]()
    @tailrec def BM(data:Seq[A],map: Map[A,B]):Map[A,B] = {
      BM(data.tail,KV_map + (data.head -> f(data.head)))
    }
    buildMap(data,KV_map)
  }

  def main(args: Array[String]): Unit = {
    val lst = Array(1, 2, 3, 4, 5)
    def func(x: Int): Boolean = x % 2 == 0 // entry is even or not
    val result = buildMap(lst, func)
    println(result)
  }
}
