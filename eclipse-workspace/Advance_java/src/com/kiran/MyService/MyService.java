package com.kiran.MyService;
import com.kiran.wow.*;

public class MyService {
	public static String m1()
	{
		String s=DAO.m1();
		s=s.substring(3);
		return s;
	}

}
