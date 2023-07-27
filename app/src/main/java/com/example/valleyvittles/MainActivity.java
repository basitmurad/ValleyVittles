package com.example.valleyvittles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.valleyvittles.databinding.ActivityMainBinding;
import com.example.valleyvittles.ui.SignUpActivity;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        Animation fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        findViewById(android.R.id.content).startAnimation(fadeOutAnimation);

        // Move to the next activity after a short delay (to see the fade-out effect)
        fadeOutAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                // Start the next activity after the fade-out animation is complete
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));

                // Apply the fade-in animation to the next activity
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

                // Finish the current activity to prevent it from being added to the back stack
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });




        // Delay the transition to the next activity for 500 milliseconds
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                // This is executed after the delay
//                // No need to start the SignUpActivity here again, it's already started in onAnimationEnd()
//            }
//        }, 1000);
    }
}