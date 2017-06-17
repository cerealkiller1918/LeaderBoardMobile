package com.justinfrasier.leaderboardmobile.Images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;

import java.net.URL;

/**
 * Created by Justin on 06/17/17.
 */

public class Images {

    public Bitmap loadTeamImage(String team){
        try {
            URL url = new URL("https://justinfrasier.com/teamPic/" + team + ".png");
            Bitmap bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            return bitmap;
        }catch (Exception e){return null;}
    }
}
