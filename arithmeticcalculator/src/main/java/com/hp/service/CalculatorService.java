package com.hp.service;

import org.springframework.stereotype.Service;

import com.hp.model.Calculator;

/**
 * @author Mohammed Rady
 *         Calculator interface that expose all calculation methods.
 */
@Service
public interface CalculatorService {

    /**
     * Calculates multi-operands forms.
     * 
     * @param calculator
     *        terms model
     * @return final result.
     */
    public double calculateMultiOperands(Calculator calculator);

    /**
     * Calculates sinle-operand form.
     * 
     * @param calculator
     *        terms model
     * @return final result.
     */
    public double calculateSingleOperand(Calculator calculator);

}
