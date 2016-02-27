package com.hp.service;

import org.springframework.stereotype.Service;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.hp.model.Calculator;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    /*
     * (non-Javadoc)
     * @see
     * com.hp.service.CalculatorService#calculateMultiOperands(com.hp.model.
     * Calculator)
     */
    public double calculateMultiOperands(Calculator calculator) {
        String mathematicalExpression = getMathematicalExpression(calculator);
        Double result = new DoubleEvaluator().evaluate(mathematicalExpression);
        return result;
    }

    /*
     * (non-Javadoc)
     * @see
     * com.hp.service.CalculatorService#calculateSingleOperand(com.hp.model.
     * Calculator)
     */
    public double calculateSingleOperand(Calculator calculator) {
        if (calculator.getOperator().get(0).equalsIgnoreCase("abs")) {
            return Math.abs(Double.parseDouble(calculator.getOperand().get(0)));
        } else if (calculator.getOperator().get(0).equalsIgnoreCase("sizeOf")) {
            return calculator.getOperand().get(0).length();
        }
        return 0;
    }

    /**
     * Transforms the model representation of the calculator into mathematical
     * expression.
     * 
     * @param calculator
     * @return
     */
    private String getMathematicalExpression(Calculator calculator) {
        String mathematicalExpression = "";
        for (int i = 0; i < calculator.getOperand().size(); i++) {
            mathematicalExpression += calculator.getOperand().get(i);
            if (i + 1 != calculator.getOperand().size()) {
                mathematicalExpression += calculator.getOperator().get(i);
            }
        }
        return mathematicalExpression;
    }

}
