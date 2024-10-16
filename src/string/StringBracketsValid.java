package string;

import java.util.Stack;

public class StringBracketsValid {
    public static void main(String[] args) {
        String s = "{[]{[]}}";

        boolean valid = isValid(s);
        if (valid){
            System.out.println(s+" is Valid");
        }else {
            System.out.println(s+" is InValid");
        }
    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray()){
            if (c=='{'|| c=='['){
                stack.push(c);
            } else if (c=='}'||c==']') {
                if (stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if( (c=='}'&& pop!='{') ||
                        c==']'&& pop!='['
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
