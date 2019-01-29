package gog.pub.example;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotNull;

public class ExampleCommand {

    @NotNull
    private String camcelCaseField;

    public String camcel_case_field;

    public String getCamcelCaseField() {
        return camcelCaseField;
    }

    public void setCamcelCaseField(String camcelCaseField) {
        this.camcelCaseField = camcelCaseField;
    }

    @PostConstruct
    public void after() {
        int a = 1;
    }
}
