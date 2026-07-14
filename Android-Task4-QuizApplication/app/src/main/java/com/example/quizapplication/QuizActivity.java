package com.example.quizapplication;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView questionCounter, questionText;
    private Button[] optionButtons;
    private Button nextButton;

    private List<Question> questionList;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private boolean isAnswered = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionCounter = findViewById(R.id.questionCounter);
        questionText = findViewById(R.id.questionText);
        optionButtons = new Button[]{
                findViewById(R.id.option1),
                findViewById(R.id.option2),
                findViewById(R.id.option3),
                findViewById(R.id.option4)
        };
        nextButton = findViewById(R.id.nextButton);

        loadQuestions();
        Collections.shuffle(questionList);
        displayQuestion();

        for (int i = 0; i < optionButtons.length; i++) {
            final int index = i;
            optionButtons[i].setOnClickListener(v -> checkAnswer(index));
        }

        nextButton.setOnClickListener(v -> {
            currentQuestionIndex++;
            if (currentQuestionIndex < questionList.size()) {
                displayQuestion();
            } else {
                finishQuiz();
            }
        });
    }

    private void loadQuestions() {
        questionList = new ArrayList<>();
        questionList.add(new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2));
        questionList.add(new Question("Which planet is known as the Red Planet?", new String[]{"Mars", "Venus", "Jupiter", "Saturn"}, 0));
        questionList.add(new Question("Who wrote 'Hamlet'?", new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "J.K. Rowling"}, 1));
        questionList.add(new Question("What is the largest ocean on Earth?", new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, 3));
        questionList.add(new Question("What is the chemical symbol for gold?", new String[]{"Ag", "Au", "Pb", "Fe"}, 1));
        questionList.add(new Question("In which year did World War II end?", new String[]{"1942", "1944", "1945", "1948"}, 2));
        questionList.add(new Question("What is the square root of 64?", new String[]{"6", "7", "8", "9"}, 2));
        questionList.add(new Question("Which country is home to the Kangaroo?", new String[]{"South Africa", "Australia", "New Zealand", "India"}, 1));
        questionList.add(new Question("What is the smallest prime number?", new String[]{"0", "1", "2", "3"}, 2));
        questionList.add(new Question("Which element has the atomic number 1?", new String[]{"Helium", "Oxygen", "Hydrogen", "Nitrogen"}, 2));
    }

    private void displayQuestion() {
        isAnswered = false;
        nextButton.setVisibility(View.INVISIBLE);
        resetButtonColors();

        Question currentQuestion = questionList.get(currentQuestionIndex);
        questionCounter.setText(getString(R.string.question_counter_template, currentQuestionIndex + 1, questionList.size()));
        questionText.setText(currentQuestion.getQuestionText());

        String[] options = currentQuestion.getOptions();
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i].setText(options[i]);
            optionButtons[i].setEnabled(true);
        }
    }

    private void checkAnswer(int selectedIndex) {
        if (isAnswered) return;
        isAnswered = true;

        Question currentQuestion = questionList.get(currentQuestionIndex);
        int correctIndex = currentQuestion.getCorrectOptionIndex();

        if (selectedIndex == correctIndex) {
            score++;
            optionButtons[selectedIndex].setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        } else {
            optionButtons[selectedIndex].setBackgroundTintList(ColorStateList.valueOf(Color.RED));
            optionButtons[correctIndex].setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        }

        for (Button button : optionButtons) {
            button.setEnabled(false);
        }
        nextButton.setVisibility(View.VISIBLE);
    }

    private void resetButtonColors() {
        for (Button button : optionButtons) {
            button.setBackgroundTintList(null); // Reset to default theme color
        }
    }

    private void finishQuiz() {
        Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
        intent.putExtra("SCORE", score);
        intent.putExtra("TOTAL", questionList.size());
        startActivity(intent);
        finish();
    }
}
