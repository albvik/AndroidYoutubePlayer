package albvik.com.androidyoutubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by albvik on 3/18/2017.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo = (Button) findViewById(R.id.btnPlaySingle);
        Button btnPlayList = (Button) findViewById(R.id.btnPlayList);

        //btnPlayVideo.setOnClickListener(this);
        //btnPlayList.setOnClickListener(this);

      /*  View.OnClickListener ourListener
       =  new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        btnPlayVideo.setOnClickListener(ourListener);
        btnPlayList.setOnClickListener(ourListener);

        btnPlayVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }*/

    }
        @Override
        public void onClick (View view){
            Intent intent = null;

            switch(view.getId()){
                case R.id.btnPlaySingle:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST);
                        break;
                case R.id.btnPlayList:
                    intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST);
                    break;

                default:
            }

            if(intent !=null){
                startActivity(intent);
            }
        }
    }
