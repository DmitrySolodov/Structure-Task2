public class BinOps {
    public String sum(String a, String b) {
        int decA = Integer.parseInt(a, 2);
        int decB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(decA + decB);
    }

    public String mult(String a, String b) {
        int decA = Integer.parseInt(a, 2);
        int decB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(decA * decB);
    }
}