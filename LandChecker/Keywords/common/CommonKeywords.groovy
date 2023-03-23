package common
import java.text.SimpleDateFormat

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class CommonKeywords {

	public static String uniqueNumber = ""

	@Keyword
	public static TestObject getTestObjectByDyanmicXpath(String xpath) {
		return new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath)
	}
}
