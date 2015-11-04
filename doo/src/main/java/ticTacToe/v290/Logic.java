package ticTacToe.v290;

public class Logic {

	private Game game;

	private ColocateControllerBuilder colocateControllerBuilder;
	
	private StartController startController;

	private ContinueController continueController;

	public Logic() {
		game = new Game();
		colocateControllerBuilder = new ColocateControllerBuilder(game);
		startController = new StartController(game, colocateControllerBuilder);
		continueController = new ContinueController(game);
	}

	public OperationController getController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			return colocateControllerBuilder.getColocateController();
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}
}
