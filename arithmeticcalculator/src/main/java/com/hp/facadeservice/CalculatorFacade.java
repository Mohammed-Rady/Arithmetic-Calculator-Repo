package com.hp.facadeservice;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.model.Calculator;
import com.hp.model.Input;
import com.hp.service.CalculatorParser;
import com.hp.service.CalculatorService;

/**
 * @author Mohammed Rady
 *         Calculator facade layer that separate the implementation details.
 */
@Service
@SuppressWarnings("restriction")
public class CalculatorFacade {

    @Autowired
    CalculatorParser calculatorParser;

    @Autowired
    CalculatorService calculatorService;

    /**
     * <code>calculate</> method is responsible for calculating given expression. 
     * The calculation is divided into two phases. Parsing the user input and evaluating the parsed input.
     * 
     * @param input
     *        the raw input in XML format.
     * @return the final result in string form.
     * @throws JAXBException
     */
    public String calculate(Input input) throws JAXBException {
        Calculator parsedInput = calculatorParser.parseXML(input.getInput());
        double result = 0.0;

        if (parsedInput.getType().equalsIgnoreCase("single-operand")) {
            result = calculatorService.calculateSingleOperand(parsedInput);
        } else if (parsedInput.getType().equalsIgnoreCase("multi-operands")) {
            result = calculatorService.calculateMultiOperands(parsedInput);
        }

        return result + "";
    }

}
