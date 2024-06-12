/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateAdapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Joakamakaka
 */
public class DateAdapter extends TypeAdapter<Date>{

    private final SimpleDateFormat dateFormat;

    public DateAdapter() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(dateFormat.format(date));
    }

    @Override
    public Date read(JsonReader jsonReader) throws IOException {
        String dateStr = jsonReader.nextString();
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new IOException(e);
        }
    }
}
