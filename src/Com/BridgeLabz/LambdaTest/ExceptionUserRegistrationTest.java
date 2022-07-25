package Com.BridgeLabz.LambdaTest;

import Com.BridgeLabz.LambdaUserRegistration.ExceptionUserRegistration;
import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating firstName
 *
 */
public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    /**
     * created method givenFirstName_IsProper_ReturnTrue() for true condition
     */
    public void givenFirstName_IsProper_ReturnTrue() {
        /**
         * calling firstName method to see firstname is valid or not
         */
        boolean actualResult = exceptionUserRegistration.firstName("Akhil");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    /**
     * created method givenFirstName_IsProper_ReturnFalse() for false condition
     */
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("Akhil");
        Assert.assertEquals(false, actualResult);
    }
}