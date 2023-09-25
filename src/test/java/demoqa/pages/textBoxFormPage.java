package demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class textBoxFormPage {

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


    public textBoxFormPage openPage() {
        open("/text-box");

        return this;
    }

    public textBoxFormPage checkThatTheSiteHasOpened(String header) {
        formTitle.shouldHave(text(header));

        return this;
    }

    public textBoxFormPage setFullName(String value) {
        fullNameInput.setValue(value);

        return this;
    }

    public textBoxFormPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public textBoxFormPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public textBoxFormPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public textBoxFormPage clickSubmit() {
        buttonSubmit.click();

        return new textBoxFormPage();
    }

    public textBoxFormPage checkValueFullNameOutput(String value) {
        fullNameOutput.shouldHave(text(value));

        return this;
    }

    public textBoxFormPage checkValueEmailOutput(String value) {
        emailOutput.shouldHave(text(value));

        return this;
    }

    public textBoxFormPage checkValueCurrentAddressOutput(String value) {
        currentAddressOutput.shouldHave(text(value));

        return this;
    }

    public textBoxFormPage checkValuePermanentAddressOutput(String value) {
        permanentAddressOutput.shouldHave(text(value));

        return this;
    }
}
