package converter;

public class Converter {
     String strToConvert;
     Convert convertMethod;
     private char[] charArrayOfConvertingString;

     Converter (String strToConvert) {
         this.strToConvert = strToConvert;
         convertToCharArray(this.strToConvert);
         methodForConvert();
     }

     private void convertToCharArray(String strToConvert) {
         charArrayOfConvertingString = strToConvert.trim().toCharArray();
     }

     void methodForConvert() {
         if (charArrayOfConvertingString[0] == '<') {
             convertMethod = new XmlToJson();
         } else if (charArrayOfConvertingString[0] == '{') {
             convertMethod = new JsonToXml();
         }
     }

     String convert() {
         return convertMethod.convert(charArrayOfConvertingString);
     }
}
