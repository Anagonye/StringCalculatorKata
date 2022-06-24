public class Calculator {
    //String Calculator Kata
    //Step 1

    private Calculator(){}

    public static int Add(String numbers){
        if(numbers == null){
            throw new NullPointerException();
        }
        String[] splitNumbers = numbers.split(",");

        if(splitNumbers.length > 2 ){
            throw new IllegalArgumentException("the maximum number of arguments is 2");
        }

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
