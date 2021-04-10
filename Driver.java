/*
Jake Buchanan: 5450753 (bucha253)
Poojan Patel: 5453845  (patel709)
*/

import java.util.Scanner; //allows user input
import java.awt.*; //imports library needed to use Color class


public class Driver{

  public static void main(String[]args){
    // The main function uses scanner simply to take input from the user
    System.out.println("Triangle, Rectangle, or Circle?");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine().toLowerCase();

    if(input.equals("triangle")){
      /*If the user types "Triangle," the canvas and variables: x,y,w,h,level, and lastlvl are
      initialized and the triangleFractal function is called using those values.
      */
      Canvas drawing = new Canvas(800,800);
      double x = 400;
      double y = 600;
      double w = 300;
      double h = 600;
      int level = 0;
      int lastLvl = 8;
      triangleFractal(x,y,w,h,drawing,level,lastLvl);
      System.out.println("The area is:" + triangleFractalArea(x,y,w,h,level,lastLvl));
    }

    else if(input.equals("rectangle")){
      /* If the user types "Rectangle," the canvas and variables: x,y,w,h,level, and lastlvl are
      initialized and the rectangleFractal function is called using those values.
      */
      Canvas drawing = new Canvas(800,800);
      double x = 300;
      double y = 300;
      double w = 200;
      double h = 100;
      int level = 0;
      int lastLvl = 8;
      rectangleFractal(x,y,w,h,drawing,level,lastLvl);
      System.out.println("The area is:" + rectangleFractalArea(x,y,w,h,level,lastLvl));
    }

    else if(input.equals("circle")){
      /*If the user types "Circle," the canvas and variables: x,y,rad,level, and lastlvl are
      initialized and the circleFractal function is called using those values.
      */
      Canvas drawing = new Canvas(1000,1000);
      double x = 500;
      double y = 300;
      double rad = 200;
      int level = 0;
      int lastLvl = 8;
      circleFractal(x,y,rad,drawing,level,lastLvl);
      System.out.println("The area is:" + circleFractalArea(x,y,rad,level,lastLvl));
    }

    else{
      //break;
    }

  } //main

  public static Canvas triangleFractal(double x, double y, double w, double h,Canvas drawing,int level, int lastLvl){
    /* The class triangleFractal creates, draws, and displays a triangle fractal that has been repeated on itself
    7 times. The function starts at level 0 and calls the triangleFractal function of 1 level higher until it is equal to
    the number of iterations we want. When the current level is equal to the "final" level, the first triangle is drawn and
    then the other triangles can be drawn.
    */
    Triangle myTriangle = new Triangle(x,y,w,h);
    if(level%2 == 0){
      myTriangle.setColor(Color.BLUE);
    }
    else{
      myTriangle.setColor(Color.RED);
    }
    if(level == lastLvl){
      drawing.drawShape(myTriangle);
    }
    else{
      drawing.drawShape(myTriangle);
      triangleFractal(x,y,w*.5,h*.5,drawing,level + 1,lastLvl);
      triangleFractal(x + w*.5,y,w*.5,h*.5,drawing, level + 1,lastLvl);
      triangleFractal(x + w*.25,y - .5*h,w*.5,h*.5,drawing, level + 1, lastLvl);
    }
      return drawing;
  }

  public static double triangleFractalArea(double x, double y, double w, double h,int level, int lastLvl){
    /* triangleFractalArea function uses a for loop to calculate the area of the fractal. For every iteration
    a new instance of triangle is created and it uses the calculateArea method to find the area of one triangle
    in that level of the fractal. This value is multiplied by the number of triangles for that level (3 to the
    power of level because there are 3 new triangles for every level). This value is added to the running total.
    */
    double triangleArea = 0;
    for (level = 0; level <=lastLvl;level++){
      Triangle myTriangle = new Triangle(x,y,w,h);
      double numOfTriangles = Math.pow(3,level);
      triangleArea += myTriangle.calculateArea()*numOfTriangles;
      w *= .5;
      h *= .5;
    }
    return triangleArea;
  }

