module programacio3.parcial2.parcial2_ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens programacio3.parcial2.parcial2_ejercicio1 to javafx.fxml;
    exports programacio3.parcial2.parcial2_ejercicio1;
}