package Com.BridgeLabz.LambdaTest;

import Com.BridgeLabz.LambdaUserRegistration.ExceptionUserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    /**
     * testCases for validating firstName,lastName and emailId
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
        boolean actualResult = exceptionUserRegistration.email("akhil.xxxxx@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givenEmailId_IsNotProper_ReturnFalse() for false condition
     */
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.email("akhil.xxxyy.gmail.com");
        Assert.assertEquals(false, actualResult);
    }
}