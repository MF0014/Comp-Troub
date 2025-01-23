package com.microfrance.comptroub.Module2_Setup;

import com.microfrance.comptroub.Module2_Setup.mod2_questions;
import com.microfrance.comptroub.R;

import java.util.ArrayList;
import java.util.List;

public class mod2_questionLists {
    public static List<mod2_questions> questionsList = new ArrayList<>();

    public static List<mod2_questions> getQuestionsList(){
        // Create instances of mod1_questions and add them to questionsList
        questionsList.add(new mod2_questions("What solution is \"It might help because it resets your computer memory\"",
                        0,
                "Check the input device condition",
                "Check if the device is plugged correctly",
                "Reboot/Restart your computer",
                "Reboot/Restart your computer",
                "",
                "It might be possible that your computer is acting up, restarting your computer\n" +
                        "might help because it resets your computer memory."));
        questionsList.add(new mod2_questions("What you need to do if your input devices got damaged?",
                0,
                "Replug your input device",
                "Go to the manufacturer",
                "Reboot/Restart your computer",
                "Go to the manufacturer",
                "",
                "It might be possible that the input device got damage such as the plug or the wires got cut or the device itself.\n" +
                        "Go to the manufacturer to seek professional assistance."));
        questionsList.add(new mod2_questions("Which of the following method to check if the input devices are in good condition?",
                0,
                "Try a different port of your computer or try to another computer",
                "Replace your input devices",
                "Throw your input devices away",
                "Try a different port of your computer or try to another computer",
                "",
                "You make sure your input devices are in good condition if there's any damages.\n" +
                        "Try a different port of your computer or try to another computer\n" +
                        "to see if theres any changes to your input device/s"));
        questionsList.add(new mod2_questions("Which of the following is a input device?",
                0,
                "Keyboard",
                "Webcam",
                "Printer",
                "Keyboard",
                "",
                "Keyboard sends input letters, numbers and functions to the computer. Webcam and Printer are output devices."));
        questionsList.add(new mod2_questions("Showing the image below, What based solution is this?",
                R.drawable.usb_insert,
                "Reboot/Restart your computer",
                "Check if the device is plugged correctly",
                "Check the input devices drivers",
                "Check if the device is plugged correctly",
                "",
                "1st Solution: Check if the device is plugged correctly"));
        questionsList.add(new mod2_questions("Showing the image below, What based solution is this?",
                R.drawable.restart_pc,
                "Reboot/Restart your computer",
                "Check if the device is plugged correctly",
                "Check the input devices drivers",
                "Reboot/Restart your computer",
                "",
                "2nd Solution: Reboot/Restart your computer."));
        questionsList.add(new mod2_questions("Showing the image below, What input device is this?",
                R.drawable.keyboard_mouse_rgb,
                "keychain and racumin",
                "keypad and mice",
                "keyboard and mouse",
                "keyboard and mouse",
                "",
                "4th solution picture shows a mouse and keyboard in colorful lights."));



        return questionsList;
    }
}
