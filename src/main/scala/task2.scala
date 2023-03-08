import scala.annotation.tailrec

object task2{
  def CharArrayL(start: Int): List[Char] = {
    @tailrec def Chararray(S: Int, mylist: List[Char] = Nil): List[Char] = {
      if (S != 122) {
        Chararray(S + 1, mylist :+ S.toChar)
      }
      else {
        mylist
      }
    }
    Chararray(start)
  }

  def CharArrayU(start: Int): List[Char] = {
    @tailrec def Chararray(S: Int, mylist: List[Char] = Nil): List[Char] = {
      if (S != 90) {
        Chararray(S + 1, mylist :+ S.toChar)
      }
      else {
        mylist
      }
    }

    Chararray(start)
  }

  def main(args:Array[String]) = {
    println(CharArrayL(97))
    println(CharArrayU(65))
  }
}
