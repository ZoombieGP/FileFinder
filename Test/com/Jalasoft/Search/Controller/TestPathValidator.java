import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestPathValidator {

    @Test
    public void isAValidPath(){
        String path = "\\\\server\\shared\\Test.txt";

        PathValidator pathTest = new PathValidator();

        assertTrue(pathTest.isValidPath(path));

    }

    @Test
    public void isNotAValidPath(){
        String path = "C:\\SomeFilePatt|\\\\SomeServer\\SomeShare";

        PathValidator pathTest = new PathValidator();

        assertFalse(pathTest.isValidPath(path));

    }

    @Test
    public void fileNameIsValid(){
        String fileName = "file.txt";

        PathValidator pathTest = new PathValidator();

        assertTrue(pathTest.isValidFileName(fileName));

    }

    @Test
    public void fileNameIsNotValid(){
        String fileName = ">SomeShare";

        PathValidator pathTest = new PathValidator();

        assertFalse(pathTest.isValidFileName(fileName));

    }
}
