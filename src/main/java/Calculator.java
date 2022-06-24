public class Calculator {
    //String Calculator Kata
    //Step 2

    private Calculator(){}

    public static int Add(String numbers){
        if(numbers == null){
            throw new NullPointerException();
        }
        String[] splitNumbers = numbers.split(",");


        int sum = 0;

        for(String number : splitNumbers){

            try {
                sum += number.isBlank() ? 0 : Integer.parseInt(number.trim());
            }catch (NumberFormatException e){
                throw new IllegalArgumentException("the argument should only contain numbers separated by commas");
            }
        }
        return sum;
    }

}
