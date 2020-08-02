package cn.renyuzhuo.androidx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import cn.renyuzhuo.androidx.ui.AndroidXTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidXTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", color = Color.Red)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidXTheme {
        Greeting("Android")
    }
}