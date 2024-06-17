@main def q5() = 
  println("Total running time is: ") 
  println(easy(2)+tempo(3)+easy(2))

  def easy(x:Int):Int = x*8
  def tempo(x:Int):Int = x*7