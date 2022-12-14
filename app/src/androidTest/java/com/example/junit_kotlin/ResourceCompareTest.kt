package com.example.junit_kotlin

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before


import org.junit.Test

class ResourceCompareTest{
    private lateinit var resourceCompare:ResourceCompare

    @Before
    fun setup(){
        resourceCompare= ResourceCompare()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){

        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=resourceCompare.isEqual(context,R.string.app_name,"MyAndroidTest1")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=resourceCompare.isEqual(context,R.string.app_name,"MyAndroidTest2")
        assertThat(result).isFalse()
    }
}