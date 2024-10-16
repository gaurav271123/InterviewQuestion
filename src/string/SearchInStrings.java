package string;

public class SearchInStrings {
    public static void main(String[] args) {
        String str ="hello";
        char target ='p';
        boolean exist = isExist(str, target);
        System.out.println(exist);
        System.out.println(" The required char "+ target+" in "+str+" is :"+ exist);
    }
    public static boolean isExist(String s, char c){
        for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i)==c){
               return true;
           }
        }
        return false;
    }
}
