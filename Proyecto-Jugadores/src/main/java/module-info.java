module org.example.proyectojugadores {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlinx.serialization.core;
    requires net.devrieze.xmlutil.serialization;


    opens org.example.proyectojugadores to javafx.fxml;
    exports org.example.proyectojugadores;
}