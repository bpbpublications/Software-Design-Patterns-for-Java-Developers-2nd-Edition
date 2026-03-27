package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.adapter.DataAnalysisAdapter;
import edu.immune.sw.pattern.adapter.StorageType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestAdapter {
	public static void main(String[] args) {
		DataAnalysisAdapter adapter = new DataAnalysisAdapter();
		Map<String, String> data = new HashMap<>();
		data.put("1", "Being Awesome!");
		Set<String> searchKeys = data.keySet();
		
		try {
			adapter.store(StorageType.FILE, data);
			System.out.println();
			adapter.store(StorageType.ELASTIC, data);
			System.out.println();
			adapter.fetch(StorageType.FILE, searchKeys);
			System.out.println();
			adapter.fetch(StorageType.ELASTIC, searchKeys);
		} catch(Exception e) {
			// handle exception
		}
	}
}
