@main def hello() = 
  println("Area of disk is: " + areaOfDisk(5))

  def areaOfDisk(r: Double): Double = r * r * math.Pi