object BigNumberPRAC {
  def main(args:Array[String]):Unit= {

    val a = 25;
    var number1 = 60;
    val number2 = 70F;
    val number3 = 9988786768666L;
    val name= "Bob";
    val age= 30;
    val height=1.87654;

    if (a%2 == 0){
      println("the number is even")
    }
    else{
      println("the num is odd")
    }
    println(s"$name's age is $age and $name's height is $height");

    println(f"$name's age is $age and $name's height is $height%.2f meters");

    println(number1, number2);
    println(number3);

  }

}