  public static Canvas rectangleFractal(double x, double y, double w, double h,Canvas drawing,int level, int lastLvl){
    /* The class rectangleFractal creates, draws, and displays a rectangle fractal that has been repeated on itself
    7 times. The function is similar to the triangle one. The function starts at level 0 and calls the rectangleFractal
    function of 1 level higher until it is equal to the number of iterations we want. When the current level is equal
    to the "final" level, the first rectangle is drawn and then the other 4 rectangles can be drawn at each corner.
    */
    Rectangle myRectangle = new Rectangle(x,y,w,h);
    if(level%2 == 0){
      myRectangle.setColor(Color.GREEN);
    }
    else{
      myRectangle.setColor(Color.YELLOW);
    }
    if(level == lastLvl){
      drawing.drawShape(myRectangle);
    }
    else{
      drawing.drawShape(myRectangle);
      rectangleFractal(x - w*.5,y + h,w*.5,h*.5,drawing,level + 1,lastLvl); //bottom left
      rectangleFractal(x - w*.5,y - .5*h,w*.5,h*.5,drawing, level + 1,lastLvl); //top left
      rectangleFractal(x + w,y - .5*h,w*.5,h*.5,drawing, level + 1, lastLvl); //top right
      rectangleFractal(x + w,y + h,w*.5,h*.5,drawing, level + 1, lastLvl); //bottom right
    }
    return drawing;
  }

  public static double rectangleFractalArea(double x, double y, double w, double h,int level, int lastLvl){
    /* rectangleFractalArea function uses a for loop to calculate the area of the fractal. For every iteration
    a new instance of rectangle is created and it uses the calculateArea method to find the area of one rectangle
    in that level of the fractal. This value is multiplied by the number of rectangles for that level (4 to the
    power of level because there are 4 new rectangles for every level). This value is added to the running total.
    */
    double rectangleArea = 0;
    for (level = 0; level <=lastLvl;level++){
      Rectangle myRectangle = new Rectangle(x,y,w,h);
      double numOfRectangles = Math.pow(4,level);
      rectangleArea += myRectangle.calculateArea()*numOfRectangles;
      w *= .5;
      h *= .5;
    }
    return rectangleArea;
  }

  public static Canvas circleFractal(double x, double y, double rad,Canvas drawing,int level, int lastLvl){
    /* The class circleFractal creates, draws, and displays a circle fractal that has been repeated on itself
    7 times. The function is also similar to the triangle and rectangle one. The function starts at level 0 and
    calls the circleFractal function of 1 level higher until it is equal to the number of iterations we want.
    When the current level is equal to the "final" level, the first circle is drawn and then the other 2
    circles are drawn along the radius\.
    */
    Circle myCircle = new Circle(x,y,rad);
    if(level%2 == 0){
      myCircle.setColor(Color.DARK_GRAY);
    }
    else{
      myCircle.setColor(Color.MAGENTA);
    }
    if(level == lastLvl){
      drawing.drawShape(myCircle);
    }
    else{
      drawing.drawShape(myCircle);
      circleFractal(x - rad,y,rad*.5,drawing,level + 1,lastLvl); //left
      circleFractal(x + rad,y,rad*.5,drawing, level + 1,lastLvl); //right
    }
    return drawing;
  }

  public static double circleFractalArea(double x, double y, double rad,int level, int lastLvl){
    /* circleFractalArea function uses a for loop to calculate the area of the fractal. For every iteration
    a new instance of circle is created and it uses the calculateArea method to find the area of one circle
    in that level of the fractal. This value is multiplied by the number of circles for that level (2 to the
    power of level because there are 2 new circles for every level). This value is added to the running total.
    */
    double circleArea = 0;
    for (level = 0; level <=lastLvl;level++){
      Circle myCircle = new Circle(x,y,rad);
      double numOfCircles = Math.pow(2,level);
      circleArea += myCircle.calculateArea()*numOfCircles;
      rad *= .5;
    }
    return circleArea;
  }

} //Driver class
