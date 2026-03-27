package edu.immune.sw.pattern.decorator.map;

public class PinnedLocationMap extends MapDecorator {

	public PinnedLocationMap(Map map) {
		super(map);
	}
	
	@Override
	public void draw() {
		super.draw();
		mapUI.pinLocations(map.getLocationCoordinates());
	}
	
	@Override
	public void addLocation(MapCoordinates coordinates) {
		super.addLocation(coordinates);
		mapUI.pinLocations(map.getLocationCoordinates());
	}

}