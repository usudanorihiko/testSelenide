import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide.`$$`
import com.codeborne.selenide.Selenide.`$`
import org.openqa.selenium.By

class ReserveConfirmPage {
    fun result() : ElementsCollection{
        //return `$`(By.name("gname")) //TODO 単数で返す方法を調べる
        return `$$`(By.id("gname"))
    }
}