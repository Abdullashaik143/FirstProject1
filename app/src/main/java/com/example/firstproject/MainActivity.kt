package com.example.firstproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

        private var mDelayHandler: Handler? = null
        private val SPLASH_DELAY: Long = 5000 //5 seconds

        internal val mRunnable: Runnable = Runnable {
            if (!isFinishing) {

                val intent = Intent()
                startActivity(intent)
                finish()
            }
        }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
            setContentView(R.layout.activity_main)
        }
}