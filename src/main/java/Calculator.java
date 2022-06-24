import java.util.Arrays;

public class Calculator {
    //String Calculator Kata
    //Step 6

    private Calculator(){}

    public static int Add(String numbers){
        if(numbers == null){
            throw new NullPointerException();
        }

        int sum = 0;
        handleNegatives(getSplit(numbers));
        for(String number : getSplit(numbers)){
            try {
                int toAdd = number.isBlank() ? 0 : Integer.parseInt(number.trim());
                if(toAdd <= 1000){
                    sum += toAdd;
                }
            }catch (NumberFormatException e){
                throw new IllegalArgumentException();
            }
        }
        return sum;
    }

    private static String[] getSplit(String numbers){
        final String PREFIX = "//";
        String delimiter = ";";
        int beginIndex = 0;
        if(numbers.startsWith(PREFIX)){
            delimiter = getDelimiter(numbers, PREFIX.length());
            beginIndex = delimiter.length() + PREFIX.length() + "\n".length();
        }
        return getNumbers(numbers, beginIndex).split(",|\n|"+delimiter);
    }


    private static String getDelimiter(String argument, int prefixLength){
        return argument.split("\n")[0].substring(prefixLength);
    }

    private static String getNumbers(String argument, int beginIndex){
        return argument.substring(beginIndex);
    }

    private static void handleNegatives(String[] numbers){
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(numbers)
                .filter(number -> !number.isBlank())
                .map(Integer::parseInt)
                .filter(number -> number < 0)
                .forEach(number -> stringBuilder.append(number).append(", "));
        if(!stringBuilder.toString().isBlank()){
            throw new NegativesNotAllowedException(stringBuilder.toString());
        }
    }

}
