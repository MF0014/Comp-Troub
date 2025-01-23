package com.microfrance.comptroub.Module3_Setup;
import com.microfrance.comptroub.Module3_Setup.mod3_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod3_questionLists {
    public static List<mod3_questions> questionsList = new ArrayList<>();

    public static List<mod3_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod3_questions("What you need to do if your audio settings modified?",
                0,
                "Reboot/Restart your computer",
                "Try checking your sound settings in your windows setting",
                "Try replugging your audio device\n",
                "Try checking your sound settings in your windows setting",
                "",
                "It might be possible that your audio settings has been modified.\n" +
                        "Try checking your sound settings in your windows setting if it is muted or \n" +
                        "the audio device you using is enabled."));

        questionsList.add(new mod3_questions("Which of the following indicates why there's no audio feedback?",
                0,
                "This often indicates that between the input device and your computer.",
                "This often indicates that between the output device and the user.",
                "This often indicates that between the output device and your computer.",
                "This often indicates that between the output device and your computer.",
                "",
                "Most of our audio is being clanky to no audio at all. This often indicates that between the output device and your computer."));

        questionsList.add(new mod3_questions("Showing the following picture below, Based on what solution is this?",
                R.drawable.sound_settings,
                "Replug your audio output device/s",
                "Check your sound settings",
                "Reinstall your audio drivers",
                "Check your sound settings",
                "",
                "2nd Solution: Check your sound settings."));


        questionsList.add(new mod3_questions("In the solution \"Steps to re-install audio drivers\", What step is this?",
                R.drawable.audio_step_1,
                "Find the audio driver you want to uninstall",
                "Search \"Device manager\" to your Windows Searchbar",
                "Navigate and click \">\" to \"Sound, video and game controllers\"",
                "Search \"Device manager\" to your Windows Searchbar",
                "",
                "In step 1, Search \"Device manager\" to your Windows Searchbar"));

        questionsList.add(new mod3_questions("It might be possible that your audio device isn't plugged correctly, Based on what solution is this?",
                0,
                "Reinstall your audio drivers",
                "Reboot/Restart your computer",
                "Replug your audio output device/s",
                "Replug your audio output device/s",
                "",
                "It might be possible that your audio device isn't plugged correctly, Try replugging your audio device to see if theres any changes."));

        questionsList.add(new mod3_questions("It might be possible that your audio drivers are not installed correctly, Based on what solution is this?",
                0,
                "Reinstall your audio drivers",
                "Reboot/Restart your computer",
                "Replug your audio output device/s",
                "Reinstall your audio drivers",
                "",
                "It might be possible that your audio drivers are not installed correctly, Try reinstall your audio drivers."));

        return questionsList;


    }
}
