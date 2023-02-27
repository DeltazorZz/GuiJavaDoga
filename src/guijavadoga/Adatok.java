
package guijavadoga;

public class Adatok {
    private String nev, neme;
    private int kor, munkev;

    public Adatok(String nev, String neme, int kor, int munkev) {
        this(nev+";"+kor+";"+neme+";"+munkev);
    }
    

    public Adatok(String sor) {
        this(sor, ";");
    }

    public Adatok(String sor, String jel) {
    String[] s = sor.split(jel);
    this.nev = s[0];
    this.kor = Integer.parseInt(s[1]);
    this.neme=s[2] ;
    this.munkev=Integer.parseInt(s[3]) ;
    }


    
    
    
    
}
