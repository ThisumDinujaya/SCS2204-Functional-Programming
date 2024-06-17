@main def q3() = 
  println("Volume of a sphere is: " + volume(5))

  def volume(r: Double): Double = r * r * r * math.Pi * 3 / 4