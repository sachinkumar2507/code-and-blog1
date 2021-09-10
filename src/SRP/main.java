package SRP;
public class main {
    public static void main(String[] args) {
        Text_manipulator text_manipulator = new Text_manipulator("Sachin Kumar Shrivastav");
        Text_printer textPrinter = new Text_printer(text_manipulator);
        System.out.println(text_manipulator.appendText("SRP_Code_Example"));
        textPrinter.printOutEachWordOfText();
    }
}