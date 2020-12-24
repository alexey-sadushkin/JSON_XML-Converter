package converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strToConvert = scan.nextLine();
        Converter converter = new Converter(strToConvert);
        System.out.println(converter.convert());
    }
}