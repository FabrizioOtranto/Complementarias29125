package Data;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


    @DataProvider(name="usersDemo")
    public static Object[][] getUsers(){
        return new Object[][]
                {
                        {"coderhouse1","coderhouser1","coderhouse@coderhouse1.com","coderhouse", "coderhouse"},
                        {"coderhouse2","coderhouser2","coderhouse@coderhouse2.com","coderhouse", "coderhouse"},
                        {"coderhouse3","coderhouser3","coderhouse@coderhouse3.com","coderhouse", "coderhouses"}
                };
    }

    @DataProvider(name="usersDemo2")
    public static Object[][] getUsers2(){
        return new Object[][]
                {
                        {"coder1","coderhouser1","coderhouse@coderhouse1.com","coderhouse", "coderhouse"},
                        {"coder2","coderhouser2","coderhouse@coderhouse2.com","coderhouse", "coderhouse"},
                        {"coder3","coderhouser3","coderhouse@coderhouse3.com","coderhouse", "coderhouses"}
                };
    }
}
