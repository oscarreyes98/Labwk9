import android.graphics.Color;
import android.graphics.Paint;

import edu.ucsd.cse110.dogegotchi.doge.Doge;
import edu.ucsd.cse110.dogegotchi.doge.DogeView;

public class ExpressionFactory {
    Doge doge;
    Doge.State state;
    DogeView view;

    public ExpressionFactory(Doge.State state, DogeView view){
        this.state = state;
        this.view = view;


        if(state == Doge.State.EATING){

        }

        else if(state == Doge.State.SAD){

        }

        else if(state == Doge.State.HAPPY){

        }

        else if(state == Doge.State.SLEEPING){
            Paint paint = new Paint();
            canvas.drawPaint(paint);
            paint.setColor(Color.BLACK);
            paint.setTextSize(16);
            canvas.drawText("My Text", x, y, paint);
        }
    }
    public static Expression getExpression(Doge doge){

    }
}
