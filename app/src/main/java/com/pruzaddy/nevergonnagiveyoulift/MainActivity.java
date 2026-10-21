package com.pruzaddy.nevergonnagiveyoulift;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.MediaController;
import android.net.Uri;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b) { super.onCreate(b); LinearLayout layout = new LinearLayout(this); layout.setOrientation(LinearLayout.VERTICAL); layout.setGravity(Gravity.CENTER); TextView title = new TextView(this); title.setText("Never Gonna Give You Lift"); title.setTextSize(24); title.setGravity(Gravity.CENTER); layout.addView(title); VideoView video = new VideoView(this); layout.addView(video, new LinearLayout.LayoutParams(-1, 600)); setContentView(layout); int id=getResources().getIdentifier("rickroll","raw",getPackageName()); if(id!=0){video.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+id)); video.setMediaController(new MediaController(this)); video.setOnPreparedListener(mp -> {mp.setLooping(true);video.start();});} else {title.setText("Add app/src/main/res/raw/rickroll.mp4 to activate the payload");} }
}