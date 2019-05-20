import java.util.*;

public class Execution {
	public static void main(String[] args)
	{
		
		CountryList c1 = new CountryList();
		//this sets the data for the states before the game begins
		CSVRead.update();
		CSVRead.set();
		
		//creates an array of users given the number of users
		//then loops through to assign names to the users
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many players are playing?");
		int numUsers = keyboard.nextInt();
		User[] users = new User[numUsers];
		keyboard.nextLine();
		for (int i = 0; i < users.length; i++)
		{
			System.out.println("Hello, User " + (i+1) + ". What shall I call you?");
			users[i] = new User();
			users[i].setName(keyboard.nextLine());
		}
		
		//phase one of the game is claiming territories
		//this loops until all territories are claimed
		int territoriesClaimed = 0;
		int totalTerritories = CountryList.allCountries.size();
		while (territoriesClaimed < totalTerritories)
		{
			for (int i = 0; i < users.length; i++)
			{
				if (territoriesClaimed < totalTerritories)
				{
					System.out.println("It is " + users[i].getName() + "'s turn.");
					int prior = users[i].countries.size();
					users[i].UserTurnPhaseOne();
					int latter = users[i].countries.size();
					territoriesClaimed += (latter-prior);
				}
				else
					break;
			}
		}
		
		System.out.println("Welcome to phase 2! I'm honestly surprised you've played this game for this long,"
				+ "but hey, I'm not judging. This phase of the game is all about battling your opponents"
				+ "and trying to conquer the world. May the best strategist win! Also, here is an update on the"
				+ "current world power possessed by each player: ");
		for (int i = 0; i < users.length; i++)
		{
			System.out.println(users[i].getName());
			System.out.println(users[i].getPower());
		}
		
		
		int countUsersOut = 0;
		//players have turns until one person has control of the entire world
		while(countUsersOut < users.length-1)	
		{
			for (int i = 0; i < users.length; i++)
			{
				//before the user can take their turn, we must check if they have any world power
				//if they don't then they are out and we set their position in the array to null
				if (users[i] != null && users[i].getPower() == 0)
				{
					System.out.println("Sorry, you no longer have any world power. You lose.");
					users[i] = null;
				}
			
				//we determine if there is a winner by counting how many users are set to null
				//if all but one user is set to null, then we return the only user who is not null because they won
				//reset count each loop
				countUsersOut = 0;
				int indexOfOnlyUserLeft = 0;
				for (int j = 0; j < users.length; j++)
				{
					if (users[j] == null)
					countUsersOut++;
					else
					indexOfOnlyUserLeft = j;
				}
			
				if (countUsersOut == users.length-1)
				{
					System.out.println("Congratulations, " + users[indexOfOnlyUserLeft].getName() + "! You win!");
					break;
				}
			
				//after checking to see if the user lost or if any user won,
				//the user can now take their turn
				System.out.println("It is " + users[i].getName() + "'s turn. Would you like to wage war with anyone? If not, please type end, "
					+ "otherwise please type the name of the user you would like to go to war with: ");
				String ans = keyboard.nextLine();
				String defender = null;
				
				//if the user doesn't end their turn then do this
				while (!ans.equals("end"))
				{
					for (int h = 0; h < users.length; h++)
					{
						if (users[h].getName().equals(ans))
							defender = keyboard.nextLine();
					}
				
					if (defender == null)
					{
						System.out.println("That's not a user. Try again: ");
						ans = keyboard.nextLine();
					}
					else
						break;
				}
				
				//determines winner and loser, distributes power accordingly
				if (defender != null)
				{
					User winner = letsWar(users[i].getName(), defender, users);
					if (winner.getName().equals(defender))
					{
						System.out.println(defender + "wins the war and steals power from " + users[i].getName());
						warResults(defender, users[i].getName(), users);
					}
					else
					{
						System.out.println(users[i].getName() + "wins the war and steals power from " + defender);
						warResults(users[i].getName(), defender, users);
					}	
					
				}
				// i really hope this thing works
			}		
		}
		
		
		
	}

	
	//these two methods were originally in their own class, but we could not call them
	//hence why they are in this class now
	//they deal with two users warring against one another with uone being the instigator
	public static User letsWar(String uone, String utwo, User[] ARusers) 
	{	
		User one = User.getUser(uone, ARusers);		
		User two = User.getUser(utwo, ARusers);
		double pone = one.getPower() * 0.9 * Math.log((Math.random()+1) * 10); 
		
		//its easier to defend than attack
		double ptwo = two.getPower() * Math.log((Math.random()+1) * 10);
		
		if (pone > ptwo) 
			return one;
		
		//defender gets the tie	
		return two; 	
	}
	
	//gives the winner a random ammount of the user's power
	public static void warResults(String w, String l, User[] u) 
	{
		User winner = User.getUser(w, u);
		User loser = User.getUser(l, u);	
		double finalP = loser.getPower() * Math.random();
		while (loser.getPower() > finalP) 
		{ 
			int rand = (int)(Math.random() * loser.countries.size());
			loser.removeCountry(loser.countries.get(rand).getName());
			winner.addCountry(loser.countries.get(rand).getName());
		}
			
	}

	
}
