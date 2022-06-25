package com.example.androidzaliczenie

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class ActivityVideo : AppCompatActivity() {

    var videoView: VideoView? = null

    var mediaController: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView = findViewById<View>(R.id.videoView) as VideoView?

        if(mediaController == null){
            mediaController = MediaController(this)
            mediaController!!.setAnchorView(this.videoView)
        }

        videoView!!.setMediaController(mediaController)

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName+ "/" + R.raw.abc))

        videoView!!.requestFocus()

        videoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Odtwarzanie zakończone", Toast.LENGTH_LONG).show()
        }

        videoView!!.setOnErrorListener{
            mediaPlayer, i, i2 -> Toast.makeText(applicationContext, "Błąd", Toast.LENGTH_LONG).show()
            false
        }

    }

}