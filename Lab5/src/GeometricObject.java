import java.util.Date;
import java.lang.Math;
public class GeometricObject {
    private String color="white";
    private boolean filled=false;
    private Date dateCreated;
    Date todayDate = new Date();
    public GeometricObject(){

    }
    public GeometricObject(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated(){
        return todayDate;
    }

    public String toString(){
        return " created on "+todayDate+"\ncolor: "+color+" and filled: "+filled;
    }
}
