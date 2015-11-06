package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Game;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(OperationControllerVisitor operationControllerVisitor);
	

}
