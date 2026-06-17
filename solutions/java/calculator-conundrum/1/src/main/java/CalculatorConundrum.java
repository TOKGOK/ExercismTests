class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else if(operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        
        if(operation.equals("+")){
            return cal(operand1,operand2,operation,operand1 + operand2);
        }else if(operation.equals("*")){
            return cal(operand1,operand2,operation,operand1 * operand2);
        }else if(operation.equals("/")){
             try {
                    return cal(operand1,operand2,operation,operand1 / operand2);
                } catch (ArithmeticException ae) {
                    // Wrap the original ArithmeticException as cause
                    throw new IllegalOperationException("Division by zero is not allowed", ae);
                }
        }else{
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }

    private String cal(int operand1, int operand2, String operation,int ret){
        return "" + operand1 + " " + operation + " " + operand2 + " = " + ret;
    }
}

class IllegalArgumentException  extends IllegalOperationException {
    public IllegalArgumentException (String errorMessage) {
        super(errorMessage);
    }

    public IllegalArgumentException (String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}

