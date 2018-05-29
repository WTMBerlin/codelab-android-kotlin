package work.beltran.examplehelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Hello Log")
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG)
        myToast.show()
    }

    fun countMe(view: View) {

        // Get the text from the TextView
        val counterString = myTextView.text.toString()

        // Convert the text to a number (Int) and put it in a var
        var counter: Int = counterString.toInt()

        // Increasing the number by one
        counter++

        // Set the number again into the TextView, as a String
        myTextView.text = counter.toString()
    }
}
