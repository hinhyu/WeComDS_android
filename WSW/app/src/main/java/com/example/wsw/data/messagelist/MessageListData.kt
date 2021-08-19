package com.example.wsw.data.messagelist

import com.google.gson.annotations.SerializedName

data class MessageListData(
        val user_id: Int,
        var mes_sendID : String,
        var mes_receiveID : String,
        @SerializedName("mes_content")
        var content: String
)
