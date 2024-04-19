package flixel.visual.kit.objects;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import flixel.visual.kit.FlxContainer;
import flixel.visual.kit.FlxSize;
import flixel.visual.kit.FlxSprite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Note extends FlxSprite {
  public boolean spawned = false;
  public boolean wasHit = false;
  public boolean wasHitByOpponent = false;
  public boolean wasDestroyed = false;
  public int wasData = 0;
  public float rotation = 0;
  public int distance = 2000;
      
  private Note(Context context){
        super(context);
  }
      
  private Note(Context context, AttributeSet setters){
        super(context, setters);
  }
      
  public int SWAPCOLOR = Color.BLACK;
      
  public ArrayList<String> noteList = new ArrayList<>(Arrays.asList("left", "down", "up", "right"));

  public final Map<String, Supplier<Integer>> mapKeys =
      new HashMap<>(4) {
        {
          put("NOTE_LEFT", () -> KeyEvent.KEYCODE_D);
          put("NOTE_DOWN", () -> KeyEvent.KEYCODE_F);
          put("NOTE_UP", () -> KeyEvent.KEYCODE_J);
          put("NOTE_RIGHT", () -> KeyEvent.KEYCODE_K);
        }
      };
      
      
      
  

  public void CREATE(boolean spawned,boolean wasHit,boolean wasHitByOpponent,boolean wasDestroyed,int wasData,float rotation,int distance) {
    this.spawned = spawned;
    this.wasHit = wasHit;
    this.wasHitByOpponent = wasHitByOpponent;
    this.wasDestroyed = wasDestroyed;
    this.wasData = wasData;
    this.rotation = rotation;
    this.distance = distance;
            
    var item = this;
            
    spawn(item);
  }
      
  private void spawn(Note note){
            
  var parent = (FlxContainer) getParent();
        
     try {
       parent.add(note);
     }catch(Exception e){
           throw new RuntimeException("Null Object Reference");
     }     
            
  }
      
  public void destroy(){
        var parent = (ViewGroup) getParent();
        parent.removeView(this);
        this.wasDestroyed = true;
  }

  
}
