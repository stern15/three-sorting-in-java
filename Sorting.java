/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.*;
/**
 *
 * @author semasuka
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("enter x:");
        x=input.nextInt();
        System.out.println("enter y:");
        y=input.nextInt();
        System.out.println("enter z:");
        z=input.nextInt();
        int [] container={x,y,z};
        classification classObj=new classification();
        classObj.setClassification(container);
        System.out.println("the order number is:"+classObj.getClassification());
    }
    
}
