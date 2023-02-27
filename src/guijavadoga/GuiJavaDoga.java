
package guijavadoga;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GuiJavaDoga {

    public static void main(String[] args) throws IOException {
        String fajl = "emberek.txt";
        Path path = Paths.get(fajl);
        List<String> sorok = Files.readAllLines(path);
        String fejlec = sorok.get(0);
        sorok.remove(0);
        
        
        List<Adatok> adatok = new ArrayList<>();
        for (String adat : sorok) {
            adatok.add(new Adatok(adat, ";"));
        }
        
        
    }
    
}
