package com.example.androidscala213

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import scala.reflect._

object MainActivity {
  val ownTag: ClassTag[MainActivity] = classTag[MainActivity]
}

class MainActivity extends AppCompatActivity {

  val helloWorld = List("H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d", "!")

  lazy val textView = findViewById(R.id.textView).asInstanceOf[TextView]

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    helloWorld match {
      case s: List[String] =>
        textView.setText(s"${s.mkString("")} from \n ${MainActivity.ownTag}")
    }
  }
}
