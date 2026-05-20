class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int intresult = 0;
        String strresult = " ";
            switch(operation){
                case "+":
                    intresult = operand1 + operand2;
                    strresult = operand1 + " + " + operand2 + " = " + intresult;
                    break;
                case "*":
                    intresult = operand1 * operand2;
                    strresult = operand1 + " * " + operand2 + " = " + intresult;
                    break;
                case "/":
                    try{
                        intresult = operand1 / operand2;
                        strresult = operand1 + " / " + operand2 + " = " + intresult;
                    }catch(ArithmeticException e){
                        throw new IllegalOperationException("Division by zero is not allowed",e);
                    }                    
                    break;
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                case null:
                    throw new IllegalArgumentException("Operation cannot be null");
                case "-":
                    throw new IllegalArgumentException("Operation '-' does not exist");
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                
            }
        return strresult;
    }
}
