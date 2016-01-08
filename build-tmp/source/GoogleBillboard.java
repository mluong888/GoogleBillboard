import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
    
public void setup()  
{            
     noLoop();
    
}  
public void draw()  
{   
	for (int beginIndex = 2; beginIndex<e.length(); beginIndex++)
    {
    	String digits = e.substring(beginIndex,beginIndex+10);
		double dNum = Double.parseDouble(digits);
     if(isPrime(dNum)==true)
	{
		System.out.println("The first prime number in e is" + dNum);
	}
	}
	

	//not needed for this assignment
}  
public boolean isPrime(double dNum)  
{  
	if(dNum <=1)
	{
    	return false;
	}
  	else if(dNum==2)
    {
    	return true;
    }
for(int j=2;j<=Math.sqrt(dNum);j++)
{
  if(dNum%j==0)
  {
    return false;
  }     
} 
return true;   
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
