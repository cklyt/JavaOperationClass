/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lllyu
 */
public class Operations {
    Operations()
    {
    }
    public static Operation getOperationFor(String val)
    {
        Operation c = null;
        try
        {
            c = operations.get(val).newInstance();
        }
        catch(Exception e)
        {
            
        }
        return c;
    }
    public static Class<? extends Operation> getOperationClassFor(String val)
    {
        Class<? extends Operation> c = null;
        try
        {
            c = operations.get(val);
        }
        catch(Exception e)
        {
            
        }
        return c;
    }
    private static final Map<String,Class<? extends Operation>> operations = new HashMap<String,Class<? extends Operation>>()
    {
        {
            put("*",MultiplicationOperation.class);
            put("/",DivisionOperation.class);
            put("+",AdditionOperation.class);
            put("-",SubtractionOperation.class);
            put("^",ExponentiationOperation.class);
            put("%",ModulationOperation.class);
        }
    };
}
