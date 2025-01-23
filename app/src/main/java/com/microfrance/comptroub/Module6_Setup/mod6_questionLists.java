package com.microfrance.comptroub.Module6_Setup;
import com.microfrance.comptroub.Module6_Setup.mod6_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod6_questionLists {
    public static List<mod6_questions> questionsList = new ArrayList<>();

    public static List<mod6_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod6_questions("What you should do if you find your computer components got damaged?",
                0,
                "Throw away your computer components",
                "Buy new computer components",
                "Contact the manufacturer",
                "Contact the manufacturer",
                "",
                "If you find your computer components got damaged, contact the manufacturer to seek professional assistance immediately."));

        questionsList.add(new mod6_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.power_plug,
                "Check your bootable drive",
                "Check your computer components",
                "Check your power source",
                "Check your power source",
                "",
                "1st Solution: Check your power source."));

        questionsList.add(new mod6_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.ram_insert,
                "Check your bootable drive",
                "Check your computer components",
                "Check your power source",
                "Check your computer components",
                "",
                "2nd Solution: Check your computer components."));

        questionsList.add(new mod6_questions("In signs of a faulty power supply, what sign is this referring to?",
                R.drawable.power_supply_fan,
                "Burning Smell",
                "Fan not working",
                "Burning smell",
                "Fan not working",
                "",
                "The image shows that the power supply fan is not working."));

        questionsList.add(new mod6_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.ssd_check,
                "Check your bootable drive",
                "Check your computer components",
                "Check your power source",
                "Check your bootable drive",
                "",
                "3rd Solution: Check your bootable drive."));

        questionsList.add(new mod6_questions("If your computer is stuck to the BIOS Screen, what might be is the issue?",
                0,
                "BIOS didn't recognize your drive or drive has no operating system",
                "computer components got damaged",
                "No power source",
                "BIOS didn't recognize your drive or drive has no operating system",
                "",
                "If your computer is stuck to the BIOS Screen, it might be your BIOS didn't recognize your drive or drive has no operating system."));

        return questionsList;
    }
}