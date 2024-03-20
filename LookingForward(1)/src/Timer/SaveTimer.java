/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Timer;

/**
 *
 * @author aly35
 */
import Timer.TimeAndDate;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
 *
 * @author aly35
 */
public class SaveTimer {

   private TimeAndDate startTime;
   private TimeAndDate endTime;
   private File outputFile;
   
   public SaveTimer(TimeAndDate start, TimeAndDate end, File out)
   {
    startTime = start;
    endTime = end;
    outputFile = out;
   }

   



public void SaveTimer(TimeAndDate startTime, TimeAndDate endTime, File file)
    {
    try
        {
        FileWriter writer = new FileWriter(file.getName());
        writer.write(startTime.getCurrentTime());
        writer.write(endTime.getEndTime());
        writer.close();
        }
    catch(IOException error)
        {
        System.out.println("An error occured while writing to file");
        error.printStackTrace();
        }
    }
}