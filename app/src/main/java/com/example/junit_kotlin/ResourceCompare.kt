package com.example.junit_kotlin

import android.content.Context

class ResourceCompare {
    fun isEqual(context: Context, resId:Int, string:String):Boolean{
        return context.getString(resId)==string
    }
}