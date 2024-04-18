package flixel.visual.kit;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FlxContainer extends ConstraintLayout {
      
      public int count = this.getChildCount();
      
      public FlxContainer(Context context){
            super(context);
      }
      
      public FlxContainer(Context context, AttributeSet seters){
            super(context, seters);
      }
      
      
      
      public void makeGraphic(int width, int height, int color){
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(width, height);
            
            this.setLayoutParams(params);
            this.setBackgroundColor(color);
            
            
      }
      
      public void location(float x, float y){
            this.setX(x * 2);
            this.setY(y * 2);
      }
      
      public void add(View item){
            this.count = this.getChildCount();
            this.addView(item);
      }
      
      public void onClickRelease(View.OnClickListener click){
            this.setOnClickListener(click);
      }
      
      public void remove(View item){
            this.removeView(item);
      }
}
