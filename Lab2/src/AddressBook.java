import java.util.ArrayList;
import java.util.List;

public class AddressBook {


    private List<BuddyInfo> buddies;

   public AddressBook(){
       buddies = new ArrayList<>();
   }


   public void addBuddy(BuddyInfo bud){
       buddies.add(bud);

   }

   public void removeBuddy(BuddyInfo bud){
        buddies.remove(bud);
   }



   public static void main(String[] args){

       System.out.println("Address Book");

       AddressBook a1 = new AddressBook();
       BuddyInfo b1 = new BuddyInfo("Homer","123 main st", "613-555-2828");
       a1.addBuddy(b1);
       a1.removeBuddy(b1);

//       AddressBook a1 = new AddressBook();
//       BuddyInfo b1 = new BuddyInfo("Homer","123 main st", "613-555-2828");
//       BuddyInfo b2 = new BuddyInfo("Jerry","55 main st", "613-999-1234");
//       BuddyInfo b3 = new BuddyInfo("Kramer","5B main st", "613-456-7676");
//
//       a1.addBuddy(b1);
//       a1.addBuddy(b2);
//       a1.addBuddy(b3);





   }

}
