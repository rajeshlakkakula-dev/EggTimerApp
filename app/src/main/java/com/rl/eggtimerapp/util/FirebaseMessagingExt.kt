package com.rl.eggtimerapp.util

import android.content.Context
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessaging

private const val BREAK_FAST = "breakfast"

fun FirebaseMessaging.subscribeToTopicBreakfast(context: Context) {

    subscribeToTopic(BREAK_FAST)
        .addOnCompleteListener {

            val userFeedback = if (it.isSuccessful)
                "Subscribe to Topic"
            else
                "Failed to Subscribe to Topic"
            Toast.makeText(context.applicationContext, userFeedback, Toast.LENGTH_SHORT).show()

        }


}