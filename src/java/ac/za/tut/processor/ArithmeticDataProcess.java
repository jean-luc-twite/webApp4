/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.processor;

import ac.za.tut.busness.ArthmerticDataS;

/**
 *
 * @author HP
 */
public class ArithmeticDataProcess {

    public ArithmeticDataProcess() {
    }
    public String determineRequiredFunctionality(ArthmerticDataS ad){
        int num1,num2;
        String outcome;
        char op;
        
        //get the data 
        num1 = Integer.parseInt(ad.getNum1());
        num2 = Integer.parseInt(ad.getNum2());
        op = ad.getOp().charAt(0);
        //process
        switch(op){
            case '+':
            //determine the outcome
                outcome = Integer.toString(num1 + num2);
               break;
            case '*':
                outcome =Integer.toString(num1 *num2);
                break;
            case '/':
                outcome =Integer.toString(num1 / num2);
                break;
            default:
                 outcome =Double.toString((double)num1 - num2);
        }
        return outcome;
    }      
}
