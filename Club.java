import java.util.ArrayList;

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
    
    public int joinedInMonth(int month)
    {
        int count = 0;
        if (month < 1 || month > 12){
            System.out.println("Error: Month must be between 1 to 12.");
            return 0;
        }
        for (Membership members : members){
            if (members.getMonth() == month){
                count++;
            }
        }
        return count;
    }
    }
