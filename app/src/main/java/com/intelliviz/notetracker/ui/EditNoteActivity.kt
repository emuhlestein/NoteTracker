package com.intelliviz.notetracker.ui

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.intelliviz.notetracker.R
import kotlinx.android.synthetic.main.activity_edit_note.*

class EditNoteActivity : AppCompatActivity() {
    private var mUnchanged: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_note)

        var noteTitle = intent.getStringExtra(EXTRA_TITLE)
        val actionBar = supportActionBar
        actionBar?.subtitle = noteTitle

        val editText: EditText =  edit_text
        editText.setOnClickListener { view ->
            mUnchanged = false
        }

        val cancelButton: Button = cancel_button
        cancelButton.setOnClickListener{ view ->
            if(mUnchanged) {
                finish()
            } else {
                val snackbar =
                    Snackbar.make(coordinatorLayout, "Some Message", Snackbar.LENGTH_INDEFINITE)
                snackbar.setAction("Dismiss", { snackbar.dismiss() })
                snackbar.show()
            }
        }

        val saveButton: Button = save_button
        saveButton.setOnClickListener{ view ->
            mUnchanged = true
            finish()
        }
       // setSupportActionBar(edit_note_toolbar)

//        val actionBar = findViewById<Toolbar>(R.id.edit_note_toolbar)
//
//        setSupportActionBar(actionBar)
        //val actionBar = supportActionBar
        //actionBar?.subtitle = "test"
    }

    override fun onBackPressed() {
        if(mUnchanged) {
            super.onBackPressed()
        } else {
            val snackbar =
                Snackbar.make(coordinatorLayout, "Some Message", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Dismiss", { snackbar.dismiss() })
            snackbar.show()
        }
    }
}
