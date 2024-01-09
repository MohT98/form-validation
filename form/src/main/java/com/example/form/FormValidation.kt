package com.example.form

import android.content.Context
import android.widget.EditText
import android.widget.Toast

object FormValidation {


    fun editTextEmptyValidation(context:Context,editText: EditText,msg:String):Boolean{

        if(editText.text.isNullOrBlank()){
            Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
            return false
        }
        return true

    }
    fun editTextLengthValidation(context:Context,editText: EditText,msg:String,requireLength:Int):Boolean{

        if(editText.text.length<requireLength){
            Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
            return false
        }
        return true

    }
}