class Rational (n: Int, d: Int){
  require(d!=0)
  private val g = gcd (n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this (n: Int) = this(n, 1)

  //adding two Rational numbers
  def + (that: Rational): Rational = new Rational(
                      numer*that.denom+that.numer*denom, denom*that.denom)

  //adding an int to a rational
  def + (i: Int): Rational =  new Rational(
                numer + i*denom, denom
  )

  //Rational Substraction
  def - (that: Rational): Rational =
    new Rational(numer*that.denom-that.numer*denom,denom*that.denom)

  // substract an int
  def - (i: Int): Rational = new Rational(
    numer-i*denom, denom
  )

  // rationals Multiplication
  def * (that: Rational): Rational =
    new Rational(numer*that.numer,denom*that.denom)

  //multiplication with an int
  def * (i: Int): Rational = new Rational(
                  numer*i, denom)

  //division
  def / (that: Rational): Rational =
    new Rational(numer*that.denom, denom*that.numer)

  //division by an int
  def /
  override def toString = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b,a%b)
}


/*
* 1. Answer the following questions:
• Where is the primary constructor of the class? In  class declaration with parameters, function style
• Why there is no “default” constructor? Because we are defining a class with two parameters
• What are g, numer and denom for? For Those values are necessary for operations between 2 rational numbers
• Why toString method defined with override?
• Why do we need second versions of +, -,
* and /? For allowing operations with an integer
• When does require(d!=0) gets executed? when evaluating parameters for instantiation of Rational

val c = new Rational (4,0)
The answers could be given in a form of comments to
your code.
2. Complete the class:
• Write implementations instead of /* comments */. DONE
3. Provide examples of use Rational class DONE
* */

//Test
val a = new Rational (8, 3)
val b = new Rational (4,5)

a+b
a-b
a*b
a/b
b + 7
b - 4
b*7
