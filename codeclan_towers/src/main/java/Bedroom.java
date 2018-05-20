import java.util.ArrayList;

public class Bedroom extends Room{

    private double nightlyRate;

    public Bedroom(int capacity, double nightlyRate){
        super(capacity);
        this.nightlyRate = nightlyRate;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }


}
