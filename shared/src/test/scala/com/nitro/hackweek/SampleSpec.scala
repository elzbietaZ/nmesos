package controllers
import com.nitro.nitroz.testutils.specs2.DefaultSpec
import links.randomMethods

class SampleSpec extends DefaultSpec {

  "My test" should {

    "do sth" in new Scope {
      randomMethods.someMethod3("a", "b", "c") must_== "abc"
    }
  }

}
