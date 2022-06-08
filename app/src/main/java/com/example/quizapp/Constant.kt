package com.example.quizapp

object Constant {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia",
            "Argentina",
            "Ukarine",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "India",
            "Australia",
            "Argentina",
            "Germany",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "India",
            "Australia",
            "Argentina",
            "Ukarine",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "India",
            "Australia",
            "Argentina",
            "Belgium",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "India",
            "Brazil",
            "Argentina",
            "Ukarine",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "India",
            "Brazil",
            "Argentina",
            "Denmark",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "India",
            "Germany",
            "Argentina",
            "Ukarine",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "India",
            "Brazil",
            "Fiji",
            "Ukarine",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Brazil",
            "Argentina",
            "Ukarine",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            1,
            "Which country does this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "India",
            "Brazil",
            "Kuwait",
            "Ukarine",
            2
        )
        questionList.add(que10)


        return questionList
    }
}