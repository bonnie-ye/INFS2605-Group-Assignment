module com.mycompany.infs2605_assignment {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.infs2605_assignment to javafx.fxml;
    exports com.mycompany.infs2605_assignment;
}
