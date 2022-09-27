package org.pouliot;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * Ok : jo@pipo.org
         * Ok : ma_mu@m.ca
         * Ok : a.a@a.aa
         * Ko : ab@ab
         * Ko : a.b@ab
         * Ko : jo
         */

        String[] emails = {"jo@pipo.org", "ma_mu@m.ca", "a.a@a.aa", "ab@ab", "jo"};

        EmailValidator eValidator = EmailValidator.getInstance();
        for (String email: emails) {
            System.out.println( eValidator.isValid(email) ? "OK: " + email : "K-O: " + email  );
        }
    }
}
