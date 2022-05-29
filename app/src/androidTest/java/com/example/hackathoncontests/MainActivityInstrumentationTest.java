package com.example.hackathoncontests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void validateRegisterButton() {
        onView(withId(R.id.registerButton)).perform(click());
    }
    @Test
    public void loginIsSentToContestActivity() {
        String name = "Korir";
        String school = "Moringa";
        String password = "korir12";
        onView(withId(R.id.nameEditText)).perform(typeText(name));
        onView(withId(R.id.schoolEditText)).perform(typeText(school));
        onView(withId(R.id.passwordEditText)).perform(typeText(password));
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.viewName)).check(matches(withText("Your Name: " + name)));
        onView(withId(R.id.viewSchool)).check(matches(withText("Your School: " + school)));
    }
}
