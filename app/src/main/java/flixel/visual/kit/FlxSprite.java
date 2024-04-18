package flixel.visual.kit;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.InputStream;

public class FlxSprite extends AppCompatImageView {

      private Context context;

      public FlxSprite(Context context){
            super(context);
            this.context = context;
      }
      
      public FlxSprite(Context context, AttributeSet seters){
            super(context, seters);
            this.context = context;
      }
      
      public void makeGraphic(int width, int height, int color, String src){
            try {
               
               ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(width, height);
               this.setLayoutParams(params);
                  
               this.setBackgroundColor(color);
                  
               InputStream streamImage = context.getAssets().open("images/"+src+".png");
               this.setImageBitmap(BitmapFactory.decodeStream(streamImage));
               
                  
            }catch(Exception e){
                  
            }
      }
      
      public void location(float x, float y){
            this.setX(x);
            this.setY(y);
      }
}
