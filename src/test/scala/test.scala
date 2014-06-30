/**
 * Created by joel on 30/06/2014.
 */

import org.scalatest.FunSuite

class test extends FunSuite {
  test("test 2 expected values are equal") {
    assert(2 === 2)
  }

  test("test 2 values are different and fail") {
    assert(2 === 3)
  }
}
