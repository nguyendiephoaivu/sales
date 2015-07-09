package com.sales.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

class DateSerializer implements JsonSerializer<Date> {
	public JsonElement serialize(Date src, Type typeOfSrc,
			JsonSerializationContext context) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return new JsonPrimitive(formatter.format(src));
	}
}