object strlist {
  def strlen(str: String): Int = str.length
  def filterlen(word:Array[String]):Array[String]={
    var i: Int =0
    var j: Int =0
    var five:Array[String]=new Array[String](10)
    for(i <- 0 to 6){
      if(strlen(word(i))>5){
        five(j)=word(i)
        j = j+1
      }
    }
    return five
  }
  def printArray(str:Array[String]):Unit ={
    var i:Int=0
    for(i<-0 to (str.length-1) ){
      println(str(i))
    }
  }
  def main(args:Array[String])={
    var word = Array("Sankha","Inod","Sachini","Kaumadi","Ayash","Nethmi","Piyumal")
    var x = filterlen(word)
    printArray(x)
  }
}
