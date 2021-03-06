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
    500    || 'D'
    900    || 'CM'
    1000   || 'M'
    1985   || 'MCMLXXXV'
    2014   || 'MMXIV'
    3876   || 'MMMDCCCLXXVI'

	}

  @Unroll
  def 'RomanNumerals can translate #roman to Arabic'() {
    given:
    def romanNumeral = new RomanNumeral()

    when:
    def result = romanNumeral.translate(roman)

    then:
    result == arabic

    where:
    roman           || arabic
    'I'             || 1
    'II'            || 2
    'IV'            || 4
    'V'             || 5
    'X'             || 10
    'XIII'          || 13
    'XVII'          || 17
    'XXV'           || 25
    'XXXII'         || 32
    'XLVII'         || 47
    'LV'            || 55
    'LXVII'         || 67
    'LXXXII'        || 82
    'XCV'           || 95
    'CII'           || 102
    'CCCXXIII'      || 323
    'CDL'           || 450
    'D'             || 500
    'CM'            || 900
    'M'             || 1000
    'MCMLXXXV'      || 1985
    'MMXIV'         || 2014
    'MMMDCCCLXXVI'  || 3876

  }

}
