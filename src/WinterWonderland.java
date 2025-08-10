import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class WinterWonderland extends Canvas
{
   public WinterWonderland()    //constructor method - sets up the class
   {
      setSize(800,600);
      Color lightBlue = new Color(173,216,230);
      setBackground(lightBlue);       
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.RED);

      window.drawString("Sanjana-Block 3 ", 35, 35 );

      theGround(window);
      //create several trees of varying sizes to the landscape
      tree1(window);
      snowman1(window);
      snowman2(window);
      tree2(window);
       tree3(window);
      snow(window);
      //Decorate the largest tree with some ornaments and a tree topper
      //add a snowman or two 
      //put some snow in the sky (you might try Math.random() to place some random
      //white dots in the sky)
      //add anything else that might enhance those Winter vibes
      
   }
   public void theGround(Graphics window)
   {
       window.setColor(Color.WHITE);
       window.fillRect(0,400,800,200);
   }
//   public void snowman1(Graphics window)
//   {
//	 //add more code here
//	  window.setColor(Color.WHITE) ;
//	  window.fillOval(450,320,90,90);
//	  window.setColor(Color.WHITE) ;
//	  window.fillOval(459,258,70,70);  
//	 
//	  //eyes
//	  window.setColor(Color.BLACK) ;
//	  window.fillOval(300,300,5,5);
//
//   }
//   public void snowman2(Graphics window)
//   {
//	 //add more code here
//	      window.setColor(Color.WHITE) ;
//		  window.fillOval(652,320,90,90);
//		  window.setColor(Color.WHITE) ;
//		  window.fillOval(660,258,70,70);  
//		  //eyes
//		  window.setColor(Color.BLACK) ;
//		  window.fillOval(900,287,8,8);
//		  window.setColor(Color.BLACK) ;
//		  window.fillOval(997,287,8,8);
//		  
//   }
   public void tree1( Graphics window )
   {
	  Color brown = new Color(88,43,9);
	  window.setColor(brown);
	  window.fillRect(200, 350, 50, 100);
	  Color darkGreen = new Color(10,48,4);
	  window.setColor(darkGreen);
      int[] x1 = {150,300,225};
      int[] y1 = {420,420,280};
      window.fillPolygon(x1, y1, 3);
      int[] x2 = {160,290,225};
      int[] y2 = {360,360,275};
      window.fillPolygon(x2, y2, 3);
      int[] x3 = {170,280,225};
      int[] y3 = {320,320,250};
      window.fillPolygon(x3, y3, 3);
                
   }
   public void tree2( Graphics window )
   {
	 //add more code here
	   Color brown = new Color(88,43,9);
		  window.setColor(brown);
		  window.fillRect(400, 400, 50, 100);
		  Color darkGreen = new Color(10,48,4);
		  window.setColor(darkGreen);
	      int[] x1 = {500,350,420};
	      int[] y1 = {420,420,280};
	      window.fillPolygon(x1, y1, 3);
	      int[] x2 = {500,350,420};
	      int[] y2 = {360,360,275};
	      window.fillPolygon(x2, y2, 3);
	      int[] x3 = {500,350,420};
	      int[] y3 = {320,320,250};
	      window.fillPolygon(x3, y3, 3);
//	     window.setColor(Color.RED);
//	     window.fillOval(500,600,12,12);
	      window.setColor(Color.RED);
		     window.fillOval(407,250,35,35);

//	                 
                
   }
   public void tree3( Graphics window )
   {
	 //add more code here
	   Color brown = new Color(88,43,9);
		  window.setColor(brown);
		  window.fillRect(553,400, 50, 100);
		  Color darkGreen = new Color(10,48,4);
		  window.setColor(darkGreen);
	      int[] x1 = {655,500,580};
	      int[] y1 = {420,420,280};
	      window.fillPolygon(x1, y1, 3);
	      int[] x2 = {655,500,580};
	      int[] y2 = {360,360,275};
	      window.fillPolygon(x2, y2, 3);
	      int[] x3 = {655,500,580};
	      int[] y3 = {320,320,250};
	      window.fillPolygon(x3, y3, 3);
	      window.setColor(Color.RED);
		     window.fillOval(500,600,20,20);
		     window.setColor(Color.RED);
		     window.fillOval(400,400,10,10);
		     window.setColor(Color.YELLOW);
		     window.fillOval(450,400,10,10);
		     window.setColor(Color.BLUE);
		     window.fillOval(435,360,10,10);
		     
                
   }
   public void snowman1(Graphics window)
   {
	 //add more code here
	  window.setColor(Color.WHITE) ;
	  window.fillOval(30,320,90,90);
	  window.setColor(Color.WHITE) ;
	  window.fillOval(37,258,70,70);  
	 
	  //eyes
	  window.setColor(Color.BLACK) ;
	  window.fillOval(76,287,8,8);
	  window.setColor(Color.BLACK) ;
	  window.fillOval(52,287,8,8);
//	  window.setColor(Color.RED);
//	     window.fillOval(407,250,35,35);

   }
   public void snowman2(Graphics window)
   {
	 //add more code here
	      window.setColor(Color.WHITE) ;
		  window.fillOval(652,320,90,90);
		  window.setColor(Color.WHITE) ;
		  window.fillOval(660,258,70,70);  
		  //eyes
		  window.setColor(Color.BLACK) ;
		  window.fillOval(700,287,8,8);
		  window.setColor(Color.BLACK) ;
		  window.fillOval(678,287,8,8);
		  
   }

   public void snow( Graphics window )
   {

        //add more code here
	    //Try combining a for loop with Math.random() and window.fillOval()
	   for(int i=300;i<1000;i++) {
           window.setColor(Color.WHITE);
		   window.fillOval((int)(Math.random()*i),((int)(Math.random()*i)),8,8);
	   }
   }
//   window.setColor(Color.RED);
//   window.fillOval(500,600,12,12);
}

   
