package com.softwaresobmedida.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TimestampAdapter extends XmlAdapter<String, java.sql.Timestamp> {
	private SimpleDateFormat dateFormatMaior = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    @Override
    public String marshal(java.sql.Timestamp v) throws Exception {
    	try {
            return dateFormatMaior.format(v);			
		} catch (Exception e) {
			return null;
		}
    }

    @Override
    public java.sql.Timestamp unmarshal(String v) throws Exception {
    	try {
    		Date data = null;
    		data = dateFormatMaior.parse(v);
    		//
    		return new java.sql.Timestamp(data.getTime());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}