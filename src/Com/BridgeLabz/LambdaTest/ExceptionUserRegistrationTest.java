package Com.BridgeLabz.LambdaTest;

import Com.BridgeLabz.LambdaUserRegistration.ExceptionUserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    /**
     * testCases for validating firstName,lastName, emailId, phone Number and
     * password
     *
     */
    @Test
    /**
     * created method givenFirstName_IsProper_ReturnTrue() for true condition
     */
    public void givenFirstName_IsProper_ReturnTrue() {
        /**
         * calling firstName method to see firstname is valid and result will be in
         * boolean type
         */
        boolean actualResult = exceptionUserRegistration.firstName("Akhil");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givenFirstName_IsProper_ReturnFalse() for false condition
     */
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("akhil");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    /**
     * created method givenLastName_IsProper_ReturnTrue() for true condition
     */
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.lastName("Choudhari");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givenLastName_IsProper_ReturnFalse() for false condition
     */
    public void givenLastName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.lastName("choudhari");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    /**
     * created method givenEmailId_IsProper_ReturnTrue() for true condition
     */
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.email("akhil.choudhari.xxx@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givenEmailId_IsNotProper_ReturnFalse() for false condition
     */
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.email("akhilxxx.gmail.com");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    /**
     * created method givenMobileNumber_IsProper_ReturnTrue() for true condition
     */
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.phoneNumber("91 9005686059");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givenMobileNumber_IsNotProper_ReturnFalse() for false
     * condition
     */
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.phoneNumber("91 90345465645");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    /**
     * created method givePasswordRule1_IsProper_ReturnTrue() for true condition
     */
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("abcdefghi");
        Assert.assertEquals(true, actualResult);
    }

    @Test

    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("abcd");
        Assert.assertEquals(false, actualResult);
    }

    @Test

    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("qwgthRLjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givePasswordRule2_IsNotProper_ReturnFalse() for false
     * condition
     */
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    /**
     * created method givePasswordRule3_IsProper_ReturnTrue() for true condition
     */
    public void givenPasswordRule3_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule3("Akhil675");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givePasswordRule3_IsNotProper_ReturnFalse() for false
     * condition
     */
    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule3("Afgrrfgrg");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    /**
     * created method givePasswordRule4_IsProper_ReturnTrue() for true condition
     */
    public void givenPasswordRule4_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("Akhil@343");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givePasswordRule4_IsNotProper_ReturnFalse() for false
     * condition
     */
    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("Akhil454");
        Assert.assertEquals(false, actualResult);
    }
}