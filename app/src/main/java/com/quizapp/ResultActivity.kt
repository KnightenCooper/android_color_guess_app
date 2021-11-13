package com.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
        // END
    }
}


//Sources Used:
//https://dotnet.microsoft.com/learn/xamarin/hello-world-tutorial/intro
//https://www.javatpoint.com/android-tutorial
//https://www.geeksforgeeks.org/android-tutorial/
//https://www.raywenderlich.com/4936497-your-first-kotlin-android-app
//https://www.tutorialspoint.com/android/index.htm
//https://www.freecodecamp.org/news/tag/android-app-development/
//https://www.youtube.com/watch?v=EOfCEhWq8sg
//https://www.youtube.com/watch?v=fis26HvvDII
//https://www.youtube.com/watch?v=b21fiIyOW4A
//https://developer.android.com/studio