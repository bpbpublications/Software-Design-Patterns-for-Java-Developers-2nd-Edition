package edu.immune.sw.pattern.decorator.map;

import java.util.List;

public class StreetMap implements Map {

	protected MapUI mapUI = MapUI.getInstance();
	protected List<MapCoordinates> coordinates;
	
	public StreetMap(List<MapCoordinates> coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
	public void draw() {
		mapUI.drawShortestPath( coordinates);
	}
	
	@Override
	public void addLocation(MapCoordinates coordinates) {
		this.coordinates.add(coordinates);
		mapUI.addLocation(coordinates);
	}
	
	@Override
	public List<MapCoordinates> getLocationCoordinates() {
		return coordinates;
	}

}
