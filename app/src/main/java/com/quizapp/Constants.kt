package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What color is this?",
            R.drawable.ic_red,
            "Red", "Orange",
            "Purple", "Yellow", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What color is this?",
            R.drawable.ic_orange,
            "Blue", "Yellow",
            "Orange", "Brown", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What color is this?",
            R.drawable.ic_yellow,
            "Purple", "Orange",
            "Green", "Yellow", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What color is this?",
            R.drawable.ic_green,
            "Orange", "Green",
            "Pink", "Red", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What color is this?",
            R.drawable.ic_blue,
            "Yellow", "Red",
            "Blue", "Black", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What color is this?",
            R.drawable.ic_purple,
            "Purple", "Green",
            "Yellow", "Orange", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What color is this?",
            R.drawable.ic_black,
            "Red", "Green",
            "Black", "Yellow", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What color is this?",
            R.drawable.ic_brown,
            "Purple", "Black",
            "Orange", "Brown", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What color is this?",
            R.drawable.ic_grey,
            "Green", "Grey",
            "Red", "Yellow", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What color is this?",
            R.drawable.ic_pink,
            "Pink", "Green",
            "Brown", "Red", 1
        )

        questionsList.add(que10)

        return questionsList
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