package org.selenide.examples.google.selenide_straightforward;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
  @Test
  public void search_selenide_in_google() {
    open("http://www.baidu.com/");
    $(By.name("wd")).val("selenide").pressEnter();
    $$("#ires .g").shouldHave(sizeGreaterThan(1));
    $("#ires .g").shouldBe(visible).shouldHave(
        text("Selenide: concise UI tests in Java"),
        text("selenide.org"));
  }
}
