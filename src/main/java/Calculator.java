public class Calculator {
    //String Calculator Kata
    //Step 4

    private Calculator(){}

    public static int Add(String numbers){
        if(numbers == null){
            throw new NullPointerException();
        }
        final String PREFIX = "//";

        String delimiter = ";";
        int beginIndex = 0;
        if(numbers.startsWith(PREFIX)){
            delimiter = getDelimiter(numbers, PREFIX.length());
            beginIndex = delimiter.length() + PREFIX.length() + "\n".length();
        }
        String[] splitNumbers = getNumbers(numbers, beginIndex).split(",|\n|"+delimiter);

        int sum = 0;

        for(String number : splitNumbers){
            try {
                sum += number.isBlank() ? 0 : Integer.parseInt(number.trim());
            }catch (NumberFormatException e){
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return sum;
    }


    private static String getDelimiter(String argument, int prefixLength){
        String[] split = argument.split("\n");
        return split[0].substring(prefixLength);
    }

    private static String getNumbers(String argument, int beginIndex){
        return argument.substring(beginIndex);
    }

}
