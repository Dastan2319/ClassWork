package kz.step.classwork

import android.app.Application
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var levelApi:TextView?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        levelApi=findViewById(R.id.text_view_main_level_api);

        val pInfo = Build.VERSION.SDK_INT;
        levelApi!!.setText("Android API:"+pInfo.toString());
    }
}