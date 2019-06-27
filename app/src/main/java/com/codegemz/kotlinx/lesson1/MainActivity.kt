package com.codegemz.kotlinx.lesson1

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainView().setContentView(this)
    }
}

class MainView : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            gravity = Gravity.CENTER

            textView {
                text = "Hello World!" // change to your text!
                textSize = 18f
                textColor = Color.GRAY
            }.lparams(width = wrapContent, height = wrapContent)
        }
    }
}
