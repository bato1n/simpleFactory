
package simplefactory;

import java.util.*;


public class contact extends page {
    

    public contact ()
    {
        String a = "Contact: 234645234 <br/>" + "Address: Warszawa ul.3-ciego maja <br/>";
 
        String b = "Contact: 123432664 <br/>" + "Address: Krakow ul.4-ego maja <br/>";
        
        String c = "Contact: 987345865 <br/>" + "Address: Katowice ul.5-ego maja <br/>";
        
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
