class FieldArea {
    double width;
    double height;

    FieldArea() {
    }

    FieldArea(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double d) {
        if (d >= 0) {
            width = d;
        } else {
            width = 0.0;
        }
    }

    public void setHeight(double h) {
        if (h >= 0) {
            height = h;
        } else {
            height = 0.0;
        }
    }

    public double getArea() {
        return height * width;
    }
}

/*
 * 
 * Field Area
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Write a class with the name Wall. The class needs two fields (instance
 * variables) with name width and height of type double.
 * 
 * The class needs to have two constructors.
 * The first constructor does not have any parameters (no- arg constructor) , in
 * which you should print
 * The second constructor has parameters width and height respectively of type
 * double and it needs to initialize the fields. In case the width is less than
 * 0 it needs to set the width field value to 0, in case the height parameter is
 * less than 0 it needs to set the height field value to 0.
 * 
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of
 * width field.
 * Method named getHeight without any parameters, it needs to return the value
 * of height field.
 * Method named setWidth with one parameter of type double, it needs to set the
 * value of the width field. If the parameter is less than 0 it needs to set the
 * width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the
 * value of the height field. If the parameter is less than 0 it needs to set
 * the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of
 * the wall.
 * 
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 5 methods and 2 constructors.
 * NOTE: Do not add a main method to the solution code.
 * Input
 * You don't have to take any input, You only have to write class FieldArea.
 * Output
 * Output will be printed by tester, "Correct" if your code is perfectly fine
 * otherwise "Wrong".
 * Example
 * Sample Input:
 * class FieldArea{
 * // if your code works fine for the tester
 * }
 * 
 * Sample Output:
 * Correct
 */