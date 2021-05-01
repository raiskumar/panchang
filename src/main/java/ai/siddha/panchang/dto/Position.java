package ai.siddha.panchang.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Represents the position of a star/graha
 * The positions of all these planets, upagrahas, lagna and special lagnas in the zodiac are measured in
 * degrees, minutes and seconds from the start of the zodiac (which is a fixed point in the sky).
 * These positions are measured as seen from earth and they are called “geocentric positions".
 *
 * When watched from earth, the longitude of any planet in the skies can be from 0°0'0'' (0 degrees 0 minutes 0 seconds) to 359°59'59''
 */
@AllArgsConstructor
public class Position {
    private String aka = "Longitude";  //longitude and sphuta
    private int degree;
    private int minutes;
    private int seconds;
    private String value;  // 29°59'59''

    public Position(int degree){
        this.degree = degree;
    }

    public long getMinutes(){
        return this.degree*60 + this.minutes;
    }

    public long getSeconds(){
        return this.degree*60 + this.minutes*60 + this.seconds;
    }

    public Position(String val){
        String[] vals = val.split(",");
        this.degree = Integer.parseInt(vals[0]);
        this.minutes = Integer.parseInt(vals[1]);
        this.seconds = Integer.parseInt(vals[2]);
        this.value = this.degree + "°" +
                this.minutes + "'" +
                this.seconds + "''";
    }

    public String toString(){
        return this.value;
    }
}
