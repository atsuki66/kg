<<<<<<< HEAD
 module com.cgvsu {
=======
module com.cgvsu {
>>>>>>> 0e073c896c1ff56caba6d21792aeb477587eb355
    requires javafx.controls;
    requires javafx.fxml;
    requires vecmath;
    requires java.desktop;


    opens com.cgvsu to javafx.fxml;
    exports com.cgvsu;
}