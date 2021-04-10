/*
Jake Buchanan: 5450753 (bucha253)
Poojan Patel: 5453845  (patel709)
*/

import java.awt.*; //imports library needed to use Color class
import java.lang.Math.*; //imports library needed to use power and square root

public class Triangle{
  //initializes private variables: xPosoition, yPosition, width, height, and col of type double and Color

  private double xPosition; //bottom left corner x position
  private double yPosition; //bottom left corner y position
  private double width;
  private double height;
  private Color col;

  public Triangle(double x, double y, double w, double h){
    //constructor. The this keyword is a reference to objects x, y, w, h. We can refer to any of these from within an instance method.
    this.xPosition = x;
    this.yPosition = y;
    this.width = w;
    this.height = h;
  }

  public double calculatePerimeter(){
    //calculatePerimeter calculates perimeter of triangle and returns it as type double
    double temp1 = Math.pow(width/2,2);
    double temp2 = Math.pow(height,2);
    double sides = (Math.sqrt(temp1 + temp2))*2;
    return (sides + width);
  }

  public double calculateArea(){
    //calculateArea calculates area of trianlge and returns it as type double
    return .5*width*height;
  }

  public void setColor(Color colorOfTriangle){
    //Set method sets the variable colorOfTriangle value to given triangle object's color
    this.col = colorOfTriangle;
  }

  public void setPos(double x, double y){
    //Set method sets the variable xPosition and yPosition values to given triangle object's x and y position
    this.xPosition = x;
    this.yPosition = y;
  }

  public void setHeight(double h){
    //Set method sets the variable h value to given triangle object's height
    this.height = h;
  }

  public void setWidth(double w){
    //Set method sets the variable w value to given triangle object's width
    this.width = w;
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

  public double getHeight(){
    //Get method returns the variable height value
    return height;
  }

  public double getWidth(){
    //Get method returns the variable width value
    return width;
  }

} // Triangle class
