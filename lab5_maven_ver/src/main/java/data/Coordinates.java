package data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.*;
@Getter

public class Coordinates {
    @NonNull
    private float x; //Значение поля должно быть больше -874, Поле не может быть null
    private float y; //Значение поля должно быть больше -590

    public Coordinates(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x){
        if (x > -874){
            this.x = x;
        }else{
            System.out.println("неправильно заданы координаты");
        }
    }
    public void setY(float y){
        if (y > -590 ){
            this.y = y;
        } else {
            System.out.println("неправильно заданы координаты");
        }
    }
    public String toString(){
        return  getX() + ", " + getY();
    }
}

