package challenge_07_programming;

public class Radio extends Controller{

    @Override
    String getName() {
        return "라디오";
    }

    Radio(boolean power) {
        super(power);
    }
}
