/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.oregontrail.exceptions;

/**
 *
 * @author lucia
 */
public class ShopControlException extends Exception {
    
    public ShopControlException() {
    }

    public ShopControlException(String message) {
        super(message);
    }

    public ShopControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopControlException(Throwable cause) {
        super(cause);
    }

    public ShopControlException(String message, 
                                        Throwable cause,
                                        boolean enableSuppression, 
                                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

}
