package flixel.visual.states;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import flixel.visual.kit.FlxColor;
import flixel.visual.kit.FlxContainer;
import flixel.visual.kit.FlxItem;
import flixel.visual.kit.FlxSize;
import flixel.visual.kit.FlxSprite;

public class ChatMenuState {
      
     
      
      public ChatMenuState(Context context, FlxContainer container, View sender, boolean identify){
            var chatBtn = sender;
            container.remove(chatBtn);
            
            var chatContainer = new FlxContainer(context);
            
            if(MainMenuState.chatOpen == false){
            
            chatContainer.makeGraphic(1400, FlxSize.MATCH_PARENT,FlxColor.parseColor("#80000000"));
            chatContainer.location(0, 0);
            container.add(chatContainer);
            MainMenuState.chatOpen = true;
            }else {
                  container.remove(chatContainer);
            }
            
            
      }
}
