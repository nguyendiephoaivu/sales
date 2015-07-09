package com.sales.utils;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;

class DateDeserializer implements JsonDeserializer<Date> {
	public Date deserialize(JsonElement json, Type typeOfSrc,
			JsonDeserializationContext context) {
		SimpleDateFormat formatterShort = new SimpleDateFormat("yyyy-MM-dd");
		Date deserialized = null;
		String dateAsString = json.getAsJsonPrimitive().getAsString();

		if (dateAsString.equalsIgnoreCase("null")) {
			return null;
		}

		if (dateAsString.length() > 10) {
			deserialized = Utils.parseUTC(dateAsString);
		} else {
			try {
				deserialized = formatterShort.parse(dateAsString);
			} catch (ParseException e) {
			}
		}

		return deserialized;
	}
}