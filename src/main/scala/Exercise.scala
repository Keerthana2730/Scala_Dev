import scala.io.StdIn

object Exercise {
  def main(args:Array[String]):Unit={
    /* kg to gms
    print("Enter the weight in kg: ")
    var weight_kg = StdIn.readFloat()
    var weight_gm = weight_kg*1000
    println(s"The weight in grams for $weight_kg is = "+ weight_gm)*/

    /*degree to Fahrenheit
    print("Enter the Temp in degrees: ")
    var degrees = StdIn.readFloat()
    var Fahrenheit = degrees * 33.8
    println(f"The temp in Fht for $degrees%.2f degrees is = " + Fahrenheit) */

/* Biggest number among 3 numbers
   var a = 10
    var b = 20
    var c = 30
    if(a>b && a>c){
      println("a is greater")
    }
    else if(b>a&&b>c){
      println("b is greater")
    }
    else{
      println("c is greater")*/

    /*
    var num = 500
    println("The number entered is: " +num)
    if(num>=100 && num<=10000){
      if(num%2==0){
        println(s"The $num is even and div by 3 is = " + num%3)
      }
      if(num%2 !=0){
        println(s"The $num is odd and div by 2 is = " + num%2)
      }
    }
    else {
      println("The num is invalid and out of range")
    }*/

    /*print("Enter Num1: ")
    var num1 = StdIn.readInt()

    print("Enter Num2: ")
    var num2 = StdIn.readInt()

    print("Enter the math operation you want (+ - * /): ")
    var operation = StdIn.readLine()

    var result = operation match {
      case "+" => num1+num2
      case "-" => num1-num2
      case "*" => num1*num2
      case "/" =>
        if(num2 !=0) num1/num2
        else "Cannot divide by 0"
      case _   => "Invalid Operation"
    }
    println(s"Result of $num1 $operation $num2 is $result")*/

    /*Write a program to print "SEEKHO BIGDATA"for 60 times.
    var a =1
    while (a<=60){
      println("SEEKHO BIGDATA")
      a = a+1
    }*/

/*    /* Write a program to print all numbers which are divisible by 11 from 250 550*/

    for (num <- 250 to 550) {
      if (num % 11 == 0) {
        println(num)
      }
      else {
        println(s"The $num is not disible by 11")
      }
    }*/

    /*val start = 50
    val end = 100
    var sum = 0

    for (num <- start to end) {
      sum += num
    }
    println(s"The sum of numbers from $start to $end is: " + sum)*/


    /*Write a program to print all even numbers in range 700 to 900.
    val start = 700
    val end = 900

    // Use a for loop to print all even numbers in the range
    for (number <- start to end if number % 2 == 0) {
      println(number)
    }*/

    /*Write a program to print alternate even numbers from 20 to 140. Like (20,24,28...)*/

    /* Write programs to print the following series. 100,200,300.. ...10000*/

    var a = 1
    while(a <10){
        print(a)
      }


    }
  }
