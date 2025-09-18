module org.dein {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;

    opens org.dein to javafx.fxml;
    exports org.dein;
}
