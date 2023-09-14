package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var clickMeButton: Button
    lateinit var nameEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        clickMeButton = findViewById(R.id.clickMeButton)

        nameEditText = findViewById(R.id.nameEditText)
        
        // Respond to button click event per specifications
        var nameText = ""

        clickMeButton.setOnClickListener {

            nameText = nameEditText.text.toString()
            var helloName :String = "Hello, $nameText"
            displayTextView.text = helloName


        }

    }
}




//Add an event listener to the button that is triggered when it is clicked that does the following
//Get the entered text from the EditText
//Create the string "Hello, <name>", where <name> is the value retrieved from the EditText in the previous step
//Display the created string using the TextView