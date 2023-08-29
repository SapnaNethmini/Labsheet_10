package Labsheet10

object q1 {

    def calculateAverage(temperatures: List[Int]): Double = {
      val tempInFahrenheit = temperatures.map(temp => (temp * 9 / 5) + 32)
      val totalTemperature = tempInFahrenheit.reduce((t1,t2) => t1+t2)

      //return average temperature 
      totalTemperature / temperatures.length.toDouble
    }

    def main(args: Array[String]): Unit = {
      val temperatures = List(0, 10, 20, 30)

      println("Average Fahrenheit temperature is: " + calculateAverage(temperatures))
    }

}
