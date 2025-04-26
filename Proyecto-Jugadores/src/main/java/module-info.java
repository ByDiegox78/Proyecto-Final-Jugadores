module org.example.proyectojugadores {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.proyectojugadores to javafx.fxml;
    exports org.example.proyectojugadores;
}