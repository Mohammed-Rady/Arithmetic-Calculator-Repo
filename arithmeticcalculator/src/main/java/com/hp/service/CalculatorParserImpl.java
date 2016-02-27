package com.hp.service;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.hp.model.Calculator;

@Service
@SuppressWarnings("restriction")
public class CalculatorParserImpl implements CalculatorParser {

    public Calculator parseXML(String string) throws JAXBException {

        StringReader reader = new StringReader(string);
        JAXBContext jaxbContext = JAXBContext.newInstance(Calculator.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Calculator calculator = (Calculator) jaxbUnmarshaller.unmarshal(reader);

        return calculator;
    }

}
