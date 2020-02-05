import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Selenide.*

import org.junit.jupiter.api.Test

class PageObjectTest {

    //以下のサンプルを利用
    //Pageオブジェクトパターン Selenideのお作法
    //https://qiita.com/tatesuke/items/0bac60172e7cfd12aeb1

    @Test
    fun ページオブジェクトを利用してgoole検索を実施(){
        // テストコード
        val searchPage = open("https://www.google.co.jp/", GoogleSearchPage::class.java)
        val resultsPage = searchPage.search("selenide")
        resultsPage.results().shouldHaveSize(10)
        resultsPage.results().get(0).shouldHave(text("Selenide: Concise UI Tests in Java"))
        //println(resultsPage.results().get(0)) 一部省略して出力される?
    }

    @Test
    fun ページオプジォクトを利用して予約サイトを利用(){
        //Selinium用のテストサイトで予約をしてみる　
        val inputPage = open("http://example.selenium.jp/reserveApp/",ReserveInputPage::class.java)
        val confirmPage = inputPage.set("臼田")
        confirmPage.result().get(0).shouldHave(text("臼田"))

    }


}