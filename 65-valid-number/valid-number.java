import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public boolean isNumber(String s) {
        Pattern p=Pattern.compile("^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$");
        Matcher m=p.matcher(s);

    

        
        return m.matches();
    }
}