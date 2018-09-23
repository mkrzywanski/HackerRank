public class CombinationsOfTwo {
    public static void main(String[] args) {
        char[] chars = new char[] {'a', 'b', 'c', 'd'};
        //combinationsOfTwo(chars);
        comb1("asdf");
        comb2("asdf");
    }

    static void combinationsOfTwo(char[] chars) {
        for(char c : chars) {
            for(char c1 :chars) {
                if(c != c1) {
                    System.out.println(c + " " + c1);
                }
            }
        }
    }

    public static void comb1(String s) { comb1("", s); }

    // print all subsets of the remaining elements, with given prefix
    private static void comb1(String prefix, String s) {
        if (s.length() > 0) {
            System.out.println(prefix + s.charAt(0));
            comb1(prefix + s.charAt(0), s.substring(1));
            comb1(prefix,               s.substring(1));
        }
    }

    // alternate implementation
    public static void comb2(String s) { comb2("", s); }
    private static void comb2(String prefix, String s) {
        System.out.println(prefix);
        for (int i = 0; i < s.length(); i++)
            comb2(prefix + s.charAt(i), s.substring(i + 1));
    }

}
