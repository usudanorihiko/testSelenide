import org.junit.jupiter.api.Test

import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide.*
import com.codeborne.selenide.Selectors.*
import org.junit.jupiter.api.BeforeAll


class FirstTest {

    //以下のサンプルを利用
    //Selenide～Javaで超簡単・簡潔にUIテストを書く～
    //https://qiita.com/tatesuke/items/589e30ab9b3dc7037e26

    @Test
    fun test() {

        // Googleトップページ
        // "selenide"を検索
        open("https://www.google.co.jp/")
        `$`("input[type=text]").`val`("selenide").pressEnter()

        // 検索ページ
        // Selenideの公式ページをクリック
        `$`(byText("Selenide: concise UI tests in Java")).click()

        // Selenide公式ページ
        // 「What is Selenide?」という文言があることを確認
        `$`("body").shouldHave(text("What is Selenide?"))
    }

    // Selenideの初期設定サンプル
    companion object{ //Kotlinのvoid staticの際に必要
        @JvmStatic //Kotlinでstatic
        @BeforeAll //実行前に1回呼ばれる。JUnit4だと @BeforeClass
        fun beforeClass() {
            // タイムアウトの時間を5000ミリ秒にする(デフォルト:4000ミリ秒)
            //Configuration.timeout = 5000

            // ベースURLを変更する (デフォルト:http://localhost:8080)
            //Configuration.baseUrl = "http://localhost:8080/app"

            // レポート用のディレクトリを変更する -> うまく作動しなかった
            //Configuration.reportsFolder = "/var/selenide"

            // テスト実行後にブラウザを開いたままにする ->うまく作動した
            //Configuration.holdBrowserOpen = true

            // Chrome(要ドライバー) →のはずだが、設定もドライバーも無いのにChromeでテストできている。
            //Configuration.browser = WebDriverRunner.CHROME;
            //System.setProperty("webdriver.chrome.driver", "[パス]/chromedriver.exe");

            // IE(要ドライバー)
            //Configuration.browser = WebDriverRunner.INTERNET_EXPLORER;
            //System.setProperty("webdriver.ie.driver", "[パス]/IEDriverServer.exe");


        }
    }
}