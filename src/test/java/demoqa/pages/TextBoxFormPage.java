package demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxFormPage {

    SelenideElement
            formTitle = $(".main-header"),
            fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            buttonSubmit = $("#submit"),
            fullNameOutput = $("#output #name"),
            emailOutput = $("#output #email"),
            currentAddressOutput = $("#output #currentAddress"),
            permanentAddressOutput = $("#output #permanentAddress");


    public TextBoxFormPage openPage() {
        open("/text-box");

        return this;
    }

    public TextBoxFormPage checkThatTheSiteHasOpened(String header) {
        formTitle.shouldHave(text(header));

        return this;
    }

    public TextBoxFormPage setFullName(String value) {
        fullNameInput.setValue(value);

        return this;
    }

    public TextBoxFormPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public TextBoxFormPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxFormPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxFormPage clickSubmit() {
        buttonSubmit.click();

        return new TextBoxFormPage();
    }

    public TextBoxFormPage checkValueFullNameOutput(String value) {
        fullNameOutput.shouldHave(text(value));

        return this;
    }

    public TextBoxFormPage checkValueEmailOutput(String value) {
        emailOutput.shouldHave(text(value));

        return this;
    }

    public TextBoxFormPage checkValueCurrentAddressOutput(String value) {
        currentAddressOutput.shouldHave(text(value));

        return this;
    }

    public TextBoxFormPage checkValuePermanentAddressOutput(String value) {
        permanentAddressOutput.shouldHave(text(value));

        return this;
    }
}
