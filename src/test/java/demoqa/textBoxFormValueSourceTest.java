package demoqa;

import demoqa.pages.textBoxFormPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class textBoxFormValueSourceTest extends testBase {
    demoqa.pages.textBoxFormPage textBoxFormPage = new textBoxFormPage();

    @ValueSource(
            strings = {"Igor Petrov", "Konstantin Ivanov"}
    )

    @Tags({
            @Tag("web")
    })

    @DisplayName("Checking the filling of input field Full Name")
    @ParameterizedTest(name = "Fill in only the Full Name field with the value {0}")
    void FieldFillingTest(String fullName) {
        textBoxFormPage
                .openPage()
                .checkThatTheSiteHasOpened("Text Box")
                .setFullName(fullName)
                .clickSubmit()
                .checkValueFullNameOutput(fullName);
    }
}
