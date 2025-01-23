package com.microfrance.comptroub.sample;

import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class questionLists {

    public static List<questions> questionsList = new ArrayList<>();

    public static List<questions> getQuestionsList() {
        questionsList.add(new questions("Which of the following is a display cable?",
                R.drawable.usb_insert,
                R.drawable.router_lan,
                R.drawable.hdmi_cable,
                "R.drawable.hdmi_cable", // Assuming "hdmi_cable" is the correct option
                "The HDMI cable is a type of display cable that transmits both video and audio signals to the monitor.\nThe other two options are not display cables."));

// Example with options as strings
        questionsList.add(new questions("What is the first solution suggested to resolve monitor display issues?",
                "Change the Cables",
                "Check the cables connecting the monitor to the computer",
                "Check the cable condition",
                "Check the cables connecting the monitor to the computer",
                "Checking the cables connecting the monitor to the computer is recommended to ensure they are plugged in correctly before proceeding to another solution"));

        return questionsList;
    }
}