package com.xuechengkun.truckleadradar

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
        }

        val title = TextView(this).apply {
            text = "🚛 重卡客户雷达"
            textSize = 28f
        }

        val subtitle = TextView(this).apply {
            text = "新能源重卡 AI 获客助手 V1.0"
            textSize = 18f
        }

        val buttons = listOf(
            "🔍 开始找客户",
            "🤖 AI筛选客户",
            "⭐ 高意向客户",
            "💬 AI生成私信",
            "📒 同步Notion",
            "⚙️ 抖音接口设置"
        )

        layout.addView(title)
        layout.addView(subtitle)

        buttons.forEach { name ->
            val button = Button(this).apply {
                text = name
            }
            layout.addView(button)
        }

        setContentView(layout)
    }
}
