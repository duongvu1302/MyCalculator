package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tao phương thức gọi hàm
        btn_add.setOnClickListener() {
            add()
        }

        btn_sub.setOnClickListener() {
            sub()
        }

        btn_mul.setOnClickListener() {
            mul()
        }

        btn_div.setOnClickListener() {
            div()
        }
    }
    //Hàm cộng
    fun add() {
        if (inputIsNotEmpty()) {
            val input1 = edt1.text.toString().toBigDecimal()
            val input2 = edt2.text.toString().toBigDecimal()
            tv_result.text = input1.add(input2).toString()
        }
    }
    //Hàm trừ
    fun sub() {
        if (inputIsNotEmpty()) {
            val input1 = edt1.text.toString().toBigDecimal()
            val input2 = edt2.text.toString().toBigDecimal()
            tv_result.text = input1.subtract(input2).toString()
        }
    }
    //Hàm nhân
    fun mul() {
        if (inputIsNotEmpty()) {
            val input1 = edt1.text.toString().toBigDecimal()
            val input2 = edt2.text.toString().toBigDecimal()
            tv_result.text = input1.multiply(input2).toString()
        }
    }
    //Hàm chia
    fun div() {
        if (inputIsNotEmpty()) {
            val input1 = edt1.text.toString().toBigDecimal()
            val input2 = edt2.text.toString().toBigDecimal()
            tv_result.text = input1.divide(input2).toString()
        }
    }
    //Kiểm tra đầu vào rỗng hay không
    fun inputIsNotEmpty() :Boolean {
        var ck = true
        if (edt1.text.toString().isEmpty()) {
            edt1.error = "Required"
            ck = false
        }
        if (edt2.text.toString().isEmpty()) {
            edt2.error = "Required"
            ck = false
        }
        return ck
    }
}