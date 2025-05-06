module co.edu.uniquindio.billeteravirtual {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens co.edu.uniquindio.billeteravirtual to javafx.fxml;
    exports co.edu.uniquindio.billeteravirtual;
}
