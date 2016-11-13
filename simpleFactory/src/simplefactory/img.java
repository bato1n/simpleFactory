
package simplefactory;

import java.util.*;


public class img extends page{

    
     public img ()
    {
        String a = "<img src=\"http://puu.sh/sfXgm/f3cb345a6f.jpg\" alt=\"Simple factory\">";
 
        String b = "<img src=\"http://puu.sh/sfXiF/cae8487a25.jpg\" alt=\"Simple factory\">";
        
        String c = "<img src=\"http://puu.sh/sfXke/517e9b037e.jpg\" alt=\"Simple factory\">";
        
        int d = 0;
        
        Random r = new Random();
        d = r.nextInt(3);
        if (d == 0)
            {
                wynik = a;
            }
        if (d == 1)
            {
                wynik = b;
            }
        if (d == 2)
            {
                wynik = c;
            }
    } 
}
