package Com.BridgeLabz.LambdaTest;

import Com.BridgeLabz.LambdaUserRegistration.ExceptionUserRegistration;
import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating lastName
 *
 */
public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    /**
     * created method givenLastName_IsProper_ReturnTrue() for true condition
     */
    public void givenLastName_IsProper_ReturnTrue() {
        /**
         * calling lastName method to see lastname is valid or not
         */
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
}