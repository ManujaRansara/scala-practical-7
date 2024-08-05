object Square { 
     def calculateSquare(numbers: Array[Int]): Array[Int] = {
          numbers.map(num => num * num)
     }

     def main(args: Array[String]): Unit = {
         val numbers = Array(1, 2, 3, 4, 5)
         val squareNumbers = calculateSquare(numbers)
         println(s"Input: ${numbers.mkString(" ")}")
         println(s"Output: ${squareNumbers.mkString(" ")}")
     }
}
