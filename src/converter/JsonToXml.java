package converter;

public class JsonToXml {

    public static String convert(char[] toConvert) {
        String tag = "";
        String content = "";
        boolean tagH = false;
        int i = 1;
        while (i < toConvert.length - 1) {
            if (toConvert[i] == ' ' || toConvert[i] == '\"' || toConvert[i] == ':' || toConvert[i] == '}') {
                i++;
            } else if (!tagH) {
                if (toConvert[i + 1] != '\"') {
                    tag += toConvert[i];
                    i++;
                } else {
                    tag += toConvert[i];
                    i++;
                    tagH = true;
                }
            } else {
                content += toConvert[i];
                i++;
            }
        }
        return "<" + tag.trim() + ("null".equals(content) ? "/>" : ">" + content.trim() + "</" + tag.trim() + ">");
    }

}
