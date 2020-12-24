package converter;

public class XmlToJson {

    public static String convert(char[] toConvert) {
        String tag = "";
        String content = "";
        boolean tagH = false;
        int i = 1;
        while (i < toConvert.length - 1) {
            if (!tagH && toConvert[i] == '/' && toConvert[i + 1] == '>') {
                break;
            } else if (!tagH && toConvert[i] == '>') {
                tagH = true;
                i++;
            } else if (!tagH) {
                tag += toConvert[i];
                i++;
            } else if (tagH && toConvert[i] != '<') {
                content += toConvert[i];
                i++;
            } else {
                break;
            }
        }
        return "{\"" + tag + "\":" + ("".equals(content) ? " " + null + " }" : "\"" + content + "\"}");
    }

}
