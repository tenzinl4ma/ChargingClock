package com.example

import android.content.Intent
import android.service.dreams.DreamService

class ChargingDreamService : DreamService() {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        // Set up the dream
        isInteractive = true
        isFullscreen = true

        // Launch the activity
        val intent = Intent(this, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        startActivity(intent)
        finish()
    }
}
