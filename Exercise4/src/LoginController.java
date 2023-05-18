import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;


public class LoginController {
    
    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button myloginbutton;

    @FXML
    Label mywarninglabel;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException{

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        System.out.println(username);
        System.out.println(password);

        if (username.equals("Akihiro24") && password.equals("WowGaleng")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            mywarninglabel.setVisible(true);
        }
    }

}



