package co.com.coomeva.sipas.core.enums.examples;

/**
 * http://raulavila.com/2015/02/enums-java/
 * @author alge3325
 *
 */
public enum EnumOperation {
	
	ADD("+") {
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 + operand2;
        }
    },
    SUBSTRACT("-"){
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 - operand2;
        }
    },
    MULTIPLY("*"){
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 * operand2;
        }
    },
    DIVIDE("/"){
        @Override
        public int perform(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    EnumOperation(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public abstract int perform(int operand1, int operand2);
    
}


class ooo{
	
	void nulls(EnumOperation enums){
		int valor = EnumOperation.ADD.perform(30, 5);
	}
	
}
