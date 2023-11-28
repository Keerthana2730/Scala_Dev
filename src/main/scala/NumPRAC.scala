object NumPRAC {
  def main(args:Array[String]):Unit= {
    var a = 11;
    var b = 90;
    var c = 30;
    if (a>b && a>c){
      println(s"$a is greatest")
    }
    else if (b>a && b>c){
      println(f"$b%.1f is greatest")
    }
    else{
      println(s"$c is greatest")
    }
  }

}
