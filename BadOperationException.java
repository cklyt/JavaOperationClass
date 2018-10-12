/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author lllyu
 */
public class BadOperationException
        extends Exception 
{
    String message;
    public  BadOperationException(String msg) {
        
        super(msg);
        message = msg;
    }    
    public BadOperationException(Exception e)
    {
        super(e);
    }
    public String getName()
    {
        return message;
    }
    @Override
    public String getMessage() {
        return "Bad Operation: "+super.getMessage();
    }    
}
