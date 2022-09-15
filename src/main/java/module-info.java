module com.example.coche {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coche to javafx.fxml;
    exports com.example.coche;
}