module com.example.spq_application {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.spq_application to javafx.fxml;
    exports com.example.spq_application;
    exports Controller;
    opens Controller to javafx.fxml;
}