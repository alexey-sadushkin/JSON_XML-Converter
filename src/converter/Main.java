package converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strToConvert = scan.nextLine();
        char[] charArrayToConvert = strToConvert.trim().toCharArray();
        if (charArrayToConvert[0] == '<') {
            System.out.println(XmlToJsonConvert.convert(charArrayToConvert));
        } else if (charArrayToConvert[0] == '{') {
            System.out.println(JsonToXmlConvert.convert(charArrayToConvert));
        } else System.out.println("Error");
    }

}