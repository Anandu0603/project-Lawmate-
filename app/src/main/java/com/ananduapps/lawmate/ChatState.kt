package com.ananduapps.lawmate

import android.graphics.Bitmap
import com.ananduapps.lawmate.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)