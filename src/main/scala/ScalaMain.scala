import io.github.binaryfoo.RootDecoder

import scala.collection.JavaConversions

object ScalaMain {
  def main(args: Array[String]) {
    val decoder = new RootDecoder
    JavaConversions.collectionAsScalaIterable(decoder.decode("ffffffffff", "EMV", "95")).foreach(println)
  }
}
