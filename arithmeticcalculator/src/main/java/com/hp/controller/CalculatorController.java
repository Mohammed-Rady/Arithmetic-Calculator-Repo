package com.hp.controller;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hp.facadeservice.CalculatorFacade;
import com.hp.model.Input;

/**
 * @author Mohammed Rady
 *         Main application controller handling all requests and direct the
 *         responses accordingly.
 */
@Controller
@SuppressWarnings("restriction")
public class CalculatorController {

    @Autowired
    CalculatorFacade calculatorFacade;

    /**
     * To get the initial home page view
     * 
     * @param model
     *        the model object.
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(Model model) {
        return "home";
    }

    /**
     * The controller that calculate particular expression.
     * 
     * @param input
     *        represnets the user input.
     * @param bindingResult
     *        binding results.
     * @param model
     *        the data model.
     * @return final view.
     */
    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public String calculateArithmeticExpression(@ModelAttribute("input") Input input, BindingResult bindingResult,
            Model model) {

        String result = null;
        try {
            result = calculatorFacade.calculate(input);
        } catch (JAXBException e) {
            result = "Input error format!";
        }
        model.addAttribute("result", result);

        return "home";
    }

}
