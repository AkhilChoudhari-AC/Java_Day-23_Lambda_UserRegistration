package Com.BridgeLabz.LambdaUserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC1- As a User need to enter a valid First Name - First name starts with Cap
 * and has minimum 3 characters UC2- As a User need to enter a valid Last Name
 * -Last name starts with Cap and has minimum 3 characters UC3- As a User need
 * to enter a valid email UC4- As a User need to follow pre-defined Mobile
 * Format Country code follow by space and 10 digit number UC5- As a User need
 * to follow pre-defined Password rules. Rule1– minimum 8 Characters
 *
 * @author user-Almas
 *
 */
public class ExceptionUserRegistration {

    /**
     * created method firstName and passing parameter in this it will check
     * FirstName is valid or not result will be in true or false because method is
     * boolean type
     *
     * @param str -passing string of first name
     * @return -return to method created
     */
    public boolean firstName(String str) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // validating last name
    /**
     * created method lastName and passing parameter in this it will check FirstName
     * is valid or not result will be in true or false because method is boolean
     * type
     *
     * @param str -passing string of last name
     * @return -return to method created
     */
    public boolean lastName(String str) {
        /**
         * The Matcher and Pattern classes provide the facility of Java regular
         * expression Pattern object represents a compile version of regular expression
         * we can create a pattern object by using compile() version of pattern class
         */
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");

        /**
         * we can use matcher object to match the given pattern in the target string we
         * can create matcher object by using matcher() of pattern class
         */
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // validating email
    /**
     * created method email and passing parameter in this it will check email is
     * valid or not result will be in true or false because method is boolean type
     *
     * @param str -passing email id
     * @return -return to method created
     */
    public boolean email(String str) {
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * created method phoneNumber and passing parameter in this it will check phone
     * Number is valid or not result will be in true or false because method is
     * boolean type
     *
     * @param str -passing phone number
     * @return -return to method created
     */
    public boolean phoneNumber(String str) {
        Pattern pattern = Pattern.compile("91\\s[0-9]{10}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * created method PasswordRule1 and passing parameter in this it will check
     * Password is valid or not result will be in true or false because method is
     * boolean type
     *
     * @param password- passing password
     * @return -return to method created
     */
    public boolean passwordRule1(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{8,}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}