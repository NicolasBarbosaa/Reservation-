public class Reservation{
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
 
    public Reservation(int count, int capacity, boolean open, boolean confirmed ) {
        guestCount=count;
        restaurantCapacity=capacity;
        isRestaurantOpen=open;
        isConfirmed=confirmed;
        
        if(count <=1 ||count> 8) {
            System.out.println("Invalid reservation!");
        }
    }
    public void confirmedReservation(){
         
        if(restaurantCapacity >= guestCount && isRestaurantOpen){
            System.out.println("Reservation confirmed");
            isConfirmed= true;
        }else{
            System.out.println("Reservation denied");
            isConfirmed= false; 
        }
    }
    public void informUser(){
        if(!isConfirmed){
        System.out.println("Unable to confirm reservation, please contact restaurant");
        }else{
            System.out.println("Please enjoy your meal!");
        }
    }
    public static void main(String[] args){

        Reservation partyOfThree = new Reservation(4,8,true,true);
        Reservation partyOfFour = new Reservation(5,8,true, true);
        
        partyOfThree.confirmedReservation();
        partyOfThree.informUser();
        partyOfFour.confirmedReservation();
        partyOfFour.informUser();
    }
 }