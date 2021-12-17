object Main{
  def main(args: Array[String]): Unit ={
    println(Typeclasses.testReversableString("9932"))
    println(Typeclasses.testSmashInt(3, 4)) 
    println(Typeclasses.testSmashDouble(3.0, 4.0)) 
    println(Typeclasses.testSmashString("ab", "cd")) 
  }
}