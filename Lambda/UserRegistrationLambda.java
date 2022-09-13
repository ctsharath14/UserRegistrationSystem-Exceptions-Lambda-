package Lambda;

import Exceptions.UserRegistrationExceptions;

import java.util.regex.Pattern;

@FunctionalInterface
interface LambdaOperation {
    String validate(String regex, String input);
}

public class UserRegistrationLambda {
    public static void main(String[] args) {
        //FirstName validation
        LambdaOperation firstName = (regex, input) -> {
            return "First Name Validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(firstName.validate("[A-Z]{1}[a-zA-Z]{2,}", "Sharath"));

        //LastName validation
        LambdaOperation lastName = (regex, input) -> {
            return "Last name validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(lastName.validate("[A-Z]{1}[a-zA-Z]{2,}", "Somaiah"));

        //Email validation
        LambdaOperation email = (regex, input) -> {
            return "Email validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(email.validate("^[a-zA-Z0-9]{2,20}([.][a-z0-9]+)?@[a-z]+.[a-z]{2,3}(.[a-z]{2})?$", "abc.xyz@bl.co.in"));

        //mobile number validation
        LambdaOperation mobileNumber = (regex, input) -> {
            return "Phone number validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(mobileNumber.validate("[0-9]{2}[\\s][6789]{1}[0-9]{9}", "91 9765894568"));

        //Password validation
        LambdaOperation password = (regex, input) -> {
            return "Password  validation is : " + Pattern.matches(regex, input);
        };
        System.out.println(password.validate("(?=.*[A-Z]){1,}(?=.*[a-z]){1,}(?=.*[0-9]){1,}(?=.*[@#$%^&-+=()]){1}[a-zA-Z0-9@#$%^&-+=()]{8,}", "Sharath@123"));
    }

    //returns true if first name is valid
    public boolean validateFirstName(String firstName) throws UserRegistrationExceptions {
        if (Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationExceptions("First Name is invalid");
    }

    //returns true if last name is valid
    public boolean validateLastName(String lastName) throws UserRegistrationExceptions {
        if (Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationExceptions("Last Name is invalid");
    }

    //returns true if EMail is valid
    public boolean validateEMail(String email) throws UserRegistrationExceptions {
        if (Pattern.matches("^[a-zA-Z0-9]{2,20}([.][a-z0-9]+)?@[a-z]+.[a-z]{2,3}(.[a-z]{2})?$", email))
            return true;
        else
            throw new UserRegistrationExceptions("Email is invalid");
    }

    //returns true if mobile Number is valid
    public boolean validateMobileNumber(String phoneNumber) throws UserRegistrationExceptions {
        if (Pattern.matches("[0-9]{2}[\\s][6789]{1}[0-9]{9}", phoneNumber))
            return true;
        else
            throw new UserRegistrationExceptions("Mobile Number is invalid");
    }

    //returns true if password is valid
    public boolean validatePassword(String password) throws UserRegistrationExceptions {
        if (Pattern.matches("(?=.*[A-Z]){1,}(?=.*[a-z]){1,}(?=.*[0-9]){1,}(?=.*[@#$%^&-+=()]){1}[a-zA-Z0-9@#$%^&-+=()]{8,}", password))
            return true;
        else
            throw new UserRegistrationExceptions("Password is invalid");
    }
}