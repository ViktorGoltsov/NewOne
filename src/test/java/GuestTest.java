import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestTest {
    @Test
    public void GuestCalc() {
        String ParamOne = "Victor";
        String ParamTwo = "Goltsov";
        int ParamThree = 5;
        boolean ParamFour= true;
        Guest guestFirst = new Guest(ParamOne, ParamTwo, ParamThree, ParamFour);
        guestFirst.PrintName();
        System.out.println("Stay for " + guestFirst.stayPeriod + " nights");
        guestFirst.PricePerNumber();
        guestFirst.Breakfast();
        guestFirst.TotalFee();
        Assert.assertEquals(guestFirst.name, "Victor");

    }
}
