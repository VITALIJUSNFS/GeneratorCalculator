package com.example.alternatorscalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button calculate;

    @FXML
    private Text dieselConsumptionsPerMonth;

    @FXML
    private Text dieselCostPerMonth;

    @FXML
    private TextField dieselPrice;

    @FXML
    private Text gasConsumptionsPerMonth;

    @FXML
    private Text gasCostPerMonth;

    @FXML
    private TextField gasPrice;

    @FXML
    private Text ignitisCostPerMonth;

    @FXML
    private TextField ignitisPrice;

    @FXML
    private TextField usedEnergyPerMonth;

    @FXML
    void initialize() {

        calculate.setOnAction(event -> {
            int energyPerMonth = Integer.parseInt(usedEnergyPerMonth.getText().trim());
            double gasCost = Double.parseDouble(gasPrice.getText().trim());
            double dieselCost = Double.parseDouble(dieselPrice.getText());
            double ignCost = Double.parseDouble(ignitisPrice.getText().trim());

            gasConsumptionsPerMonth.setText(String.valueOf(energyPerMonth / 5 * 4.2));
            dieselConsumptionsPerMonth.setText(String.valueOf(energyPerMonth / 5 * 3.5));

            gasCostPerMonth.setText(String.valueOf((int) (energyPerMonth / 5 * 4.2 * gasCost)));
            dieselCostPerMonth.setText(String.valueOf((int)(energyPerMonth / 5 * 3.5 * dieselCost)));
            ignitisCostPerMonth.setText(String.valueOf((int)(energyPerMonth*ignCost)));
        });
    }
}