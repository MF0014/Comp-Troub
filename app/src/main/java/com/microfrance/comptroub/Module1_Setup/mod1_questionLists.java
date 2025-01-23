package com.microfrance.comptroub.Module1_Setup;

import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod1_questionLists {


    public static List<mod1_questions> questionsList = new ArrayList<>();

    public static List<mod1_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod1_questions("What display cable is this?",
                R.drawable.hdmi_cable,
                "USB",
                "LAN",
                "HDMI",
                "",
                "HDMI",
                "The image is shown a HDMI cable."));
        questionsList.add(new mod1_questions("What is the first solution suggested to resolve monitor display issues?",
                0,
                "Change the Cables",
                "Check the cables connecting the monitor to the computer",
                "Check the cable condition",
                "",
                "Check the cables connecting the monitor to the computer",
                "Checking the cables connecting the monitor to the computer is recommended to ensure they are plugged in correctly before proceeding to another solution"));
        questionsList.add(new mod1_questions("What could be the cause if your monitor displays \"No Input Found\" or a black screen?",
                0,
                "It indicates the connection between computer and user",
                "It indicates the connection between computer and the power",
                "It indicates the connection between computer and monitor",
                "",
                "It indicates the connection between computer and monitor",
                "This often indicates the connection between the computer and the monitor."));
        questionsList.add(new mod1_questions("Showing the following picture below, What is the name of this cable?",
                R.drawable.vga_cable_holding,
                "VGA",
                "HDMI",
                "DVI",
                "",
                "VGA",
                "VGA adapters are known to their oval shape plug, while the HDMI has a flat rectangular shape and DVI known for rectangular shape with multiple pins arranged in two or three rows."));
        questionsList.add(new mod1_questions("Showing the following picture below, Based on what solution is this?",
                R.drawable.mod1_replug,
                    "Check the cables connecting the monitor to the computer",
                "Check the cable condition",
                "Check the monitor condition",
                "",
                "Check the cables connecting the monitor to the computer",
                "1st solution: Check the cables connecting to the monitor including the power cable of your monitor."));

        questionsList.add(new mod1_questions("What is recommended if you find damage to the monitor or its cables?",
                0,
                "Contact the manufacturer",
                "Throw the monitor/Cables away",
                "Buy a new monitor/cables",
                "",
                "Contact the manufacturer",
                "Contact the manufacturer seeks their professional assistance to resolve the issue."));
        questionsList.add(new mod1_questions("Showing the following picture below, Based on what solution is this?",
                R.drawable.monitor_back,
                "Check the cables connecting the monitor to the computer",
                "Check the cable condition",
                "Check the monitor condition",
                "",
                "Check the monitor condition",
                "3rd solution: Check the monitor condition."));


        return questionsList;
    }
}
