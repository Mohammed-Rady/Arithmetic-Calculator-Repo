package com.hp.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("restriction")
public class Calculator {

    String type;
    List<String> operand;
    List<String> operator;

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    public List<String> getOperand() {
        return operand;
    }

    @XmlElement
    public void setOperand(List<String> operand) {
        this.operand = operand;
    }

    public List<String> getOperator() {
        return operator;
    }

    @XmlElement
    public void setOperator(List<String> operator) {
        this.operator = operator;
    }

}
