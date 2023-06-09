package sample;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

public class Password implements Serializable{
    String name;
    String key;
    String timeCreated = "";
    String organization;
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
    public Password(String name, String key, String timeCreated){
        this.name = name;
        this.key = key;
        this.timeCreated = timeCreated;
    }
    
    public static String returnHashed(String key) throws NoSuchAlgorithmException {
        return Algorithms.hashString(key);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getKey(){
        return this.key;
    }
    
    public void setKey(String key){
        this.key = key;
    }
    
    public String getTimeCreated(){
        return this.timeCreated;
    }

    public void setTimeCreated(String timeCreated){
        this.timeCreated = timeCreated;}

    @Override
    public String toString() {
        return name + ", " + key + ", " + timeCreated;
    }

}
