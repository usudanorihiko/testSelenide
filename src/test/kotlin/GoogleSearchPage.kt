
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.page
import org.openqa.selenium.By

// 検索ページのPageオブジェクト
class GoogleSearchPage {
    fun search(query: String): GoogleResultsPage {
        `$`(By.name("q")).setValue(query).pressEnter()
        return page(GoogleResultsPage::class.java)
    }
}