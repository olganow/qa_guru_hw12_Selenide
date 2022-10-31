package ru.ya.olganow;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubSolutionTest {

    @Test
    void issueSearchForMyRep() {
        
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Teams")).click();
        $("h1 p").shouldHave(text("GITHUB FOR TEAMS"));

    }

}
