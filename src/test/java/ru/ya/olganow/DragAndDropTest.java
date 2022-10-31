package ru.ya.olganow;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
    void movingTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").hover();
        $("#column-a").dragAndDropTo($("#column-b"));
        $("div header").shouldHave(text("B"));

    }

}
