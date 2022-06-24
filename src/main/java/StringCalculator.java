public class StringCalculator {

    public static void main(String[] args) {

        String testNumbers = "5";
        String testNumbers2 = "7,12";
        String testNumbers3 = "5,6,3,8";
        String testNumbers4 = "5,6,10,11,7,2,1";
        String testNumbers5 = "5,6,10\n11,7,2,1";
        String testNumbers6 = "5,6,10\n11,7\n2,1";



        System.out.println(Calculator.Add(testNumbers));
        System.out.println(Calculator.Add(testNumbers2));
        System.out.println(Calculator.Add(testNumbers3));

        System.out.println(testNumbers4);
        System.out.println(Calculator.Add(testNumbers4));
        System.out.println(testNumbers5);
        System.out.println(Calculator.Add(testNumbers5));
        System.out.println(testNumbers6);
        System.out.println(Calculator.Add(testNumbers6));

    }
}
