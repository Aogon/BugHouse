package app.nickname.myoji.bughouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class CountActivity : AppCompatActivity() {
    var number: Int = 0 //変数だからvar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        button.setOnClickListener {
            number += 1 //全角スペース→半角スペース
            textView.text = number.toString() //toString()忘れ
        }

    }
} //カッコの不足


