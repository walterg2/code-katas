/*
 * This Groovy source file was auto generated by running 'gradle buildInit --type groovy-library'
 * by 'walterg2' at '3/6/14 9:32 PM' with Gradle 1.10
 *
 * @author walterg2, @date 3/6/14 9:32 PM
 */
class RomanNumeral {

	def ARABIC_TO_ROMAN = [
    1000 : 'M',
     900 : 'CM',
     500 : 'D',
     400 : 'CD',
     100 : 'C',
      90 : 'XC',
      50 : 'L',
      40 : 'XL',
      10 : 'X',
       9 : 'IX',
       5 : 'V',
       4 : 'IV',
       1 : 'I'
	]

  def ROMAN_TO_ARABIC = ARABIC_TO_ROMAN.collectEntries { key, value -> [value, key] }

    def translate(int number) {
      def result = ''
    	ARABIC_TO_ROMAN.each {
        while (number > it.key - 1) {
          result += it.value
          number -= it.key
        }
      }

      result
    }

    def translate(String roman) {
      def result = 0
      roman.getChars().each { 
        result += ROMAN_TO_ARABIC["${it}"]
      }

      result
    }
}
