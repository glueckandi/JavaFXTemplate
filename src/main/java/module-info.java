module com.compworkx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.compworkx to javafx.fxml;
    exports com.compworkx;
}