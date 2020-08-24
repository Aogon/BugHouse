package app.nickname.myoji.bughouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val taskList = mutableListOf( //書き込み可能はmutableList, taskListはAdapterに渡すまでの「臨時の」置き場
        Task("Task 1"),
        Task("Task 2"),
        Task("Task 3")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = TaskAdapter(this, object: TaskAdapter.ItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@ListActivity, DetailActivity::class.java)
                intent.putExtra("TODO_NAME", taskList[position].name) //intentのkeyの名前が違う
                startActivity(intent)
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter //RecyclerViewにadapterがついていなかった
        adapter.init(taskList) //initとaddAllを分けた（これでいいのか？）
//        taskList.clear() //addAllしたらtaskListの全要素を消去

        addButton.setOnClickListener {
            val name = editText.text.toString()
            taskList.add(Task(name))
            adapter.addAll(taskList)
//            taskList.clear() //addAllしたらtaskListの全要素を消去
        }
    }

}