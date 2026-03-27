package edu.immune.sw.pattern.decorator.map;

import java.util.List;

public class MapDecorator implements Map {
	
	protected Map map;
	protected MapUI mapUI = MapUI.getInstance();
	
	public MapDecorator(Map map) {
		this.map = map;
	}

	@Override
	public void draw() {
		System.out.println("111");
		map.draw();
	}

	@Override
	public void addLocation(MapCoordinates coordinates) {
		map.addLocation(coordinates);
	}
	
	@Override
	public List<MapCoordinates> getLocationCoordinates() {
		return map.getLocationCoordinates();
	}
	
}
