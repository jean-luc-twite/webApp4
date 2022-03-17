/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.busness;

/**
 *
 * @author HP
 */
public class ArthmerticDataS {
    private String num1;
    private String num2;
    private String op;
    
    public ArthmerticDataS(){
        num1 ="N/A";
        num2="N/A";
        op ="N/A";
       
    }

    public ArthmerticDataS(String num1, String num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    public String getOp() {
        return op;
    }

    @Override
    public String toString() {
        return "ArthmerticDataS{" + "num1=" + num1 + ", num2=" + num2 + ", op=" + op + '}';
    }
    
    
}
