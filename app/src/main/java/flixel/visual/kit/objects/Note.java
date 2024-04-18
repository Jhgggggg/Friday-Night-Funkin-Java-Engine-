package flixel.visual.kit.objects;

<<<<<<< HEAD
=======
import flixel.visual.kit.FlxSprite;
>>>>>>> 4c9f5c8 (Updated objects - Note)
import java.util.Timer;
import android.os.Handler;
import java.util.TimerTask;
import java.lang.Runnable;


public class Note extends FlxSprite {

public boolean wasSpawn = false;
public boolean wasHit = false;
public boolean wasMissed = false;
public float alphaValue = 1;
public float speed = 1;
public int noteData = 0;
public boolean destroyed = false;


public Note(boolean wasSpawn,boolean wasHit,boolean wasMissed,int noteData){

this.wasSpawn = wasSpawn;
this.wasHit = wasHit;
this.wasMissed = wasMissed;
this.noteData = noteData;
  
var data = this;

spawn(data);
  
}

<<<<<<< HEAD
private Note spawn(Note note){
=======
private void spawn(Note note){
>>>>>>> 4c9f5c8 (Updated objects - Note)

var data = note.noteData;
var alpha = note.alphaValue;
var spawnedBool = note.wasSpawn;

note.setAlpha(alpha);
note.wasSpawn = spawnedBool == false ? true : false;

<<<<<<< HEAD
switch(data){

  // Opponent strums

  case 0 -> return new Note(true, false, false, 0);
  case 1 -> return new Note(true, false, false, 1);
  case 2 -> return new Note(true, false, false, 2);
  case 3 -> return new Note(true, false, false, 3);


  // player Strums

  case 4 -> return new Note(true, false, false, 4);
  case 5 -> return new Note(true, false, false, 5);
  case 6 -> return new Note(true, false, false, 6);
  case 7 -> return new Note(true, false, false, 7);
}
=======

>>>>>>> 4c9f5c8 (Updated objects - Note)

  var timer = new Timer();
  var handler = new Handler();
  var task = new TimerTask(){


<<<<<<< HEAD
   public void run(){}
    handler.post(new Runnable(){

    public void run(){

    if(note.wasHit == true && note.wasSpawn != false || wasMissed == true){}
      destroy(note);
    }
      
    });
  }
=======
   public void run(){
         
       handler.post(new Runnable(){
             public void run(){
                   if(note.wasHit == true && note.wasSpawn != false || wasMissed == true){
                       destroy(note);
                   }
             }
       });         
                        
                        
   }
    

    
          
    
      
    
  };
>>>>>>> 4c9f5c8 (Updated objects - Note)
  
}

  private void destroy(Note note){

  note.wasSpawn = false;
  note.destroyed = true;
    
  }


}
