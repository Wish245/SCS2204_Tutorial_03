object rounded {
  def sum(num1:Int,num2:Int):Int= num1+num2
  def average(num1:Int,num2:Int):Float= sum(num1,num2)/2
  def roundingTotwo(num1:Int,num2:Int):Float= BigDecimal(average(num1,num2)).setScale(3, BigDecimal.RoundingMode.HALF_UP).toFloat
  def main(args:Array[String])={
    val num1:Int =10
    val num2:Int =5
    println(roundingTotwo(num1,num2))
  }
}
