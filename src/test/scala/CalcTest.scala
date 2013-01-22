package com.tonicebrian.test
 
import com.tonicebrian.Calc
import org.scalatest.Suite
 
class CalcTest extends Suite {
 
    def testAddition() {
        assert(4 === Calc.add(2,2))
    }
}
