package edu.immune.sw.pattern.adapter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ElasticDataAnalyser implements ModernDataAnalyser {

	private static ElasticDataAnalyser _instance = new ElasticDataAnalyser();
	private ElasticConnector connector;

	private ElasticDataAnalyser() {
		connector = new ElasticConnector();
	}

	public static ElasticDataAnalyser getInstance() {
		return _instance;
	}

	@Override
	public void store(StorageType storage, Map<String, String> data)
			throws IllegalArgumentException, DataStorageException {
		System.out.println("Data stored succesfully in Elastic");
	}

	@Override
	public List<String> fetch(StorageType storage, Set<String> searchKeys)
			throws IllegalArgumentException, DataStorageException {
		List<String> data = connector.fetch(searchKeys);
		System.out.println("Data fetched succesfully from Elastic");
		return data;
	}

}
