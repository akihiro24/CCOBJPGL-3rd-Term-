package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class FriendController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Celine celine = new Celine();
    Journey journey = new Journey();
    Leanna leanna = new Leanna();
    Paulo paulo = new Paulo();
    Shalimar shalimar = new Shalimar();

    public void initialize() {

        celine.setAge(19);
        celine.setProgram("BSIT-MAA");
        celine.setHobby("manood ng TikToks");
        celine.setZodiac("Sagittarius");

        journey.setAge(19);
        journey.setProgram("BSIT-MWA");
        journey.setHobby("Uminom");
        journey.setZodiac("Capricorn");

        leanna.setAge(19);
        leanna.setProgram("BSIT-MWA");
        leanna.setHobby("Mag Omegle");
        leanna.setZodiac("Aries");

        paulo.setAge(19);
        paulo.setProgram("BSIT-MWA");
        paulo.setHobby("Maglaro sa Computer");
        paulo.setZodiac("Aries");

        shalimar.setAge(19);
        shalimar.setProgram("BSIT-MAA");
        shalimar.setHobby("Magdrawing");
        shalimar.setZodiac("Capricorn");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Si Celine ay " + celine.getAge() + " years old" + ", " + "Ang program niya ay " + celine.getProgram() + ", " + "Mahilig siyang " + celine.getHobby() + ", " + "at ang zodiac niya ay " + celine.getZodiac());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Si Journey ay " + journey.getAge() + " years old" + ", " + "Ang program niya ay " + journey.getProgram() + ", " + "Mahilig siyang " + journey.getHobby() + ", " + "at ang zodiac niya ay " + journey.getZodiac());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Si Leanna ay " + leanna.getAge() + " years old" + ", " + "Ang program niya ay " + leanna.getProgram() + ", " + "Mahilig siyang " + leanna.getHobby() + ", " + "at ang zodiac niya ay " + leanna.getZodiac());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Si Paulo ay " + paulo.getAge() + " years old" + ", " + "Ang program niya ay " + paulo.getProgram() + ", " + "Mahilig siyang " + paulo.getHobby() + ", " + "at ang zodiac niya ay " + paulo.getZodiac());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Si Shalimar ay " + shalimar.getAge() + " years old" + ", " + "Ang program niya ay " + shalimar.getProgram() + ", " + "Mahilig siyang " + shalimar.getHobby() + ", " + "at ang zodiac niya ay " + shalimar.getZodiac());
        }

        alert.showAndWait();

    }
}