case class Point(x:Int,y:Int){

  def +(p:Point) = Point(this.x + p.x, this.y + p.y)
  def invert = Point(this.y,this.x)
  def move(dx:Int = 0,dy:Int = 0) = Point(this.x +dx ,this.y+ dy)
  def distance(p:Point) =  math.sqrt(math.pow((this.x - p.x),2) + math.pow((this.y - p.y),2))
}

object Point extends App{
  val p1 = Point(2,3)
  println(p1)
  val p2 = Point(5,4)
  println(p2)
  val p3 = p1.move(1)
  println(p3)
  val p4 =  p1+p2
  println(p4)
  
  val p5 = p1.invert
  println(p5)
  
  println(p1.distance(p2))
}





