package com.hatexml.beans;

import com.hatexml.MyInput;
import com.hatexml.MyOutput;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.List;

public class CamelProcessor implements Processor {

    public void process ( Exchange exchange ) throws Exception {
        System.out.println("CamelProcessor process");

        MyOutput myOutput = new MyOutput();

        List list = exchange.getIn().getBody(List.class);
        MyInput myInput = (MyInput) list.get(0);

        myOutput.setOutputStr("response: " + myInput.getInputStr());
        exchange.getOut().setBody(myOutput);
    }
}
