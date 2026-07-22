class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 1. Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            // 2. Process closing brackets
            else {
                // If we see a closing bracket but the stack is empty, it's invalid
                if (st.isEmpty()) {
                    return false;
                }
                
                // Pop the top element and check for matching pairs
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // 3. If stack is empty, all brackets were matched correctly
        return st.isEmpty();
    }
}