import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.page
import org.openqa.selenium.By

class ReserveInputPage{
    fun set(onamae : String): ReserveConfirmPage {
        `$`(By.name("gname")).setValue(onamae)
        `$`(By.name("reserve_m")).setValue("2")
        `$`(By.id("goto_next")).pressEnter()
        return page(ReserveConfirmPage::class.java)
    }
}

