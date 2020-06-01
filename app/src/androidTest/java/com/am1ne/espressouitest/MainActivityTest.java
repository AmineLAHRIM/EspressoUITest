package com.am1ne.espressouitest;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    @Test
    public void test_activity_inView() {
        ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.main)).check(matches(isDisplayed()));
    }

    @Test
    public void test_visibility_text_nextbtn() {
        ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.activity_main_title)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
    }

    @Test
    public void test_isTitleTextDisplayed() {
        ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.main_activity_text)));
    }
}