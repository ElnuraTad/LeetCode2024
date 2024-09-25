public class AddString {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carray = 0;
        while ( i >= 0 || j >= 0){
            int sum = carray;
            if(i >= 0) {
                sum += num1.charAt(i--) - '0';
            }
            if(j >= 0) {
                sum += num2.charAt(j--) - '0';
            }
            result.append(sum % 10);
            carray = sum / 10;
        }
        if(carray != 0) {
            result.append(carray);
        }
        return result.reverse().toString();

    }
    public static void main(String[] args) {
        // Example usage
        String num1 = "11";
        String num2 = "123";
        String expectation = addStrings(num1, num2);
        System.out.println(expectation); // Output: [, 1]
    }
}
