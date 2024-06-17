@main def q4() = 
  println("Total wholesale cost is: ") 
  println(bookPrice(60) - discount(bookPrice(60)) + shippingCost(60))

  def bookPrice(x:Int):Double = x*24.95
  def discount(amount:Double):Double = amount*0.4
  def shippingCost(x:Int):Double=3*x+(x-50)*0.75