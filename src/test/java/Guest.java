public class Guest {

    String name;
    String lastName;
    int stayPeriod;
    int RoomPrice=80;
    boolean isBreakfastInclude=false;
    int BreakfastPrice=30;
    int Total;

    public Guest(String paramOne, String paramTwo, int paramThree, boolean paramFour) {
        name=paramOne;
        lastName=paramTwo;
        stayPeriod=paramThree;
        isBreakfastInclude=paramFour;
    }

    public void PrintName(){
        System.out.println("Guest: "+name + " "+lastName);}

    public void PricePerNumber(){
        System.out.println("PricePerNumber: " + RoomPrice + " $");}

    public void Breakfast() {
        if (isBreakfastInclude) {
            System.out.println("Breakfast included");

        } else {
            System.out.println("Breakfast not included - available for extra pay");
        }
    }
    public void TotalFee(){
        if(isBreakfastInclude) {
            Total= (RoomPrice+BreakfastPrice)*stayPeriod;}
        else {Total=RoomPrice*stayPeriod;}
        System.out.println("Total fee: "+ Total+" $");
    }


}