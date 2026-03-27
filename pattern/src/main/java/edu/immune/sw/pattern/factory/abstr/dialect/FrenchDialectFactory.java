package edu.immune.sw.pattern.factory.abstr.dialect;

import edu.immune.sw.pattern.factory.abstr.Converter;
import edu.immune.sw.pattern.factory.abstr.Formatter;
import edu.immune.sw.pattern.factory.abstr.Reader;
import edu.immune.sw.pattern.factory.abstr.ResponseDialectFactory;
import edu.immune.sw.pattern.factory.abstr.impl.DefaultReader;
import edu.immune.sw.pattern.factory.abstr.impl.GermanDialectConverter;
import edu.immune.sw.pattern.factory.abstr.impl.XMLFormatter;

public class FrenchDialectFactory implements ResponseDialectFactory {

	@Override
	public Formatter getFormatter() {
		return new XMLFormatter();
	}

	@Override
	public Converter getConverter() {
		return new GermanDialectConverter();
	}

	@Override
	public Reader getReader() {
		return new DefaultReader();
	}

}
