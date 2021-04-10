/*
Jake Buchanan: 5450753 (bucha253)
Poojan Patel: 5453845  (patel709)
*/

import java.awt.*; //imports library needed to use Color class
import java.lang.Math.*; //imports library needed to use pi

public class Circle{
  //initializes private variables: xPosition, yPosition, radius, and col of type double and Color

  private double xPosition; //center x position
  private double yPosition; //center y position
  private double radius;
  private Color col;

  public Circle(double x, double y, double rad){
    //constructor. The this keyword is a reference to objects x, y, rad. We can refer to any of these from within an instance method.
    this.xPosition = x;
    this.yPosition = y;
    this.radius = rad;
  }

  public double calculatePerimeter(){
    //calculatePerimeter calculates circumference of circle and returns it as type double
    return 2*radius*Math.PI;
  }

  public double calculateArea(){
    //calculateArea calculates area of circle and returns it as type double
    return radius*radius*Math.PI;
  }

  public void setColor(Color colorOfCircle){
    //Set method sets the variable colorOfCircle value
    this.col = colorOfCircle;
  }

  public void setPos(double x, double y){
    //Set method sets the variable x and y values
    this.xPosition = x;
    this.yPosition = y;
  }

  public void setRadius(double rad){
    //Set method sets the variable rad value to given circle object's radius
    this.radius = rad;
  }

  public Color getColor(){
    //Get method returns the variable col value
    return col;
  }

  public double getXPos(){
    //Get method returns the variable xPosition value
    return xPosition;
  }

  public double getYPos(){
    //Get method returns the variable yPosition value
    return yPosition;
  }

  public double getRadius(){
    //Get method returns the variable radius value
    return radius;
  }

}//Circle class
