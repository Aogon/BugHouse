package app.nickname.myoji.bughouse

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class LoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //Activityを作らなければならないのでonCreate
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE) //sharedPreferencesの名前は一緒でないといけない
        textView.text = sharedPreferences.getString("SAVE", "") //keyが大文字と小文字と異なっている
    }
}
