package edu.immune.sw.pattern.decorator.map;

import java.util.List;

public interface Map {
	
	public List<MapCoordinates> getLocationCoordinates();
	
	public void draw();
	
	public void addLocation(MapCoordinates coordinates);
	
}
