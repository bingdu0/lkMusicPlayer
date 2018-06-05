package com.liukai.lkmusicplayer.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by LiuKai on 2018/6/5.
 */

public class MusicService extends Service {

    private final IBinder mBinder = new ServiceStub(this);

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }


}
