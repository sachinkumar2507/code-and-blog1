package LSP;

public class Enquiryuser extends Member{
    public Enquiryuser(String name){
        super(name);
        this.memberType = "Enquiry";
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added to the Enquiry Info to DB");
    }
}
