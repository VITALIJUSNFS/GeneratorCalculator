module com.example.alternatorscalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alternatorscalculator to javafx.fxml;
    exports com.example.alternatorscalculator;
}