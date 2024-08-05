object Filter {
  def filterEvenNumbers(numbers: Array[Int]): Array[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val input = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterEvenNumbers(input)
    println(output.mkString(" "))
    
  }
}

