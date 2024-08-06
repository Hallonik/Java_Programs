/**@author Subham Maity
 * @version 1.0
 * @since 2003
 **/


package JavaDocDemo;
/**
 * 
 *@author Subham Maity
 *Class for Library book
 */

public class Book {
    /**
     * @value default value
     */

    static int val = 10;

    /**
     * Paramererised constructor
     * @param s Book name
     */

    public Book(String s){}

    /**
     * Issue a book to a student
     * @param roll roll number of a student
     * @throws Exception if book not available, thorws exception
     * 
     * @param roll
     * @throws Exception
     */

    public void issue (int roll) throws Exception{

    }

    /**
     * Check if book is available
     * @param str Book name
     * @return if book is available returns true else false
     */

    public boolean available(String str){  return true;}

    /**
     * Get book name
     * @param id book id
     * @return returns book name
     */

    public String getName(int id){ return "";}
    
}
