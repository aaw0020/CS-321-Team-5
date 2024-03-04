/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lookingforward.pkg1;
import model.CreateTimer;
import model.EndTimer;
import model.ProgressBarGraphics;
import model.Quit;
import model.SaveTimer;
import model.TimeAndDate;
import model.LookingForwardMainGui;
/**
 *
 * @author aly35
 */
public class LookingForward1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LookingForwardMainGui gui = new LookingForwardMainGui();
    TimeAndDate localTime = new TimeAndDate();
    System.out.println(localTime.getCurrentTime());
    }
    
}
