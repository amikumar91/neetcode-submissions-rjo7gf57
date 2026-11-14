class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String operation : operations){
            if(operation.equals("+")){
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            }else if(operation.equals("D")){
                stack.push(2 * stack.peek());
            }else if(operation.equals("C")){
                stack.pop();
            }else{
                int val = Integer.valueOf(operation);
                stack.push(val);
            }
        }
        
        int output = 0;
        while(!stack.isEmpty()){
            output += stack.pop();
        }

        return output;
    }
}