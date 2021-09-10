package LSP;

import java.util.Calendar;
import java.util.Date;

public class Annualmember extends Member {
    public Annualmember(String name, Date mStart){
        super(name);
        this.memberType = "Annual";
        this.mStartDate = mStart;
        Calendar c = Calendar.getInstance();
        c.setTime(this.mStartDate);
        c.add(Calendar.YEAR,1);
        this.mEndDate = c.getTime();
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added to the Annual Member info to DB");
    }
}