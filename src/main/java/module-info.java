module co.edu.uniquindio.billeteravirtual {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.billeteravirtual to javafx.fxml;
    exports co.edu.uniquindio.billeteravirtual;
}
