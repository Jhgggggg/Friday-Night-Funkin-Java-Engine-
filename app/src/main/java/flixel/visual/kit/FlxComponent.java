package flixel.visual.kit;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class FlxComponent extends AppCompatActivity {
      public void UiColor(int color){
            getWindow().setStatusBarColor(color);
            getWindow().setNavigationBarColor(color);
      }
      
      
      @Override
      public void onWindowFocusChanged(boolean arg0) {
            super.onWindowFocusChanged(arg0);
            // TODO: Implement this method
            
            if(!arg0){
                  var ui = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
                  
                  getWindow().getDecorView().setSystemUiVisibility(ui);
            }
      }
      
}
