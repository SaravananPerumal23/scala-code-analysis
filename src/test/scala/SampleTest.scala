import org.scalatest._

class SampleTest extends FlatSpec with Matchers {
  "Example" should "sum two numbers" in {
    Sample.sum(1, 5) shouldBe 6
  }
}