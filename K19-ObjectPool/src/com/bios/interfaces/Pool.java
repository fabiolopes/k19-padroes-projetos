package com.bios.interfaces;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
