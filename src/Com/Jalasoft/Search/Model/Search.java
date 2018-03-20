package Com.Jalasoft.Search.Model;
import java.io.File;

public class Search {

    public void Search(){}

    public static void main(String[] args){
        //searchByPath(new File ("C:/test"));
        searchByPathAndName(new File("C:/test"), "tcs exe.txt");
    }
    public static void searchByPath(File dir){
        File listFile[] = dir.listFiles();
        if(listFile != null){
            for (int i = 0; i< listFile.length; i++){
                if(listFile[i].isDirectory()){
                    searchByPath(listFile[i]);
                }else{
                    System.out.println(listFile[i].getPath());
                }
            }
        }
    }

    public static void searchByPathAndName(File dir, String fileName){
        File listFile[] = dir.listFiles();
        if(listFile != null){
            for (int i = 0; i< listFile.length; i++){
                if(listFile[i].isDirectory()){
                    if(isSubstring(fileName, listFile[i].getName()) ){
                        System.out.println(listFile[i].getPath());
                    }
                    searchByPathAndName(listFile[i], fileName);
                }else{
                    if(listFile[i].getName().equals(fileName)){
                        System.out.println(listFile[i].getPath());
                    }
                }
            }
        }
    }

    public static Boolean isSubstring(String dirName, String searchInput){
        int index = dirName.indexOf(searchInput);
        if(index == -1){
            return false;
        }else {
            return true;
        }
    }
}
