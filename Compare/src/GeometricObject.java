/**
 *
 * @author gansc
 */
public abstract class GeometricObject implements Comparable {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    
    protected GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
    }

    public String getColor(){
        return color;
    }


    public void setColor(String color){
        this.color = color;
    }


    public boolean isFilled(){
        return filled;
    }


    public void setFilled(boolean filled){
        this.filled = filled;
    }


    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color +
                "and filled: " + filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    
    public int compareTo(Object o1) {
        if (getArea()==((GeometricObject)o1).getArea())
            return 0;
        else if (getArea()>((GeometricObject)o1).getArea())
            return 1;
        else
            return -1;
    }

    public static void max (Object o, Object o1) {
        if (((GeometricObject)o).compareTo(o1)==1){
            System.out.println("First object is larger than second object");
        } else if (((GeometricObject)o).compareTo(o1)==0){
            System.out.println("Both objects are equel");
        } else {
            System.out.println("First object is smaller than second object");
        }
    }

}


    


