package com.microfrance.comptroub.Module5_Setup;
import com.microfrance.comptroub.Module5_Setup.mod5_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod5_questionLists {
    public static List<mod5_questions> questionsList = new ArrayList<>();

    public static List<mod5_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod5_questions("Sometimes it might cause instability to your computer. Which of the following that refers to the sentence?",
                0,
                "Low on storage space",
                "Outdated Drivers",
                "Input Devices",
                "Low on storage space",
                "",
                "Sometimes low on storage space might cause instability to your computer.Your computer will run slowly due to insufficient space to provide functionality to your other applications or software"));

        questionsList.add(new mod5_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.storage_full,
                "Free up your storage space",
                "Update your operating system and system drivers",
                "Adjust system performance",
                "Free up your storage space",
                "",
                "1st Solution: Free up your storage space"));
        questionsList.add(new mod5_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.windows_performance,
                "Free up your storage space",
                "Update your operating system and system drivers",
                "Adjust system performance",
                "Free up your storage space",
                "",
                "4th Solution: Adjust system performance"));
        questionsList.add(new mod5_questions("What program did the module use to update operating system and system drivers?",
                0,
                "Advance System properties",
                "Windows updates",
                "Windows Disk Cleanup",
                "Windows updates",
                "",
                "There are many ways to update your drivers but we will using \"Windows Update\" to check your outdated drivers."));
        questionsList.add(new mod5_questions("What program did the module use to delete temporary files?",
                0,
                "Advance System properties",
                "Windows updates",
                "Windows Disk Cleanup",
                "Windows Disk Cleanup",
                "",
                "In 1st solution: Free up your storage space, We will be using windows disk cleanup for removing temporary files."));

        questionsList.add(new mod5_questions("What program did the module use to adjust windows visuals",
                0,
                "Advance System properties",
                "Windows updates",
                "Windows Disk Cleanup",
                "Advance System properties",
                "",
                "In 4th Solution: Adjust system performance, How to adjust windows visuals using advance system properties"));
        questionsList.add(new mod5_questions("This solution can significantly improve your PC performance if your current setup is causing slow operations, what solution is this referring to?",
                0,
                "Free up your storage space",
                "Upgrade your equipment",
                "Adjust system performance",
                "Upgrade your equipment",
                "",
                "In 3rd Solution: Upgrade your equipment, Upgrading your PC can significantly improve your PC performance if your current setup is causing slow operations."));



        return questionsList;
    }
}