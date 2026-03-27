package edu.immune.sw.pattern.singleton.enums;

import edu.immune.sw.pattern.singleton.impl.BaseLogger;

/**
 * Enum values to specify the level of the logged information.<br>
 * Used together with {@link BaseLogger} class<br> 
 * 
 * @author Lalit Mehra
 * @since May 06, 2020
 *
 */
public enum LogLevel {

	DEBUG(10, "DEBUG"),
	INFO(6, "INFO"),
	WARNING(3, "WARNING"),
	ERROR(1, "ERROR");
	
	private int level;
	private String name;
	
	LogLevel(int level, String name) {
		this.level = level;
		this.name = name;
	}
	
	/**
	 * @return numeric value associated with the log level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * @return name of the log level
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return acronym of the log level
	 */
	public String getLogAcronym() {
		return (name + ": ").intern();
	}
	
}
