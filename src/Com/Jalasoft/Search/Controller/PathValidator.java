import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PathValidator  {
    String regexPath;
    String regexFileName;


    public PathValidator(){
        regexPath="^([a-zA-Z]\\:|\\\\\\\\[^\\/\\\\:*?\"<>|]+\\\\[^\\/\\\\:*?\"<>|]+)(\\\\[^\\/\\\\:*?\"<>|]+)+(\\.[^\\/\\\\:*?\"<>|]+)$";
        regexFileName="^[^ \\\\/:*?\"\"<>|]+([ ]+[^ \\\\/:*?\"\"<>|]+)*$";
    }

    public boolean isValidPath(String filePath){
        Pattern pattern = Pattern.compile(regexPath);
        Matcher match = pattern.matcher(filePath);

        if(!match.find()){
            System.out.println("Invalid path");
            return false;
        }
        System.out.println("Valid path");
        return true;

    }

    public boolean isValidFileName(String fileName){
        Pattern pattern = Pattern.compile(regexFileName);
        Matcher match = pattern.matcher(fileName);

        if(!match.find()){
            System.out.println("Invalid name");
            return false;
        }
        System.out.println("Valid name");
        return true;
    }
}
