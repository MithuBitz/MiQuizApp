package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOption: Int = 0

    //Initialize the elements on UI
    private var questionTv: TextView? = null
    private var imageIv: ImageView? = null
    private var progressBar: ProgressBar? = null
    private var progressTv: TextView? = null
    private var optionOneTv: TextView? = null
    private var optionTwoTv: TextView? = null
    private var optionThreeTv: TextView? = null
    private var optionFourTv: TextView? = null
    private var submitBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        questionTv = findViewById(R.id.questionTV)
        imageIv = findViewById(R.id.imageIV)
        progressBar = findViewById(R.id.progressBar)
        progressTv = findViewById(R.id.progressTV)
        optionOneTv = findViewById(R.id.optionOneTV)
        optionTwoTv = findViewById(R.id.optionTwoTV)
        optionThreeTv = findViewById(R.id.optionThreeTV)
        optionFourTv = findViewById(R.id.optionFourTV)
        submitBtn = findViewById(R.id.submitBTN)

        //Set the onClickListener for the option textview
        optionOneTv?.setOnClickListener(this)
        optionTwoTv?.setOnClickListener(this)
        optionThreeTv?.setOnClickListener(this)
        optionFourTv?.setOnClickListener(this)
        submitBtn?.setOnClickListener(this)

        mQuestionList = Constant.getQuestions()

        setQuestion()
    }

    private fun setQuestion() {

        var question: Question = mQuestionList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        progressTv?.text = "$mCurrentPosition / ${progressBar?.max}"
        questionTv?.text = question.question
        optionOneTv?.text = question.optionOne
        optionTwoTv?.text = question.optionTwo
        optionThreeTv?.text = question.optionThree
        optionFourTv?.text = question.optionFour
        imageIv?.setImageResource(question.image)

        //Change the text of the Button according to question " Submit" or "Finish"
        if (mCurrentPosition == mQuestionList!!.size) {
            submitBtn?.text = "Finish"
        } else {
            submitBtn?.text = "Submit"
        }
    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()

        optionOneTv?.let {
            options.add(0, it)
        }
        optionTwoTv?.let {
            options.add(1, it)
        }
        optionThreeTv?.let {
            options.add(2, it)
        }
        optionFourTv?.let {
            options.add(3, it)
        }

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionView()

        mSelectedOption = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.optionOneTV -> {
                optionOneTv?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.optionTwoTV -> {
                optionTwoTv?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.optionThreeTV -> {
                optionThreeTv?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.optionFourTV -> {
                optionFourTv?.let {
                    selectedOptionView(it, 4)
                }
            }
            R.id.submitBTN -> {
                // TODO
            }
        }
    }
}