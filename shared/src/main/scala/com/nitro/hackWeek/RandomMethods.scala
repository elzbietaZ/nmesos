package links

import scala.reflect.classTag

object randomMethods {

  implicit val sth: Int = 999
  var strangeName_1: String = "&&&&&&&&"

  def SomeMethod(a: String, b: String, c: String) = {
    val www = a + b + c
    www
  }

  def someMethod2(a: String, b: String, d: String) = {
    val vvv = a + b + d
    vvv
  }

  def someMethod3(a: String, b: String, d: String) = {
    val vvv = a + b + d
    vvv
  }

  def whyNot() = {
    new Thread {
      println("Ruuuning!")
    }
  }

  def getIt(param: Option[Int]): String = {
    param.get match {
      case 1 => "a"
      case 2 => "b"
    }
  }

  def getLast(list: List[Int]) = {
    if (list.last < 123456) throw new Error()
  }

}