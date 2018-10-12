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
public class SubtractionOperation 
        implements Operation
{  
    public double perform(double operandA, double operandB)
    {
        return operandA-operandB;
    }
}