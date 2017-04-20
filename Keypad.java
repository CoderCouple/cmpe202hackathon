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
    
    int numberOfButtonRow=3;
    int numberOfButtonCol=4;
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
       getButtonInfo();
     }
     
    } 
    
   
     public String getButtonInfo()
    {
        String KeyString=null;
        int KeyNum=0;
        for (int i=0;i<numberOfButtonRow;i++){
            for (int j=0;j<numberOfButtonCol;j++){
                if((i*buttonlength)+keypadStartCordinateX<=mouseCoordinateX && ((i+1)*buttonlength)+keypadStartCordinateX>mouseCoordinateX && (j*buttonWidth)+keypadStartCordinateY<=mouseCoordinateY && ((j+1)*buttonWidth)+keypadStartCordinateY>mouseCoordinateY)
                {  
                   KeyNum = KeyNum+1;
                   if(KeyNum==10)
                   KeyString="*";
                   if(KeyNum==11)
                   KeyString="0";
                   if(KeyNum==12)
                   KeyString="#";
                   KeyString=String.valueOf(KeyNum);
                   System.out.println(KeyString);
                }
                
        }
     }
     return KeyString;
    }
   
}
