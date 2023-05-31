package com.sumit.toastmessage

import android.content.Context
import android.widget.Toast

class AndroidToast {
    fun toasterMessage(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}

