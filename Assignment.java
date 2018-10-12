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
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] argv)
                
    {
        final Operation operation;
        
        operation = Operations.getOperationFor(argv[1]);
        System.out.println(operation.perform(Double.parseDouble(argv[0]), 
                                             Double.parseDouble(argv[2])));
    }
    
}
