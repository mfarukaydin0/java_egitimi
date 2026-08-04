package basics;

public class TypeCasting {
    public static void main(String[] args) {

        int num = 7002;
        double doubleNum = num;
        System.out.println("int " + num + " converted to double: " + doubleNum);

        int convertedInt = (int) doubleNum;
        System.out.println("double " + doubleNum + " converted back to int: " + convertedInt);
    }
}