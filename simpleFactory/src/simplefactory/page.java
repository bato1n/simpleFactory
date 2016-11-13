
package simplefactory;

import java.io.*;

public abstract class page {
    
    public String wynik;
 
public void save(){
    
    FileWriter fWriter = null;
    BufferedWriter writer = null;

    try 
    {
    fWriter = new FileWriter("indexx.html");
    writer = new BufferedWriter(fWriter);
    writer.write(wynik);
    writer.close();
    } catch (Exception e) { }
}    
}