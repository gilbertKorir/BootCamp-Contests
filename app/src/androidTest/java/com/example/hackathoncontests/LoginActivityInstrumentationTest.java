package com.example.hackathoncontests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class LoginActivityInstrumentationTest {
    @Rule
    public ActivityScenarioRule<LoginActivity> activityRule = new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    public void locationIsSentToRestaurantsActivity() {
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
