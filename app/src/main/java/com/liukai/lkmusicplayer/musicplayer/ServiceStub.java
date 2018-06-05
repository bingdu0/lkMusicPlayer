package com.liukai.lkmusicplayer.musicplayer;

import android.os.RemoteException;

import com.liukai.lkmusicplayer.MusicAidlInterface;

import java.lang.ref.WeakReference;

/**
 * Created by LiuKai on 2018/6/5.
 */

public class ServiceStub extends MusicAidlInterface.Stub {

    private final WeakReference<MusicService> mService;

    public ServiceStub(MusicService service) {
        mService = new WeakReference<MusicService>(service);
    }


    @Override
    public void play() throws RemoteException {

    }

    @Override
    public void stop() throws RemoteException {

    }

    @Override
    public void start() throws RemoteException {

    }

    @Override
    public void pause() throws RemoteException {

    }

    @Override
    public void prev() throws RemoteException {

    }

    @Override
    public void next() throws RemoteException {

    }

    @Override
    public void timing(long time) throws RemoteException {

    }
}
