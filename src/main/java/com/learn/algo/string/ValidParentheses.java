package com.learn.algo.string;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	public boolean  isValid(String input){
        if(input == null || input.isEmpty()){
            return false;
        }
        Stack<Character> st = new  Stack<Character>();
        st.push(input.charAt(0));
        for(int i = 0;i<input.length() ;i++){
            char c = input.charAt(i); 
            switch(c){
              case '{' :
              case '(' :
              case '[' :
                  st.push(c);
                  break;
              case ')':
              case '}' :
              case ']' :
               if(st.isEmpty()){
                   return false;
               }
               char pop = st.pop();
               if( pop== '(' && c!=')'){
                  return false; 
               }
               if( pop== '{' && c!='}'){
                  return false; 
               }
               if( pop== '[' && c!=']'){
                  return false; 
               }
               default:
                return false;
                  
            }
        }
        return st.isEmpty();
    }
}
