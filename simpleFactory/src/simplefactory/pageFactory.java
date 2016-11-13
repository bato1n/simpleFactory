
package simplefactory;


public class pageFactory {
    
    public page createPage(String criteria)
  {
    if ( criteria.equals("img") )
      return new img();
    else if ( criteria.equals("contact") )
      return new contact();
    else if ( criteria.equals("info") )
      return new info();
    else if ( criteria.equals("news") )
      return new news();

    return null;
  }
    
    
}
