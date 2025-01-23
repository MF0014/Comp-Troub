package com.microfrance.comptroub.Module8_Setup;
import com.microfrance.comptroub.Module8_Setup.mod8_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod8_questionLists {
    public static List<mod8_questions> questionsList = new ArrayList<>();

    public static List<mod8_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod8_questions("Sometimes it might be a common issue to a driver where it didn't run properly. Which of the following solutions should you use? ",
                0,
                "Restart your Computer",
                "Clean your PC",
                "Check for malware/viruses",
                "Restart your Computer",
                "",
                "Sometimes it might be a common issue to a driver where it didn't run properly\n" +
                        "Restarting your Computer will resolve this issue"));

        questionsList.add(new mod8_questions("If you receive blue screen of death repeatedly, what you should do?",
                0,
                "Restart your Computer",
                "Update your operating system and system drivers",
                "Check for malware/viruses",
                "Update your operating system and system drivers",
                "",
                "If you receive blue screen of death repeatedly, it might be you need to update your system drivers and operating system to the latest version"));

        questionsList.add(new mod8_questions("Showing the following image below, What computer issue is this?",
                R.drawable.bsod_intro,
                "Malfunctioning Display",
                "Blue Screen of Death",
                "Input not recognized",
                "Blue Screen of Death",
                "",
                "Blue Screen of Death is a critical error screen displayed by the Windows operating system."));

        questionsList.add(new mod8_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.restart_pc,
                "Check for malware/viruses",
                "Update your operating system and system drivers",
                "Restart your PC",
                "Restart your PC",
                "",
                "The image shows the user attempts to restart their computer."));

        questionsList.add(new mod8_questions("Blue Screen of Death is commonly found if there are?",
                0,
                "There are any active malwares",
                "There are any games running",
                "There are any videos playing",
                "There are any active malwares",
                "",
                "3rd Solution:Check for malware/viruses \"Blue Screen of Death is commonly found if there are any active malwares.\""));

        questionsList.add(new mod8_questions("In 3rd Solution, Check for malware/viruses, What software did the module use to detect malware/viruses?",
                R.drawable.restart_pc,
                "MalwareBytes",
                "Windows Defender",
                "McAfee",
                "Windows Defender",
                "",
                "3rd Solution:Check for malware/viruses \"Try scanning your computer using a built in anti-virus software such as Microsoft Defender.\""));

        return questionsList;
    }
}