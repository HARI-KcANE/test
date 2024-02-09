module org.example.gitrepodemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.gitrepodemo to javafx.fxml;
    exports org.example.gitrepodemo;
}