package org.selenide.examples.google.selenide_page_object;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
  public ElementsCollection getResults() {
    return $$("#content_left .t");
  }
  public SelenideElement getResult(int index) {
    return $("#content_left .t", index);
  }
}
