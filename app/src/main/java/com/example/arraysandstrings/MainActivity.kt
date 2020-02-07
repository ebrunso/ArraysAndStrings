package com.example.arraysandstrings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //1. Sort the array with multiple same values in the array in an ascending order.
    //Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
    //Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
    //2. Say you have a string of characters. Write an algorithm to collect and return a list of all
    // substrings such that order is maintained but characters may be skipped.
    // So “frog” can produce fog, fg, rg, etc.
    //3. Given a 2d String array, write a method that will return a list with all the positions of
    // dulpicate entries.   For example:
    //
    //a,b,c
    //d,e,f
    //g,a,b
    //
    //will return {0,0 | 0,1 | 2,1 | , 2,2 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //*****************************************************************************************************
        //1. Sort the array with multiple same values in the array in an ascending order.
        //*****************************************************************************************************
        
        val intNumArray : IntArray = intArrayOf(7,1,9,3,7,3,2,7,6,2,6,9,8)

        println("Array before sort: " + intNumArray.joinToString())

        intNumArray.sort()

        println("Array after sort: " + intNumArray.joinToString())

        //*****************************************************************************************************
        //2. Say you have a string of characters. Write an algorithm to collect and return a list of all
        // substrings such that order is maintained but characters may be skipped.
        // So “frog” can produce fog, fg, rg, etc.
        //*****************************************************************************************************

        val strString = "frog"
        var strSubString = ""
        var intStringLength = strString.length
        var j = 0

        for (i in 1..intStringLength){
            for (j in i..intStringLength) {
                println(strString.substring(i,j))
            }
        }

        //*****************************************************************************************************
        //3. Given a 2d String array, write a method that will return a list with all the positions of
        // duplicate entries.
        //a,b,c
        //d,e,f
        //g,a,b
        //
        //will return {0,0 | 0,1 | 2,1 | , 2,2 }
        //***************************************************************************************************

        var alphaArray: Array<Array<String>> = arrayOf(
                arrayOf("a", "a", "c"),
                arrayOf("d", "e", "f"),
                arrayOf("g", "a", "b"))
        var x = 0
        var y = 0
        var oldX = x
        var oldY = y
        var strToCompare = alphaArray[x][y]
        var count = 1


        for(strings in alphaArray){
            if (count == 9) {
                strToCompare = alphaArray[x][y]
                oldX = x
                oldY = y
                count = 0
            }
            count++
            //print("x is " + x)

            for (string in strings){
                //println(" y is " + y)
                alphaArray[x][y]
                //println(alphaArray[x][y])
                //println(strToCompare + " " + alphaArray[x][y])
                if (!(oldX == x && 0 == y ) && (strToCompare == alphaArray[x][y])){
                    println("| $oldX, $oldY | $x, $y | ")
                }
                y++
            }
            x++
            y = 0
        }
    }
}
