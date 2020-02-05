
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide.`$$`
import org.openqa.selenium.By

// 検索結果ページのPageオブジェクト
class GoogleResultsPage {
    fun results(): ElementsCollection {
        //return `$$`("#res .g")
        return `$$`(By.className("g"))
    }
}