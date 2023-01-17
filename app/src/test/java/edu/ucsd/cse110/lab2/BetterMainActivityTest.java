package edu.ucsd.cse110.lab2;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {
    @Rule
    public ActivityScenarioRule context = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testStudentNameIsDisplayed() {
        context.getScenario().onActivity(activity -> {
            Button one = (Button)activity.findViewById(R.id.btn_one);
            Button plus = (Button)activity.findViewById(R.id.btn_plus);
            Button equ = (Button)activity.findViewById(R.id.btn_equals);
            TextView text_display =(TextView)activity.findViewById(R.id.display);
            one.performClick();
            plus.performClick();
            one.performClick();
            equ.performClick();
            assertEquals(text_display.getText(), "2");
        });

    }

}
