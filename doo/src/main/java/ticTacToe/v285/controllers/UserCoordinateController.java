package ticTacToe.v285.controllers;

import ticTacToe.v285.models.Coordinate;
import ticTacToe.v285.models.Game;


public class UserCoordinateController extends CoordinateController {

	protected UserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		Coordinate origin = new Coordinate();
		origin.read("De");
		return origin;
	}

	@Override
	public Coordinate getTarget(String targetTitle) {
		Coordinate target = new Coordinate();
		target.read(targetTitle);
		return target;
	}
	
}
