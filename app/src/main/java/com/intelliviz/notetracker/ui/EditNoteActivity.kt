package com.intelliviz.notetracker.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.intelliviz.notetracker.R

class EditNoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_note)

        val actionBar = findViewById<Toolbar>(R.id.edit_note_toolbar)

        setSupportActionBar(actionBar)
        //val actionBar = supportActionBar
        //actionBar?.subtitle = "test"
    }
}