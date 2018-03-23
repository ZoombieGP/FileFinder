import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestInterfaceValidator {

    @Test
    public void isAValidPath(){
        String path = "\\\\server\\shared\\Test.txt";

        InterfaceValidator pathTest = new InterfaceValidator();

        assertTrue(pathTest.isValidPath(path));

    }

    @Test
    public void isNotAValidPath(){
        String path = "C:\\SomeFilePatt|\\\\SomeServer\\SomeShare";

        InterfaceValidator pathTest = new InterfaceValidator();

        assertFalse(pathTest.isValidPath(path));

    }

    @Test
    public void fileNameIsValid(){
        String fileName = "file.txt";

        InterfaceValidator pathTest = new InterfaceValidator();

        assertTrue(pathTest.isValidFileName(fileName));

    }

    @Test
    public void fileNameIsNotValid(){
        String fileName = ">SomeShare";

        InterfaceValidator pathTest = new InterfaceValidator();

        assertFalse(pathTest.isValidFileName(fileName));

    }
}
