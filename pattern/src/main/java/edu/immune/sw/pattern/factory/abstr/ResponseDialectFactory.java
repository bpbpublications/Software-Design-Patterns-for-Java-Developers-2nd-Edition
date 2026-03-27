package edu.immune.sw.pattern.factory.abstr;

public interface ResponseDialectFactory {
	
	public Formatter getFormatter();
	
	public Converter getConverter();
	
	public Reader getReader();

}
