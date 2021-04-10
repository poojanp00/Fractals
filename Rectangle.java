/*
Jake Buchanan: 5450753 (bucha253)
Poojan Patel: 5453845  (patel709)
*/

import java.awt.*; //imports library needed to use Color class

public class Rectangle{
  //initializes private variables: xPosoition, yPosition, width, height, and col of type double and Color

  private double xPosition; //bottom left corner x position
  private double yPosition; //bottom left corner y position
  private double width;
  private double height;
  private Color col;

  public Rectangle(double x, double y, double w, double h){
    //constructor. The this keyword is a reference to objects x, y, w, h. We can refer to any of these from within an instance method.
    this.xPosition = x;
    this.yPosition = y;
    this.width = w;
    this.height = h;
  }

  public double calculatePerimeter(){
    //calculatePerimeter calculates perimeter of rectangle and returns it as type double
    return (2*width) + (2*height);
  }

  public double calculateArea(){
    //calculateArea calculates area of rectangle and returns it as type double
    return width*height;
  }

  public void setColor(Color colorOfRectangle){
    //Set method sets the variable colorOfRectangle value to given rectangle object's color
    this.col = colorOfRectangle;
  }

  public void setPos(double x, double y){
    //Set method sets the variable x and y values to given rectangle object's x and y position
    this.xPosition = x;
    this.yPosition = y;
  }

  public void setHeight(double h){
    //Set method sets the variable h value to given rectangle object's height
    this.height = h;
  }

  public void setWidth(double w){
    //Set method sets the variable w value to given rectangle object's width
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

}//Rectangle class
