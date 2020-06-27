package app.nickname.myoji.bughouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save) //Activityとlayoutの対応づけがおかしい

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        saveButton.setOnClickListener {
            val text = input.text
            editor.putString("SAVE", text.toString()) //toString()忘れ
            editor.apply() //apply()忘れ

        } //setOnClickListenerはonCreateの中
    }



}
