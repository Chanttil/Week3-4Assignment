public class Main {
    public static void main(String[] args) {

        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 30};
        System.out.println(ages[ages.length - 1] - ages[0] + " Is the Last Element - First Element");

        double sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println(sum / ages.length + " Is the Average Age");

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        double sum2 = 0;
        for (int i = 0; i < names.length; i++) {
            sum2 += names[i].length();
        }
        System.out.println(sum2 / names.length + " Is the Average number of letters");

        String namesTogether = "";
        for (int i = 0; i < names.length; i++){
            namesTogether += names[i] + " ";
        }
        System.out.println(namesTogether + "Are the names put together ith a space");

        int [] nameLengths = new int[names.length];

        for (int i =0; i < names.length; i++){
            nameLengths[i] = names[i].length();
        }
        double sum3 = 0;
        for (int i = 0; i < nameLengths.length; i++){
            sum3 += nameLengths[i];
        }
        System.out.println(sum3 + " is the sum of elements in nameLengths");
    }

    public static String wordsRepeat(String word, int n){
        String longWord = "";
        for (int i = 0; i < n; i++){
            longWord += word;
        }
        return longWord;

    }
    public static String fullName(String firstName, String lastName){

        return firstName + " " + lastName;
    }

    public static boolean bigNumber(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if (sum > 100){
            return true;
        }
        return false;
    }
    public static double averageDoubles(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static boolean greaterAve(double[] arr1, double[] arr2){
        if (averageDoubles(arr1) > averageDoubles(arr2)){
            return true;
        }
        return false;
    }
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
        if (isHotOutside && moneyInPocket > 10.50){
            return true;
        }
        return false;
    }
        //This method checks to see if an integer is even or odd.
        //It returns either "even" or "odd".
    public static String evenOrOdd(int x){
        if (x % 2 == 0){
            return "even";
        }
        return "odd";
    }
}