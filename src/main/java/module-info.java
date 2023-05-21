module com.example.project23 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.project23 to javafx.fxml;
    exports com.example.project23;
}