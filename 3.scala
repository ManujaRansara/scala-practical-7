object Prime {
  def isPrime(number: Int): Boolean = {
    if (number <= 1) return false
    if (number == 2) return true

    var divisor = number - 1
    while (divisor > 1) {
      if (number % divisor == 0) return false
      divisor -= 1
    }
    true
  }

  def filterPrime(numbers: Array[Int]): Array[Int] = {
    numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    val input = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes = filterPrime(input)
    println(s"Input: ${input.mkString(" ")}")
    println(s"Output: ${primes.mkString(" ")}")
  }
}
