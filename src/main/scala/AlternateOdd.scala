import scala.io.StdIn

object AlternateOdd {
  def main(args:Array[String]):Unit={
    var range = 1 to 10
    for (a<- range){
      if(a%2==1){
        println(a)
      }
    }
  }

}
