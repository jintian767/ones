package com.wsx.ones.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectByteUtil {

	public static byte[] object2Bytes(Object obj) throws IOException {
		ByteArrayOutputStream boo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(boo);
		
		oo.writeObject(obj);
		byte[] bytes = boo.toByteArray();
		
		oo.close();
		boo.close();
		return bytes;
	}
	
	public static Object bytes2Object(byte[] bytes) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
		ois.close();
		bis.close();
		return obj;
	}
}
