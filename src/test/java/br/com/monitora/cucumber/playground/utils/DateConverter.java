package br.com.monitora.cucumber.playground.utils;


import cucumber.api.Transformer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter extends Transformer<Date> {

    @Override
    public Date transform(String s) {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date result = format.parse(s);
            return result;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
