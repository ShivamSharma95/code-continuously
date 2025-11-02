
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        int ai = a.length() - 1;
        int bi = b.length() - 1;
        int carry = 0;

        StringBuilder result;
        for(result = new StringBuilder(); ai >= 0 || bi >= 0; --bi) {
            int sum = (ai < 0 ? 0 : Character.getNumericValue(a.charAt(ai))) + (bi < 0 ? 0 : Character.getNumericValue(b.charAt(bi))) + carry;
            if (sum == 3) {
                result.append(1);
                carry = 1;
            } else if (sum == 2) {
                result.append(0);
                carry = 1;
            } else {
                result.append(sum);
                carry = 0;
            }

            --ai;
        }

        if (carry == 1) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}
