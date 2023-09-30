package demoqa;

import demoqa.pages.TextBoxFormPage;
import demoqa.utils.RandomUtils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class TextBoxFormRandomTest extends TestBase {
    TextBoxFormPage textBoxFormPage = new TextBoxFormPage();
    static RandomUtils randomUtils = new RandomUtils();

    static Stream<Arguments> methodSourceExampleTest() {
        return Stream.of(
                Arguments.of(randomUtils.getFullName(), randomUtils.getEmail(), randomUtils.getCurrentAddress(), randomUtils.getPermanentAddress()),
                Arguments.of(randomUtils.getFullName(), randomUtils.getEmail(), randomUtils.getCurrentAddress(), randomUtils.getPermanentAddress())
        );
    }

    @Tags({
            @Tag("web"),
            @Tag("Smock")
    })

    @MethodSource("methodSourceExampleTest")
    @DisplayName("Checking the filling of input fields")
    @ParameterizedTest(name = "{0} is specified for the full name, {1} is specified for the email, {2} is specified for the current address, {3} is specified for the actual residential address")
    void fieldFillingTest(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxFormPage
                .openPage()
                .checkThatTheSiteHasOpened("Text Box")
                .setFullName(fullName)
                .setEmail(email)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .clickSubmit()
                .checkValueFullNameOutput(fullName)
                .checkValueEmailOutput(email)
                .checkValueCurrentAddressOutput(currentAddress)
                .checkValuePermanentAddressOutput(permanentAddress);
    }
}
