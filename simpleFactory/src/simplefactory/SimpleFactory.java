
package simplefactory;

import java.util.*;


public class SimpleFactory {


    public static void main(String[] args) { 
        
        String type = "";
        System.out.println("Type img, contact, info, news to generate page (check indexx.html in project's folder) or exit to leave.");
        while (!type.equalsIgnoreCase("exit")) {
        Scanner scan = new Scanner(System.in);
        type = scan.nextLine().toLowerCase();
        if (type.equals("img")) {
            pageFactory p = new pageFactory();
            page str = p.createPage("img");
            str.save();
        }
        else if (type.equals("contact")) {
        pageFactory p = new pageFactory();
            page str = p.createPage("contact");
            str.save();
        }
        else if (type.equals("info")) {
        pageFactory p = new pageFactory();
            page str = p.createPage("info");
            str.save();
        }
        else if (type.equals("news")) {
        pageFactory p = new pageFactory();
            page str = p.createPage("news");
            str.save();
        }
        else 
        {
            System.out.println("Please enter img, contact, info, news to generate page or exit to leave.");
        }
        }
    }
    
}
