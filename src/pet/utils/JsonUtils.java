package pet.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonUtils {
	private static Gson gson = null;

	private JsonUtils() {
	}

	static {
		gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
	}

	// Java->JSON 
	public static String objectToJson(Object obj) {
		String str = gson.toJson(obj, obj.getClass());
		return str;
	}

	// JSON -  Java 
	public static Object jsonToObject(String str, Class cls) {
		Object obj = gson.fromJson(str, cls);
		return obj;
	}

	public static void saveToFile(String filePath, Object obj) {
		try {
			OutputStream os = new FileOutputStream(filePath);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(objectToJson(obj));
			osw.flush();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object loadFromFile(String filePath, Class cls) {
		try {
			File fr = new File(filePath);
			FileInputStream in = new FileInputStream(fr);
			int ch;
			String str = "";
			int size = in.available();
			byte[] buffer = new byte[size];
			in.read(buffer);
			str = new String(buffer, "UTF-8");
			Object obj = jsonToObject(str, cls);
			in.close();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
