/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progressBars;
import Timer.TimeAndDate;
import Timer.TimeAndDate;
import javax.swing.*;
/**
 *
 * @author aly35
 */
public class ProgressBarGraphics extends JPanel{
TimeAndDate startTime;
TimeAndDate endTime;
TimeAndDate currentTime;

JProgressBar pbar;
static int Min;
static int Max;
private int percentage;


public ProgressBarGraphics(TimeAndDate start, TimeAndDate end)
    {
    startTime = start;
    endTime = end;
    currentTime = new TimeAndDate();
    currentTime.setCurrentTime();
    
    pbar = new JProgressBar();
    
    
    }

public int PercentageComplete()
{   
return (percentage);
}

public void Update()
    {
    
    }
}

