package AI_codegen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/*
 * 
 * testing code whisper with Java.
 */
public class CsvParser {
    
    public List<User> parseCSV(
        String filename
    ){
        List<User> rs = new LinkedList<>();
        if(Files.exists(Paths.get(filename), 
            LinkOption.NOFOLLOW_LINKS
        )){
             System.out.println("do nothing for now" +
                "code whisper not working great for java"
             );
        }
        return rs;
    }
    // check file is exist:
    public boolean isFileExist(String filename){
        return Files.exists(Paths.get(filename),
            LinkOption.NOFOLLOW_LINKS
        );
    }

    // delete the file if exist: 
    // delete the file if exist: 
    public boolean deleteFileIfExist(String filename) throws IOException{
        if(isFileExist(filename)){
            Files.delete(Paths.get(filename));
            return true;
        }
        return false;
    }
    
    // read user file have fields userid,name, age from csv and return the list of user:
    
    // list of text files from given path include the child:
    public List<String> listFiles(String path){
        
        // do NOTHING for now:
        System.out.println("do nothing for now" +
            "code whisper not working great for java"
        );
        return null;
    }

    // is Prime number:
    public boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    

    public static void main(String[] args) {

        CsvParser csvParser = new CsvParser();
        csvParser.parseCSV("user.csv");
    }
    
}
