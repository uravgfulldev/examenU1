package mx.edu.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC: EditText= findViewById(R.id.etC)
        val etF: EditText= findViewById(R.id.etF)
        val btnC: Button= findViewById(R.id.btnGC)
        val btnF: Button =findViewById(R.id.btnGF)


        btnF.setOnClickListener {
            var centigrados=etC.text.toString().toDouble()
            var farenheight=centigrados*1.8+32
            etF.setText(farenheight.toString())
        }
        btnC.setOnClickListener {
            var farenheight=etF.text.toString().toDouble()
            var centigrados=(farenheight-32)/1.8
            etC.setText(centigrados.toString())
        }
    }
}