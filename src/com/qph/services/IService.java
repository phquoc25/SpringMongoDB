package com.qph.services;

public interface IService<T> {
	public void save(T object);
	public void update(T object);
	public void delete(T object);
	public T get(String id);
}
