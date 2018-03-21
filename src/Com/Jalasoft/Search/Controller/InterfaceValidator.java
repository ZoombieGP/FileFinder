import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * InterfaceValidator : Validate all data received by UI
 * @author Brayan Rosas
 * @version 0.1
 * @since 03/16/2018
 */
public class InterfaceValidator {
    String regexPath;
    String regexFileName;

    /**
     * InterfaceValidator Constructor
     * Inicialize the regular expressions
     */
    public InterfaceValidator(){
        regexPath="^([a-zA-Z]\\:|\\\\\\\\[^\\/\\\\:*?\"<>|]+\\\\[^\\/\\\\:*?\"<>|]+)(\\\\[^\\/\\\\:*?\"<>|]+)+(\\.[^\\/\\\\:*?\"<>|]+)$"; // Contents the regular expression to validate file path
        regexFileName="^[^ \\\\/:*?\"\"<>|]+([ ]+[^ \\\\/:*?\"\"<>|]+)*$"; // Contents the regular expression to validate a file name
    }

    /**
     * Validate if the text is a valid file path
     * @param filePath String The file path got of the UI
     * @return boolean true if the file path is valid and false if not
     */
    public boolean isValidPath(String filePath){
        return patternValidator(filePath, Pattern.compile(regexPath), "Invalid path", "Valid path");

    }

    /**
     * Validate if the text is a valid file name
     * @param fileName String The file name got of the UI
     * @return boolean true if the file name is valid and false if not
     */
    public boolean isValidFileName(String fileName){
        return patternValidator(fileName, Pattern.compile(regexFileName), "Invalid name", "Valid name");
    }

    /**
     *
     * @param textToEvaluate This contents the text to evaluate
     * @param compile This contents the compile object created with the regex
     * @param messageFalse This contents the message to shown when the validation returns false
     * @param messageTrue  This contents the message to shown when the validation returns true
     * @return boolean Return the result of evaluate the text with regex
     */
    private boolean patternValidator(String textToEvaluate, Pattern compile, String messageFalse, String messageTrue) {
        Pattern pattern = compile;
        Matcher match = pattern.matcher(textToEvaluate);

        if (!match.find()) {
            System.out.println(messageFalse);
            return false;
        }
        System.out.println(messageTrue);
        return true;
    }

}

