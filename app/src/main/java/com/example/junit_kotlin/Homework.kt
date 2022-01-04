package com.example.junit_kotlin

object Homework {
    fun checkBraces(str:String):Boolean{
        return str.count{it=='('}==str.count{it==')'}
    }

    fun fib(n:Int):Long{
        if(n==0 ||n==1){
            return n.toLong()
        }
        var a=0L
        var b=1L
        var c=1L
        (1..n-2).forEach{i->
            c=a+b
            a=b
            b=c
        }
        return c
    }
}