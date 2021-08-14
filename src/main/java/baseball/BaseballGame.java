package baseball;

public class BaseballGame{

    private final BaseballGameService baseballGameService;
    private final BaseballGameInputView inputView;
    private final Computer computer;
    public static final int NUMBER_SIZE=3;

    BaseballGame() {
        this.baseballGameService = BaseballGameService.getInstance();
        this.inputView = BaseballGameInputView.getInstance();
        this.computer = Computer.getInstance();
    }

    public void start() {
         boolean isContinue=true;
         while(isContinue) {
             inGame();
             isContinue = inputView.isContinue();
         }
    }

    private void inGame(){
        boolean isThreeStrike = false;
        final int computerNumber = computer.createRandomNumber();
        while(!isThreeStrike){
            final int inputNumber = inputView.inputNumber();
            isThreeStrike = baseballGameService.compare(inputNumber, computerNumber);
        }
    }

}
