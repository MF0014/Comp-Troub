package com.microfrance.comptroub.Module4_Setup;
import com.microfrance.comptroub.Module4_Setup.mod4_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod4_questionLists {
    public static List<mod4_questions> questionsList = new ArrayList<>();

    public static List<mod4_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod4_questions("Common cases found to unexpected shutdowns is ?",
                0,
                "Overheating",
                "Outdated drivers",
                "Faulty hardware components",
                "Overheating",
                "",
                "Common cases found to unexpected shutdowns is overheating. Most of overheating causes are no air ventilation.\n" +
                        "Make sure your computer is ventilated well or no blockage of air."));

        questionsList.add(new mod4_questions("Showing the following image below, Based on what solution is this?",
                R.drawable.clean_pc,
                "Check your computer power supply and components connections",
                "Check for overheating issues",
                "Update your operating system and system drivers",
                "Overheating",
                "",
                "1st Solution: Check for overheating issues."));

        questionsList.add(new mod4_questions("This causes your computer to crash where it will lead to unexpected shutdowns, what issue is this referring to?",
                0,
                "Overheating",
                "Faulty hardware components",
                "Outdated drivers",
                "Outdated drivers",
                "",
                "Outdated drivers causes your computer to crash where it will lead to unexpected shutdowns"));

        questionsList.add(new mod4_questions("In steps to update your drivers using Windows Updates, what step is this referring to?",
                R.drawable.window_update_3,
                "After checking for available updates, press update now",
                "After you open the settings, go to update and security",
                "Go to settings by pressing the windows icon at the bottom left corner",
                "After checking for available updates, press update now",
                "",
                "3. After checking for available updates, press update now while waiting to install the updates, press the view optional updates."));

        questionsList.add(new mod4_questions("In steps to update your drivers using Windows Updates, what step is this referring to?",
                R.drawable.windows_update,
                "After you open the settings, go to update and security",
                "After checking for available updates, press update now",
                "After updating all of your drivers and operating system updates, restart your computer",
                "After checking for available updates, press update now",
                "",
                "5. After updating all of your drivers and operating system updates, restart your computer to apply your driver updates."));

        questionsList.add(new mod4_questions("Based on the following image, what solution is this referring to?",
                R.drawable.power_plug,
                "Check for overheating issues",
                "Update your operating system and system drivers",
                "Check your computer power supply and components connections",
                "Check your computer power supply and components connections",
                "",
                "3rd Solution: Check your computer power supply and components connections"));

        questionsList.add(new mod4_questions("In signs of a faulty power supply, what sign is this referring to?",
                R.drawable.burn_power_supply,
                "Fan not working",
                "Burning smell",
                "Strange noise",
                "Burning smell",
                "",
                "The image shows that the power supply got sparked that may contains the burning smell."));




        return questionsList;
    }
}