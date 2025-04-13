package io.joaoleo.playground

object Playground {

  def binarySearch(list: List[Int], item: Int): Option[Int] = {
    var lowest = 0
    var highest = list.length - 1

    while (lowest <= highest)
      val mid = lowest + (highest - lowest) / 2
      val guess = list(mid)

      if (guess == item) return Some(mid)
      else if (guess > item) highest = mid - 1
      else lowest = mid + 1
    
    None
  }

  def main(args: Array[String]): Unit = {
    println(binarySearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
  }
}
