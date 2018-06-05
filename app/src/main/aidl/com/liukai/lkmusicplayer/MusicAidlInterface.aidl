// MusicAidl.aidl
package com.liukai.lkmusicplayer;

// Declare any non-default types here with import statements

interface MusicAidlInterface {
    void play();    //播放
    void stop();    //结束

    void start();   //开始
    void pause();   //暂停

    void prev();    //上一曲
    void next();    //下一曲


    void timing(long time);   //定时
}
