object first {
 def reverseString(str:String):String={
   if(str.isEmpty) ""
  else reverseString(str.tail) + str.head
 }
 def main (args:Array[String])={
  val str:String = scala.io.StdIn.readLine("Enter any string:")
  println(reverseString(str))
 }
}
