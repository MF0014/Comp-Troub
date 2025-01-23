package com.microfrance.comptroub.Module7_Setup;
import com.microfrance.comptroub.Module7_Setup.mod7_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod7_questionLists {
    public static List<mod7_questions> questionsList = new ArrayList<>();

    public static List<mod7_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod7_questions("Try Replugging Your ___ Cable to your computer or to your router to check if there are any changes. Find the matching word to this solution.",
                0,
                "DVD",
                "LAN",
                "USB",
                "LAN",
                "",
                "Try Replugging Your LAN Cable to your computer or to your router to check if there are any changes."));

        questionsList.add(new mod7_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.router_restart,
                "Check your internet equipment",
                "Check your internet service provider",
                "Try different type of network connection",
                "Check your internet service provider",
                "",
                "1st Solution: Check your internet service provider."));

        questionsList.add(new mod7_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.ethernet_wifi,
                "Check your internet equipment",
                "Check your internet service provider",
                "Try different type of network connection",
                "Try different type of network connection",
                "",
                "3rd Solution: Try different type of network connection."));

        questionsList.add(new mod7_questions("If you find any damages to your internet equipment, what you should do?",
                R.drawable.router_lan,
                "Restart your router",
                "Contact you internet service provider",
                "Try another device to access the internet",
                "Contact you internet service provider",
                "",
                "If you find any damages to your internet equipment, contact you internet service provider to resolve the issue."));

        questionsList.add(new mod7_questions("If other devices can access the internet. it might be your ________ ______ having an issue., Which issue is this referring to?",
                R.drawable.router_lan,
                "System Drivers",
                "Graphics Drivers",
                "Network Drivers",
                "Network Drivers",
                "",
                "If other devices can access the internet. it might be your network drivers having an issue.."));

        questionsList.add(new mod7_questions("Showing the following image below, What cable is being insert to the computer?",
                R.drawable.router_lan,
                "VGA",
                "LAN",
                "USB",
                "LAN",
                "",
                "The yellow cable that is inserted to the computer is a Ethernet LAN cable."));


        return questionsList;
    }
}