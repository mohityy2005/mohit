case class Organisation(id:Int, name:String, yearEst:Int)
object Mohit extends App {

  val info =Organisation(1,"USA",2020)
  val infoOne=Organisation(2,"India",2022)

  info match {
     case a: Organisation if (a.yearEst == 2021) => println("This is the new org of " + a.name)
     case b => infoOne match {
       case c: Organisation if (c.yearEst == 2022) => println(s"This is the new org ${c.name} of " + c.yearEst)
     }
   }

  /*  val listData:List[String] = List("mohit","jayadeep","hello")
  def secondLastElement(listData:List[String]) ={
   val lst =listData.flatMap(x=>x)
    println(lst)
  }
 (secondLastElement(listData))
 */
  /*val newData:List[Int] = List(1,3,9,5)
  def yeildOperation(x:List[Int])= {
    val lst = for (mohit <- x) yield mohit * 2
    println(lst)
  }
    yeildOperation(newData)

   */
}