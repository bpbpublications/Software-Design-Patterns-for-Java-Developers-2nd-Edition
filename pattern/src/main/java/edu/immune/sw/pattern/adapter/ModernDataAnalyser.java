package edu.immune.sw.pattern.adapter;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Lalit Mehra
 *
 */
public interface ModernDataAnalyser {

	public void store(StorageType storage, Map<String, String> data) throws IllegalArgumentException, DataStorageException;
	
	public List<String> fetch(StorageType storage, Set<String> searchKeys) throws IllegalArgumentException, DataStorageException;
	
}
