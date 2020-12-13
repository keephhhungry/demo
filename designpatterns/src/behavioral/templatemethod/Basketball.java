package behavioral.templatemethod;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/13 22:06
 * @describetion :
 */
public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
