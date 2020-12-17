package com.example.que_frontend.Converter

class HexToDec() {


    fun convert(id:String): String {
        val hexaDecimalN:String
        hexaDecimalN = id

        var i = hexaDecimalN.length - 1
        var decimalN: Long = 0
        var base = 1
        while(i >= 0) {
            val charAtPos = hexaDecimalN[i]

            val lastDigit = if((charAtPos >= '0') && (charAtPos <= '9')) {
                charAtPos - '0'
            } else if((charAtPos >= 'A') && (charAtPos <= 'F')) {
                charAtPos.toInt() - 55
            } else if((charAtPos >= 'a') && (charAtPos <= 'f')) {
                charAtPos.toInt() - 87
            } else {
                0
            }

            decimalN += lastDigit * base
            base *= 16

            i--
        }

        return hexaDecimalN


    }
}