public class StringCalculator {

    public static void main(String[] args) {

        String testNumbers = "5";
        String testNumbers2 = "7,12";
        String testNumbers3 = "5,6,3,8";
        String testNumbers4 = "5,6,10,11,7,2,1";
        String testNumbers5 = "5,6,10\n11,7,2,1";
        String testNumbers6 = "5,6,10\n11,7\n2,1";
        String testNumbers7 = "5;6\n4;6;7";
        String testNumbers8 = "//!\n11!12\n16";
        String testNumbers9 = "//#d!\n15#d!10#d!70#d!4#d!1#d!12#d!13";





        System.out.println(Calculator.Add(testNumbers));
        System.out.println(Calculator.Add(testNumbers2));
        System.out.println(Calculator.Add(testNumbers3));

        System.out.println(testNumbers4);
        System.out.println(Calculator.Add(testNumbers4));
        System.out.println(testNumbers5);
        System.out.println(Calculator.Add(testNumbers5));
        System.out.println(testNumbers6);
        System.out.println(Calculator.Add(testNumbers6));
        System.out.println(Calculator.Add(testNumbers7));

        System.out.println(Calculator.Add(testNumbers8));
        System.out.println(Calculator.Add(testNumbers9));




    }
}
