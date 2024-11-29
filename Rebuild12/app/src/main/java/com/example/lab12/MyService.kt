package com.example.Rebuild12

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {
    override fun onCreate() {
        super.onCreate()
        Thread {
            Thread.sleep(3000)
            startActivity(Intent(this, SecActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int) =
        START_NOT_STICKY

    override fun onBind(intent: Intent): IBinder? = null
}