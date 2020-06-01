package com.am1ne.espressouitest;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> activityTestRule = new ActivityTestRule<>(SecondActivity.class);

    @Test
    public void test_isActivityOnView() {
        onView(withId(R.id.main)).check(matches(isDisplayed()));
    }
    @Test
    public void test_visibility_text_nextbtn() {
        onView(withId(R.id.activity_second_title)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
    }

    @Test
    public void test_isTitleTextDisplayed() {
        onView(withId(R.id.activity_second_title)).check(matches(withText(R.string.second_activity_text)));
    }
}