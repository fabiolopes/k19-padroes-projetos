package com.bios.factory;

import java.util.HashMap;
import java.util.Map;

import com.bios.impl.TemaAsterisco;
import com.bios.impl.TemaHifen;
import com.bios.impl.TemaK19;
import com.bios.interfaces.TemaFlyweight;

public class TemaFlyweightFactory {
	private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = 
			new HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();

	public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
	public static final Class<TemaHifen> HIFEN = TemaHifen.class;
	public static final Class<TemaK19> K19 = TemaK19.class;
	
	public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz){
		if(!temas.containsKey(clazz)){
			try {
				temas.put(clazz, clazz.newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return temas.get(clazz);
	}
}
