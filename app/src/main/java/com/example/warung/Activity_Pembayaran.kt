@file:Suppress("ClassName")

package com.example.warung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Button

class Activity_Pembayaran: AppCompatActivity() {
    private lateinit var kurang1 : Button
    private lateinit var kurang2 : Button
    private lateinit var plus1 : Button
    private lateinit var plus2 : Button
    private lateinit var jum1 : TextView
    private lateinit var jum2 : TextView
    private lateinit var totalBayar : TextView
    private lateinit var jumlahtotal : TextView
    private var jumlah1 : Int = 0
    private var jumlah2 : Int = 0
    private var jumTotal: Int = 0
    private var totalBayar1 : Int = 0
    private var totalBayar2 : Int = 0
    private var totBay : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pembayaran)
        kurang1 = findViewById(R.id.button1)
        kurang2 = findViewById(R.id.button34)
        plus1 = findViewById(R.id.button2)
        plus2 = findViewById(R.id.button4)
        jum1 = findViewById(R.id.hasil1)
        jum2 = findViewById(R.id.hasil2)
        jumlahtotal = findViewById(R.id.jum1)
        totalBayar = findViewById(R.id.jum2)
    }

    fun setKembali(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun setMin1(view: View){
        jumlah1 = jum1.text.toString().toInt()
        if(jumlah1==1){
            Toast.makeText(this, "minimum pesanan 1", Toast.LENGTH_LONG).show()
        } else {
            jumlah1 = jumlah1-1
            jum1.setText(jumlah1.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setplus1(view: View){
        jumlah1 = jum1.text.toString().toInt()
        if(jumlah1==10){
            Toast.makeText(this, "minimum pesanan 5", Toast.LENGTH_LONG).show()
        }
        else{
            jumlah1 = jumlah1+1
            jum1.setText(jumlah1.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setMin2(view: View){
        jumlah2 = jum2.text.toString().toInt()
        if(jumlah2==0){
            Toast.makeText(this, "minimum pesanan 1", Toast.LENGTH_LONG).show()
        } else {
            jumlah2 = jumlah2-1
            jum2.setText(jumlah2.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }
    fun setplus2(view: View){
        jumlah2 = jum2.text.toString().toInt()
        if(jumlah2==10){
            Toast.makeText(this, "minimum pesanan 5", Toast.LENGTH_LONG).show()
        }
        else{
            jumlah2 = jumlah2+1
            jum2.setText(jumlah2.toString())
            this.setJumTotalBeli()
            this.setJumTotalBayar()
        }
    }

    private fun setJumTotalBeli(){
        jumlah2 = jum2.text.toString().toInt()
        jumlah1 = jum1.text.toString().toInt()
        jumTotal = jumlah1+jumlah2
        jumlahtotal.setText(jumTotal.toString())
    }
    private fun setJumTotalBayar(){
        jumlah2 = jum2.text.toString().toInt()
        jumlah1 = jum1.text.toString().toInt()
        totalBayar2 = jumlah2*22000
        totalBayar1 = jumlah1*20000
        totBay = totalBayar1+totalBayar2
        totalBayar.setText(totBay.toString())

    }
}
