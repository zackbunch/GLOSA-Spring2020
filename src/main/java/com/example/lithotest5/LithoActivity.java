package com.example.lithotest5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Layout;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;
import com.facebook.litho.widget.VerticalGravity;

import java.util.Random;

public class LithoActivity extends Activity {
    int timeToGreen = 60;
    int currentSpeed = (32);
    String advisoryAction = "Reduce Speed";
    int distanceToSignal = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final LithoView lithoView;
        final ComponentContext componentContext = new ComponentContext(this);



        final Random rand = new Random();

        // Create a Component which will display text
        final Component component = AdvisoryScreen.create(componentContext)
                .timeToGreen(timeToGreen)
                .currentSpeed(currentSpeed)
                .advisoryAction(advisoryAction)
                .distanceToSignal(distanceToSignal)
                .build();

        // Create LithoView from the component and its context
        lithoView = LithoView.create(this, component);

        // Set the content view to show the LithoView
        setContentView(lithoView);

        CountDownTimer timer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeToGreen -= 1;
                if (currentSpeed < 10)
                {
                    currentSpeed += 10;
                } else {
                    currentSpeed += rand.nextInt(10) - 5;
                }
                distanceToSignal -= rand.nextInt(10);


                lithoView.setComponentAsync(
                        AdvisoryScreen.create(componentContext)
                .timeToGreen(timeToGreen)
                .currentSpeed(currentSpeed)
                .advisoryAction(advisoryAction)
                .distanceToSignal(distanceToSignal)
                .build());
            }

            @Override
            public void onFinish() {

            }
        };

        timer.start();

    }
}
