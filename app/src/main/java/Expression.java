import edu.ucsd.cse110.dogegotchi.doge.Doge;

public class Expression {
    private Doge.State state;

    public interface Strategy{
        public void doStateEvent(Doge.State state);
    }

    public void doStateEvent(Doge.State state) {

    }

}
