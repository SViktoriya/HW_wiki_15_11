package quru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideFindSoftAssertionsTest {

    @Test
    void findSoftAssertions() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").submit();
        $$(".repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $(".wiki-more-pages-link").$("button").click();
        $("[data-filterable-for='wiki-pages-filter']").shouldHave(text("SoftAssertions"));
        $("a[href$='SoftAssertions']").click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));

    }

}
