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
public class classification {
    private int[] container;
    public void setClassification(int [] cont){
     Arrays.sort(cont);
     
     this.container=cont;
    }
    public String getClassification (){
    return Arrays.toString(container); 
    }
    
}
