/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainWindow;
import Timer.CreateTimer;
import Timer.EndTimer;
import progressBars.ProgressBarGraphics;
import model.Quit;
import Timer.SaveTimer;
import Timer.TimeAndDate;
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
