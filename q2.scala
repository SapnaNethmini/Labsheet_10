package Labsheet10

object q2 {

    def countLetterOccurrences(words: List[String]): Int = {
      val letterCount = words.map(word => word.length)
      val totalLetterCount = letterCount.reduce((w1, w2) => w1 + w2)

      //Return total letter count
      totalLetterCount
    }

    def main(args: Array[String]): Unit = {
      val words = List("apple", "banana", "cherry", "date")

      println("Total count of letter occurrences: " + countLetterOccurrences(words))
    }



}
