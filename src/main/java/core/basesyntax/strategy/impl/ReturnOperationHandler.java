package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.OperationHandler;

public class ReturnOperationHandler implements OperationHandler {
    @Override
    public int operation(int currentAmount, int operationAmount) {
        return currentAmount + operationAmount;
    }
}
