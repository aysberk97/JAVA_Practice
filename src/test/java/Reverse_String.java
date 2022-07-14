public class Reverse_String {

    public static void main(String[] args) {

        String s = "XANAX";
        String reverse = "";

        char ch [] = s.toCharArray();

        for(int i = s.length() -1; i >= 0; i--){

            reverse +=  ch[i];
        }

        System.out.println(reverse);

        if(s.equalsIgnoreCase(reverse)){
            System.out.println("String is polindrome");
        } else {
            System.out.println("String is not polindrome");
        }


    }

}
