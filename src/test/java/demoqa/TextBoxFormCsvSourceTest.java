package demoqa;

import demoqa.pages.TextBoxFormPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TextBoxFormCsvSourceTest extends TestBase {
    TextBoxFormPage textBoxFormPage = new TextBoxFormPage();

    @CsvSource(value = {
            "Mrs. Vickey Stehr, kelle.bednar@yahoo.com",
            "Dot Pfannerstill, jude.ebert@yahoo.com"
    })

    @Tags({
            @Tag("web")
    })

    @DisplayName("Checking the filling of input fields Full Name, Email")
    @ParameterizedTest(name = "Fill in the Full Name field = {0} and the Email field = {1}")
    void fieldFillingTest(String fullName, String email) {
        textBoxFormPage
                .openPage()
                .checkThatTheSiteHasOpened("Text Box")
                .setFullName(fullName)
                .setEmail(email)
                .clickSubmit()
                .checkValueFullNameOutput(fullName)
                .checkValueEmailOutput(email);
    }
}
