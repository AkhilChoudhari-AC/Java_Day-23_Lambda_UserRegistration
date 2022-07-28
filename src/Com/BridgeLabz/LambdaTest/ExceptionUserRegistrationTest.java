package Com.BridgeLabz.LambdaTest;

import Com.BridgeLabz.LambdaUserRegistration.ExceptionUserRegistration;
import Com.BridgeLabz.LambdaUserRegistration.InputInvalidException;
import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    /**
     * create method firstName() that throws Exception
     *
     * @throws InputInvalidException
     */
    public void firstName() throws InputInvalidException {
        String firstName = "Akhil";
        Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
    }

    @Test
    /**
     * create method lastName() that throws Exception
     *
     * @throws InputInvalidException
     */
    public void lastName() throws InputInvalidException {
        String lastName = "Choudhari";
        Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
    }

    @Test
    /**
     * create method emailId() that throws Exception
     *
     * @throws InputInvalidException
     */
    public void emailId() throws InputInvalidException {
        String emailId = "Akhil.xxx123@gmail.com";
        Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
    }

    @Test
    /**
     * create method mobileNumber() that throws Exception
     *
     * @throws InputInvalidException
     */
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91 99933437464";
        Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
    }

    @Test
    /**
     * create method password() that throws Exception
     *
     * @throws InputInvalidException
     */
    public void password() throws InputInvalidException {
        String password = "Akhil@123";
        Assert.assertTrue(exceptionUserRegistration.testPassword(password));
    }

}