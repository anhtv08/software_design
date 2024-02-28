package DTA;

import java.util.Stack;

public class StackApplication {

    static boolean validateSyntax(
            String input) {
        boolean rs = true;
        if (input.length() == 0 || input == null)
            return rs;

        Stack<Character> temp = new Stack<>();
        for (char c : input.toCharArray()) {

            // if openning brackets then push into stack
            switch (c) {
                case '(':
                    temp.push(c);
                    break;
                case '{':
                    temp.push(c);
                    break;
                case '[':
                    temp.push(c);
                    break;

                // if closing, then pop
                case ']':

                    if (temp.pop() != '[') {
                        rs = false;
                        return rs;
                    }
                    break;

                case ')':
                    if (temp.pop() != '(') {
                        rs = false;
                        return rs;
                    }
                    break;

                case '}':
                    if (temp.pop() != '{') {
                        rs = false;
                        return rs;
                    }
                    ;
                    break;
                default:
                    break;
            }
        }
        // check if any orphan
        // if stack empty then all matched. else return false
        rs = temp.size() == 0 ? true : false;

        return rs;

    }

    public static void main(String[] args) {
        String input = "{}";
        boolean rs = validateSyntax(input);
        System.out.println("input :" + input  +","  + rs);

        input = "{[abc]}";
        rs = validateSyntax(input);
        System.out.println("input :" + input  +"," + rs);

        input = "{[}";
        rs = validateSyntax(input);
        System.out.println("input :" + input  +"," + rs);

        input = "{}[";
        rs = validateSyntax(input);
        System.out.println("input :" + input  +","+ rs);
    }

}
