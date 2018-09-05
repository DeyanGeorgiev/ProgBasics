package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class Controller {
    public TextField USD;
    public TextField BGN;
    public TextField result;

    public void calculate(ActionEvent actionEvent) {



                double USD = Double.parseDouble(this.USD.getText());
                double BGN= Double.parseDouble((this.BGN.getText()));

                double result = BGN*USD;


                this.result.setText(String.valueOf(result));


            }
        }
