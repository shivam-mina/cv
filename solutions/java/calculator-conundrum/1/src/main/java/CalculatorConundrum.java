class CalculatorConundrum {
    public String calculate(int x, int y, String operation) throws IllegalArgumentException,IllegalOperationException {
        try{  
            if(operation.isEmpty())
                throw new IllegalArgumentException("Operation cannot be empty");
            int ans;
            if(operation.equals("+"))
                ans=x+y;
            else if (operation.equals("*"))
                ans=x*y;
            else if (operation.equals("/"))
                ans=x/y;                
            else
                throw new IllegalOperationException("Operation '" +operation +"' does not exist");
                    
            return String.valueOf(x) + " " + operation + " " +String.valueOf(y) + " = " + String.valueOf(ans);
        }
        catch (ArithmeticException e)
            {
                throw new IllegalOperationException("Division by zero is not allowed" , e);
            }
        catch (NullPointerException e)
            {
                throw new IllegalArgumentException("Operation cannot be null");
            }

    }
}
