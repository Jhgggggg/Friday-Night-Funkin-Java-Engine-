package flixel.visual.states;
import android.content.Context;
import flixel.visual.kit.FlxColor;
import flixel.visual.kit.FlxComponent;
import flixel.visual.kit.FlxContainer;
import flixel.visual.kit.FlxItem;
import flixel.visual.kit.FlxSize;
import flixel.visual.kit.FlxSprite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainMenuState {
      
      public static boolean chatOpen = false;
      
      public MainMenuState(Context context, FlxContainer container){
            
            var actor = new FlxContainer(context);
            actor.makeGraphic(FlxSize.MATCH_PARENT, FlxSize.MATCH_PARENT, FlxColor.BLACK);
            actor.location(0, 0);
            container.add(actor);
            
            var actor_user_itens_ftChats = new FlxContainer(context);
            actor_user_itens_ftChats.makeGraphic(290, 130, FlxColor.parseColor("#80000000"));
            actor_user_itens_ftChats.location(150, 40);
            
            var bgs = new ArrayList<String>(Arrays.asList(
                  
                "menuBG","menuBGBlue","menuBGMagenta","menuDesat"        
                        
            ));
            
            var bg = (FlxSprite) new FlxSprite(context);
            bg.makeGraphic(FlxSize.MATCH_PARENT, FlxSize.MATCH_PARENT, FlxColor.BLACK, bgs.get(new Random().nextInt(bgs.size())));
            bg.location(0, 0);
            actor.add(bg);
            actor.add(actor_user_itens_ftChats);
            
            actor_user_itens_ftChats.onClickRelease(( i ) -> {
                  new ChatMenuState(context, container, actor_user_itens_ftChats, chatOpen);
            });
      }
}
