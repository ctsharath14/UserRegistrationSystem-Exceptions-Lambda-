package Exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    //Uc1 - validate first name using regex
    public void validateFirstName(String firstName) throws UserRegistrationExceptions {
        String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        try {
            if (matcher.matches()) {
                System.out.println("Name is valid");
            }
            else {
                throw new UserRegistrationExceptions("Name is invalid");
            }
        }
        catch (UserRegistrationExceptions e) {
            System.out.println(e.toString());
        }
    }

    //Uc2 - validate last name using regex
    public void validateLastName(String lastName) throws UserRegistrationExceptions {
        String regex = ("[A-Z]{1}[a-zA-Z]{2,}$");

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        try {
            if (matcher.matches()) {
                System.out.println("Name is valid");
            }
            else {
                throw new UserRegistrationExceptions("Name is invalid");
            }
        }
        catch (UserRegistrationExceptions e) {
            System.out.println(e.toString());
        }
    }

    //Uc3 - validate email using regex
    public void validateEMail(String eMail) throws UserRegistrationExceptions {
        String regex = ("^[a-zA-Z0-9]{2,20}([.][a-z0-9]+)?@[a-z]+.[a-z]{2,3}(.[a-z]{2})?$");

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(eMail);
        try {
            if (matcher.matches()) {
                System.out.println("E-mail is valid");
            }
            else {
                throw new UserRegistrationExceptions("E-mail is invalid");
            }
        }
        catch (UserRegistrationExceptions e) {
            System.out.println(e.toString());
        }
    }

    //Uc4,5,6,7- validate password using regex - minimum 8 characters,at least one capital letter,number,special character
    public void validatePassword(String passWord) throws UserRegistrationExceptions {
        String regex = ("(?=.*[A-Z]){1,}(?=.*[a-z]){1,}(?=.*[0-9]){1,}(?=.*[@#$%^&-+=()]){1}[a-zA-Z0-9@#$%^&-+=()]{8,}");

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passWord);
        try {
            if (matcher.matches()) {
                System.out.println("Password is valid");
            }
            else {
                throw new UserRegistrationExceptions("Password is invalid");
            }
        }
        catch (UserRegistrationExceptions e) {
            System.out.println(e.toString());
        }
    }

    //Uc8 - validate mobile number using regex
    public void validateMobileNumber(String mobileNumber) throws UserRegistrationExceptions {
        String regex = ("[0-9]{2}[\\s][6789]{1}[0-9]{9}");

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        try {
            if (matcher.matches()) {
                System.out.println("Number is valid");
            }
            else {
                throw new UserRegistrationExceptions("Number is invalid");
            }
        }
        catch (UserRegistrationExceptions e) {
            System.out.println(e.toString());
        }
    }

    //Uc9 - Validate email sets using regex
    public String validEMailSet(String eMail) {
        String regex = ("^[a-zA-Z0-9]+{2,}[- . + _]?[a-zA-Z0-9]{2,}[@](?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(eMail);
        if (matcher.matches()) {
            return "Happy";
        }
        else {
            return "Sad";
        }

    }
}