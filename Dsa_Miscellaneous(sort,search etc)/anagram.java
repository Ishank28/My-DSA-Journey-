public class anagram {
    public static boolean ifAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If the lengths are different, they cannot be anagrams
        }

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        for (int i = 0; i < str1.length(); i++) {
            char ch = sb1.charAt(i);
            int j = 0;
            // You are comparing the first letter of string 1 with all letters of string 2
            while (j < sb2.length() && ch != sb2.charAt(j)) {
                j++;
            }
            if (j == sb2.length()) {
                return false;
            }
            sb2.deleteCharAt(j);
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "navya";
        String b = "yavnn";
        System.out.println(ifAnagram(a, b));
    }
}

