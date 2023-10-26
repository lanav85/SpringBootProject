module com.example.ct5171_springbooot1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;


    opens com.example.ct5171_springbooot1 to javafx.fxml;
    exports com.example.ct5171_springbooot1;
}