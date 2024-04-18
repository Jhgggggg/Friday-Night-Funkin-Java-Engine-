
package com.wolf.fridaynightfunkinchat;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.wolf.fridaynightfunkinchat.databinding.ActivityMainBinding;
import flixel.visual.kit.FlxColor;
import flixel.visual.kit.FlxComponent;
import flixel.visual.kit.FlxContainer;
import flixel.visual.kit.FlxSize;
import flixel.visual.states.MainMenuState;

public class MainActivity extends FlxComponent {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // set content view to binding's root
        setContentView(binding.getRoot());
            
        var container = binding.getRoot();
            
        UiColor(FlxColor.BLACK);
       
            
        FlxContainer black = new FlxContainer(this);
        black.makeGraphic(FlxSize.MATCH_PARENT, FlxSize.MATCH_PARENT, FlxColor.BLACK);
        black.location(0, 0);
        container.add(black);
            
        new MainMenuState(this, container);
                  
        
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
