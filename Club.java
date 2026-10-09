import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public int joinedInMonth(int month){
        int count = 0;
        if (month < 1 || month > 12){
            System.out.println("Error: Month must be between 1 to 12.");
            return 0;
        } else{
        for (Membership members : members){
            if (members.getMonth() == month){
                count++;
            }
        }
        return count;
       }
    }
    
    /**
    * Remove from the club's collection all members who
    * joined in the given month, and return them stored
    * in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month and year.
    */
   //correction
   public ArrayList<Membership> purge(int month, int year){
       if (month <= 0 || month > 12){
           System.out.println("invalid month : " + month);
           return null;
       } else if (year <= 1900|| year>2026) {
            System.out.println("Invalid year: " + year);
            return null;
        } else {
            ArrayList<Membership> removals = new ArrayList();
            // instead of iterator method:
            // for (Membership m : members){
            // if (m.getMonth()==month && m.getYear()==year){
            // removals.add(m); }
            // members.removeAll(removals);
            // return removals;
            Iterator<Membership> it = members.iterator();
            while (it.hasNext()){ //hasNext means checking if has next element
                Membership members = it.next(); //it.next means element found and proccessing
                if (members.getMonth()==month && members.getYear()==year){
                    System.out.println("Membership found in " + month + "/" + year);
                    removals.add(members);
                    it.remove(); 
                }
            }
            return removals;
        }
    }
   }