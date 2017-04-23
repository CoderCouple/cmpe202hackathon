import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Keypad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keypad extends Actor
{
    /**
     * Act - do whatever the Keypad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int numberOfButtonRow=4;
    int numberOfButtonCol=3;
    int keypadWidth=240;
    int keypadHeight=320;
    int buttonlength=80;
    int buttonWidth=80;
    int mouseCoordinateX;
    int mouseCoordinateY;
    int keypadCentreCordinateX=725;
    int keypadCentreCordinateY=475;
    int keypadStartCordinateX=keypadCentreCordinateX-(keypadWidth/2);
    int keypadStartCordinateY=keypadCentreCordinateY-(keypadHeight/2);
    String keyInput="";
    
    public Keypad()
    {
        GreenfootImage image = getImage() ;
        image.scale( 240, 320 ) ;           
    }
    
   
    
    public void act() 
    {
     if(Greenfoot.mousePressed(this))
     { MouseInfo mouseInformation = Greenfoot.getMouseInfo();
       mouseCoordinateX= mouseInformation.getX();
       mouseCoordinateY= mouseInformation.getY();
       //setLocation(mouseCordinateX,mouseCordinateY);
       System.out.println(mouseCoordinateX);
       System.out.println(mouseCoordinateY);
       String Key=ButtonInfo();
       System.out.println(Key);
       System.out.println(inputString(Key));
     }
     
    } 
    
   
     public String ButtonInfo()
    {
        String KeyString=null;
        int KeyNum=0;
        for (int i=0;i<numberOfButtonRow;i++){
            for (int j=0;j<numberOfButtonCol;j++){
                KeyNum = KeyNum+1;
                int rangeStartX=(j*buttonlength)+keypadStartCordinateX;
                int rangeEndX=((j+1)*buttonlength)+keypadStartCordinateX;
                int rangeStartY=(i*buttonWidth)+keypadStartCordinateY;
                int rangeEndY=((i+1)*buttonWidth)+keypadStartCordinateY;
                
                //System.out.println(rangeStartX+" "+rangeEndX);
                //System.out.println(rangeStartY+" "+rangeEndY);
                
                if(rangeStartX<=mouseCoordinateX && rangeEndX>mouseCoordinateX && rangeStartY<=mouseCoordinateY && rangeEndY>mouseCoordinateY)
                {  
                   
                   if(KeyNum==10)
                   { KeyString="*";
                     System.out.println(KeyString);
                     return KeyString;
                   }
                   if(KeyNum==11)
                   {
                   KeyString="0";
                   System.out.println(KeyString);
                   return KeyString;
                   }
                   if(KeyNum==12)
                   {
                   KeyString="#";
                   System.out.println(KeyString);
                   return KeyString;
                   }
                   KeyString=String.valueOf(KeyNum);
                   System.out.println(KeyNum);
                   System.out.println(KeyString);
                   return KeyString;
                }
                
        }
     }
     return KeyString;
    }
    
        public String inputString(String key){
            if(key == "*")
            { System.out.println("Do nothing");}
            if(key == "#")
            { keyInput=keyInput.substring(0,keyInput.length() - 1);}
           
            if(key != "*" && key != "#")
            {keyInput=keyInput+key;}
            System.out.println(keyInput);
            return keyInput;
        }
            

}
