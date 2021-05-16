package ec.edu.ups.contador_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contador = 0;

    fun incrementar (view: View) {
        this.contador += 1
        txtNumeros.text = this.contador.toString()
    }

    fun reset (view: View) {
        this.contador = 0
        txtNumeros.text = this.contador.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var titulo = findViewById<TextView>(R.id.txtTitulo)
        titulo.text = "Kotlin";

        var contador = findViewById<TextView>(R.id.txtNumeros)
        contador.setText("0")
    }
}