package com.example.recyclerviewbuttonandtext.data

class Datasource {
    class Dice(val sides: Int) {
        fun roll(): Int {
            return (1..sides).random()
        }
    }
    fun rolldice1(): Int {
        val nsides = Dice(6)
        val rdice = nsides.roll()
        return rdice
    }
    fun rolldice2(): Int {
        val nsides = Dice(6)
        val rdice2 = nsides.roll()
        return rdice2
    }
    fun main(): MutableList<String>  {


        var list1: MutableList<String> = mutableListOf()
        for (i in 0..9){
            val x: String = rolldice1().toString()
            val y: String = rolldice2().toString()
            list1.add(0,"$x,$y")
        }
        return list1
       /* rolldice1()
        rolldice2()
        var value : String = rolldice1().toString()
        value += ","
        value += rolldice2().toString()
        return value
        */

    }


}