
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        for (String value : strArray) {
            System.out.print(value);
        }
        for (String value : strArray) {
            System.out.print(value + "-");
        }
    }
}
