package com.ananduapps.lawmate

import android.graphics.Bitmap
import com.ananduapps.lawmate.data.Chat

/**
 * @author Ahmed Guedmioui
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)