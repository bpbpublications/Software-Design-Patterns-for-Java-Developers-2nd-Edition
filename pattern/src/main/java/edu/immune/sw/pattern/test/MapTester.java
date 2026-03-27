package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.decorator.map.*;

import java.util.ArrayList;
import java.util.List;

public class MapTester {
	
	public static void main(String[] args) {
		
		List<MapCoordinates> coordinates = new ArrayList<>(); 
		coordinates.add(new MapCoordinates(234, 123));
		coordinates.add(new MapCoordinates(215, 134));
		
		MapCoordinates coord3 = new MapCoordinates(134, 324);
		
		Map stMap = new StreetMap(coordinates);
		stMap.draw();
		stMap.addLocation(coord3);
		
		Map plMap = new PinnedLocationMap(stMap);
		plMap.draw();
		plMap.addLocation(coord3);
		
		Map trvlrMap1 = new TravellerMap(stMap);
		Map trvlrMap2 = new TravellerMap(plMap);
		
		trvlrMap1.draw();
		trvlrMap1.addLocation(coord3);
		
		trvlrMap2.draw();
		trvlrMap2.addLocation(coord3);
	}

}
