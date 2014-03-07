/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'walterg2' at '3/6/14 9:32 PM' with Gradle 1.10
 *
 * @author walterg2, @date 3/6/14 9:32 PM
 */

import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralSpec extends Specification {

  @Unroll
	def 'RomanNumerals can translate #arabic to Roman'() {
		given:
		def romanNumeral = new RomanNumeral()

		when:
		def result = romanNumeral.translate(arabic)

		then:
		result == roman

    where:
    arabic || roman
    1      || 'I'
    2      || 'II'
    4      || 'IV'
    5      || 'V'
    9      || 'IX'
    10     || 'X'
    13     || 'XIII'
    17     || 'XVII'
    25     || 'XXV'
    32     || 'XXXII'
    47     || 'XLVII'
    55     || 'LV'
    67     || 'LXVII'
    82     || 'LXXXII'
    95     || 'XCV'
    102    || 'CII'
    323    || 'CCCXXIII'
    450    || 'CDL'

	}

}
