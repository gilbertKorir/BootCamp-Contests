package com.example.hackathoncontests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.hackathoncontests.ui.ContestsActivity;

import org.junit.Rule;
import org.junit.Test;

public class ContestsActivityInstrumentationTest {
    @Rule
    public ActivityScenarioRule<ContestsActivity> activityRule = new ActivityScenarioRule<>(ContestsActivity.class);

    @Test
    public void confirmNameandSchool() {
        String name = "korir";
        String school = "Moringa";
        onView(withId(R.id.viewName)).check(matches(withText("Your Name: "+ name)));
        onView(withId(R.id.viewSchool)).check(matches(withText("Your School: " + school)));
    }
    }
