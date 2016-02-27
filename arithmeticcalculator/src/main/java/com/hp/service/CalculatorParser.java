package com.hp.service;

import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Service;

import com.hp.model.Calculator;

/**
 * @author Mohammed Rady
 *         Parser interface that expose all parsing methods.
 */
@Service
@SuppressWarnings("restriction")
public interface CalculatorParser {

    /**
     * Parses given string into model object <code>Calculator</code>
     * 
     * @param string
     *        raw input.
     * @return concrete <code>Calculator</code>.
     * @throws JAXBException
     */
    public Calculator parseXML(String string) throws JAXBException;

}
