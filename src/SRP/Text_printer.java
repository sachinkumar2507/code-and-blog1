package SRP;

import java.util.Arrays;

public class Text_printer {
    Text_manipulator textmanipulator;

    public Text_printer(Text_manipulator textmanipulator ){
        this.textmanipulator = textmanipulator;
    }

    public void printText(){
        System.out.println(textmanipulator.getText());
    }

    public void printOutEachWordOfText(){
        System.out.println(Arrays.toString(textmanipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex){
        System.out.println(textmanipulator.getText().substring(startingIndex,endIndex));
    }
}