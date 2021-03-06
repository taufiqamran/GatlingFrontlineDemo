package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Adol extends Simulation {

	val httpProtocol = http
		.baseUrl("https://orisoftst.orisoftsaas.com")
		.disableFollowRedirect
    val uri1 = "https://maps.googleapis.com/maps/api/js"
    val uri3 = "https://fonts.googleapis.com/css"

	val chain_0 =exec(http("load login")
			.get("/")
			.check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken")))
			.exec(http("request_0")
			.post("/Account/Login")
			.formParam("__RequestVerificationToken", "${__RequestVerificationToken}")
			.formParam("TIMEZONE_OFFSET", "480")
			.formParam("CUSTOMER_CODE$State", "{&quot;rawValue&quot;:&quot;orisoftgrp&quot;}")
			.formParam("CUSTOMER_CODE", "orisoftgrp")
			.formParam("USERID$State", "{&quot;rawValue&quot;:&quot;chon11040&quot;}")
			.formParam("USERID", "chon11040")
			.formParam("USERPWD$State", "{&quot;rawValue&quot;:&quot;123456&quot;}")
			.formParam("USERPWD", "123456")
			.formParam("selLanguage_VI", "")
			.formParam("selLanguage", "English")
			.formParam("selLanguage$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("selLanguage$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("selLanguage$DDD$L", "")
			.formParam("btnSignIn", "Sign In")
			.formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1")
			.formParam("DXCss", "/Content/bootstrap_styles.css,/Content/generic.light.custom.css,/Content/ResponsiveSite.css,/Content/font-style.css,/Content/login.css,1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317")
			.formParam("DXMVCEditorsValues", """{"CUSTOMER_CODE":"orisoftgrp","USERID":"chon11040","USERPWD":"123456","selLanguage_DDD_L":[],"selLanguage":null}""")
			.check(status.is(302)))
		.exec(http("request_1")
			.get("/Home/Dashboard")
			)
		.exec(http("request_2")
			.get("/DXR.axd?r=1_58-JQoum")
			)
		.exec(http("request_3")
			.get(uri3 + "?family=Open+Sans:300,400,600,700")
			)
		.exec(http("request_4")
			.get(uri3 + "?family=Roboto:400,300,500,700")
			)
		.exec(http("request_5")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-fRoum")
			)
		.pause(112.milliseconds)
		.exec(http("request_6")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_7")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_8")
			.get("/signalr/hubs")
			)
		.exec(http("request_9")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-fRoum&p=cdecb7bb")
			)
		.exec(http("request_10")
			.get("/profile_picture.ashx?EmployeeID=2")
			)
		.exec(http("request_11")
			.get("/Content/Images/unifiedhcms_logo.png?V=01")
			)
		.exec(http("request_12")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&v=quarterly")
			)
		.exec(http("request_13")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_14")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.pause(408.milliseconds)
		.exec(http("request_15")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_16")
			.get("/DXR.axd?r=0_2303-XQoum")
			)
		.exec(http("request_17")
			.get("/Notifications/GetNotificationCounts")
			)
		.exec(http("request_18")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_19")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=CHON11040&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1625115696366")
			)
		.pause(1)
		.exec(http("request_20")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=CHON11040&connectionToken=CJChU6TlwRJmY0KSajOXYPjYkNbJtby4mkWMEaPC%2FCxTe8NdJd%2B0ZZB7BNYQ0tcP3rcU188%2F0ZEM0%2FktFjI%2FcuuAUSU4VIttMlaxnolbmSje805xofCk7CDhLZOM6YyH6GoBXX%2BK%2Fc%2B3EfHTCtmPXKhwnWT4DYh9wddLou32eew%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1625115696367")
			)
		.exec(http("request_21")
			.get("/PayrollProcess/ProcessControlPanel")
			)
		.exec(http("request_22")
			.get("/GlobalLeaveApplication/GlobalLeaveApplicationCriteria")
			)
		.exec(http("request_23")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttp%3A%2F%2Flocalhost%3A37953%2FHome%2FDashboard&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._z5x7ct&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=69442")
			)
		.exec(http("request_24")
			.get("/SalaryAdvanceProcess/ProcessControlPanel")
			)
		.exec(http("request_25")
			.get("/Home/DashboardWidgetPartial")
			)
		.exec(http("request_26")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_27")
			.get("/DXR.axd?r=0_2223-XQoum")
			)
		.exec(http("request_28")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_29")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_30")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_31")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_32")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_33")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_34")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_35")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_36")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_37")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_38")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_39")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_40")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_41")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_42")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_43")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_44")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_45")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_46")
			.get("/profile_picture.ashx?EmployeeID=587")
			)
		.exec(http("request_47")
			.get("/profile_picture.ashx?EmployeeID=23")
			)
		.exec(http("request_48")
			.get("/profile_picture.ashx?EmployeeID=949")
			)
		.exec(http("request_49")
			.get("/profile_picture.ashx?EmployeeID=943")
			)
		.exec(http("request_50")
			.get("/profile_picture.ashx?EmployeeID=954")
			)
		.exec(http("request_51")
			.post("/GetLeaveJson")
			
			.formParam("leaveType", "0")
			.formParam("nShowSubord", "1")
			.formParam("nShowSubordInd", "0")
			.formParam("dateFrom", "2021-06-27")
			.formParam("dateTo", "2021-08-08")
			.formParam("start", "2021-06-27")
			.formParam("end", "2021-08-08"))
		.exec(http("request_52")
			.get("/profile_picture.ashx?EmployeeID=922")
			)
		.exec(http("request_53")
			.post("/GetLeaveJson")
			
			.formParam("leaveType", "1")
			.formParam("nShowSubord", "1")
			.formParam("nShowSubordInd", "0")
			.formParam("dateFrom", "2021-06-27")
			.formParam("dateTo", "2021-08-08")
			.formParam("start", "2021-06-27")
			.formParam("end", "2021-08-08"))
		.exec(http("request_54")
			.post("/GetLeaveJson")
			
			.formParam("leaveType", "2")
			.formParam("nShowSubord", "1")
			.formParam("nShowSubordInd", "0")
			.formParam("dateFrom", "2021-06-27")
			.formParam("dateTo", "2021-08-08")
			.formParam("start", "2021-06-27")
			.formParam("end", "2021-08-08"))
		.exec(http("request_55")
			.get("/profile_picture.ashx?EmployeeID=813")
			)
		.exec(http("request_56")
			.get("/profile_picture.ashx?EmployeeID=820")
			)
		.exec(http("request_57")
			.get("/profile_picture.ashx?EmployeeID=1")
			)
		.exec(http("request_58")
			.post("/GetHolidayJson")
			
			.formParam("dateFrom", "2021-06-27")
			.formParam("dateTo", "2021-08-08")
			.formParam("start", "2021-06-27")
			.formParam("end", "2021-08-08"))
		.exec(http("request_59")
			.get("/profile_picture.ashx?EmployeeID=1383")
			)
		.exec(http("request_60")
			.get("/profile_picture.ashx?EmployeeID=933")
			)
		.exec(http("request_61")
			.get("/profile_picture.ashx?EmployeeID=1385")
			)
		.exec(http("request_62")
			.get("/PayrollTransaction/Index")
			)
		.exec(http("request_63")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-fRoum&p=cdecb7bb")
			)
		.exec(http("request_64")
			.get("/Content/Images/unifiedhcms_logo.png?V=01")
			)
		.exec(http("request_65")
			.get("/DXR.axd?r=1_58-JQoum")
			)
		.exec(http("request_66")
			.get("/profile_picture.ashx?EmployeeID=2")
			)
		.exec(http("request_67")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&v=quarterly")
			)
		.exec(http("request_68")
			.get(uri3 + "?family=Open+Sans:300,400,600,700")
			)
		.exec(http("request_69")
			.get(uri3 + "?family=Roboto:400,300,500,700")
			)
		.exec(http("request_70")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-fRoum")
			)
		.exec(http("request_71")
			.get("/signalr/hubs")
			)
		.pause(180.milliseconds)
		.exec(http("request_72")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.pause(718.milliseconds)
		.exec(http("request_73")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.pause(485.milliseconds)
		.exec(http("request_74")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.pause(144.milliseconds)
		.exec(http("request_75")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_76")
			.get("/DXR.axd?r=0_2314-XQoum")
			)
		.exec(http("request_77")
			.get("/DXR.axd?r=0_2216-XQoum")
			)
		.exec(http("request_78")
			.get("/DXR.axd?r=0_2316-XQoum")
			)
		.pause(125.milliseconds)
		.exec(http("request_79")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_80")
			.get("/DXR.axd?r=0_2303-XQoum")
			)
		.exec(http("request_81")
			.post("/PayrollTransaction/ComboBoxDisplay")
			
			.formParam("objectLabel", "PayPeriod")
			.formParam("comboBoxValue", ""))
		.exec(http("request_82")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_83")
			.post("/PayrollTransaction/CheckBoxListDisplay")
			
			.formParam("objectLabel", "EmployeeStatus")
			.formParam("objectSelectedIds[]", "A"))
		.pause(359.milliseconds)
		.exec(http("request_84")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))
		.exec(http("request_85")
			.get("/Notifications/GetNotificationCounts")
			)
		.exec(http("request_86")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_87")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=CHON11040&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1625115721251")
			)
		.pause(645.milliseconds)
		.exec(http("request_88")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=CHON11040&connectionToken=S8MUdbXC9yBnVlWh6lf4w4jGMVnV8YnfL0pBmc4cfeg1SMZjKp%2B9bP9fU%2BHJ1vACH8a2BNgC1%2FyBRqZYqPr10Wjy8UZtAIZK%2BzI3kAJtk3xHknViyPGVpoGfpUGSMzAX7Ft6RSY15E7aPObk0d5GSKrNQhlGo0yRCUjWFAvKvVI%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1625115721252")
			)
		.pause(1)

val chain_1 = exec(http("request_89")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_90")
			.post("/PayrollTransaction/ComboBoxDisplay")
			
			.formParam("objectLabel", "PayPeriod")
			.formParam("comboBoxValue", "54"))
		.pause(882.milliseconds)
		.exec(http("request_91")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttp%3A%2F%2Flocalhost%3A37953%2FPayrollTransaction%2FIndex&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._171ob5&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=101680")
			)
		.pause(701.milliseconds)
		.exec(http("request_92")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_93")
			.post("/PayrollTransaction/PartialTabEmployee")
			
			.formParam("Customsearchparameters[0][Name]", "PayPeriod")
			.formParam("Customsearchparameters[0][Value]", "54")
			.formParam("Customsearchparameters[1][Name]", "EmployeeStatus")
			.formParam("Customsearchparameters[1][Value]", "A")
			.formParam("StartsWith", "all"))
		.exec(http("request_94")
			.get("/DXR.axd?r=0_2321-XQoum")
			)
		.exec(http("request_95")
			.get("/DXR.axd?r=0_2223-XQoum")
			)
		.pause(140.milliseconds)
		.exec(http("request_96")
			.get("/Account/VerifyAccess")
			)
		.exec(http("request_97")
			.get("/PayrollTransaction/PartialPayrollTransactionGridview?EmploymentPrimaryId=1664&PayPeriodId=54")
			.check(regex("'callbackState':'(.+?)'").saveAs("callback"))
			.check(regex("'keys':\\[(.+?)[^\\]]]").saveAs("arrayKey"))
			.check(regex("\\{'([0-9]+)':\\{(.+?),'17':'0','18':0\\}").findAll.saveAs("rowId"))
			//.check(regex(",'${rowId(0)}':\\{(.+?),'17':'0',").saveAs("editRow"))
			.check(regex("'cpRecordsXML':'(.+?)'")saveAs("recordXml"))
			)
	.exec(session => {
		val arrayKey = session("arrayKey").as[String]
		val id = session("rowId").as[String]
		//val editRow = session("editRow").as[String]

		println(s"Array $arrayKey")

		println(s"Id $id")

		//println(s"Edit $editRow")

		session
	})
		.pause(13)
		.exec(http("request_98")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_99")
			.post("/PayrollTransaction/GetAmountByQtyRate")
			
			.formParam("TrxType", "A")
			.formParam("TrxCode", "36")
			.formParam("Qty", "1")
			.formParam("Rate", "30")
			.formParam("EmploymentPrimaryId", "1664")
			.formParam("PayPeriodID", "54")
			.formParam("TrxDate", "2021/07/01")
			.formParam("EffectiveDate", "2021/07/02"))
		.exec(http("request_100")
			.post("/PayrollTransaction/BatchUpdateTransaction?EmploymentPrimaryId=1664&PayPeriodId=54")
			.formParam("DXCallbackName", "gvTransaction")
			.formParam("__DXCallbackArgument", """c0:KV|8;["${key}"];GB|13;10|UPDATEEDIT;""")
			.formParam("gvTransaction", "{&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[],&quot;InsertedValues&quot;:{},&quot;UpdatedValues&quot;:{&quot;1159&quot;:{&quot;5&quot;:[new Date(2021,6,2,12,54,14,467),&quot;09/07/2021&quot;,false]}},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{},&quot;modifiedRowValues&quot;:{&quot;1159&quot;:{&quot;TRX_TYPE&quot;:&quot;A&quot;,&quot;TRX_CODE&quot;:&quot;36&quot;,&quot;V_TRANSACTIONS.SHORT_DESCRIPTION&quot;:&quot;Angpow&quot;,&quot;TRX_DATE&quot;:&quot;07/01/2021 12:54:14.467&quot;,&quot;EFFECTIVE_DATE&quot;:&quot;07/04/2021 12:54:14.467&quot;,&quot;QTY&quot;:&quot;1&quot;,&quot;RATE&quot;:&quot;30&quot;,&quot;CURRENCY_CODE&quot;:&quot;MYR&quot;,&quot;ORI_AMOUNT&quot;:&quot;0&quot;,&quot;BASE_CURRENCY&quot;:&quot;MYR&quot;,&quot;EXCHANGE_RATE&quot;:&quot;1&quot;,&quot;AMOUNT&quot;:&quot;0&quot;,&quot;OPTION_FLAG&quot;:&quot;PY&quot;,&quot;COST_CENTER_CODE&quot;:&quot;&quot;,&quot;CREATED_BY&quot;:&quot;CHON11040&quot;,&quot;CREATED_DATE&quot;:&quot;07/01/2021 12:55:15.917&quot;,&quot;STATUS_CODE&quot;:&quot;0&quot;,&quot;recalculate_flag&quot;:&quot;0 &quot;}},&quot;deletedRowKeys&quot;:[]}},&quot;selection&quot;:&quot;&quot;,&quot;callbackState&quot;:&quot;${callback}&quot;,&quot;scrollState&quot;:[0,0],&quot;keys&quot;:[&quot;1159&quot;]}")
			.formParam("gvTransaction$DXEditor5$State", "{&quot;rawValue&quot;:&quot;1625230454467&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor5", "02/07/2021")
			.formParam("gvTransaction$DXEditor5$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:639:276:1:::1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor5$DDD$C", "{&quot;visibleDate&quot;:&quot;07/01/2021&quot;,&quot;initialVisibleDate&quot;:&quot;07/01/2021&quot;,&quot;selectedDates&quot;:[&quot;07/02/2021&quot;]}")
			.formParam("gvTransaction$DXEditor5$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor1$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction_DXEditor1_VI", "A")
			.formParam("gvTransaction$DXEditor1", "Allowance")
			.formParam("gvTransaction$DXEditor1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor1$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor1$DDD$L", "A")
			.formParam("gvTransaction$DXEditor2$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction_DXEditor2_VI", "36")
			.formParam("gvTransaction$DXEditor2", "36")
			.formParam("gvTransaction$DXEditor2$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor2$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor2$DDD$L", "")
			.formParam("gvTransaction$DXEditor3$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor3", "Angpow")
			.formParam("gvTransaction$DXEditor4$State", "{&quot;rawValue&quot;:&quot;1625144054467&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor4", "01/07/2021")
			.formParam("gvTransaction$DXEditor4$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor4$DDD$C", "{&quot;visibleDate&quot;:&quot;07/01/2021&quot;,&quot;initialVisibleDate&quot;:&quot;07/01/2021&quot;,&quot;selectedDates&quot;:[]}")
			.formParam("gvTransaction$DXEditor4$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor6$State", "{&quot;rawValue&quot;:&quot;1.00&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor6", "1.00")
			.formParam("gvTransaction$DXEditor7$State", "{&quot;rawValue&quot;:&quot;30.00&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor7", "30.00")
			.formParam("gvTransaction$DXEditor8$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction_DXEditor8_VI", "MYR")
			.formParam("gvTransaction$DXEditor8", "MYR")
			.formParam("gvTransaction$DXEditor8$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor8$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor8$DDD$L", "MYR")
			.formParam("gvTransaction$DXEditor9$State", "{&quot;rawValue&quot;:&quot;0&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor9", "0.00")
			.formParam("gvTransaction$DXEditor10$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction_DXEditor10_VI", "MYR")
			.formParam("gvTransaction$DXEditor10", "MYR")
			.formParam("gvTransaction$DXEditor10$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor10$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor10$DDD$L", "MYR")
			.formParam("gvTransaction$DXEditor11$State", "{&quot;rawValue&quot;:&quot;1&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor11", "1.000000")
			.formParam("gvTransaction$DXEditor12$State", "{&quot;rawValue&quot;:&quot;0&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor12", "0.00")
			.formParam("gvTransaction$DXEditor13$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction_DXEditor13_VI", "PY")
			.formParam("gvTransaction$DXEditor13", "Payroll Transaction")
			.formParam("gvTransaction$DXEditor13$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor13$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor13$DDD$L", "PY")
			.formParam("gvTransaction$DXEditor14$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction_DXEditor14_VI", "")
			.formParam("gvTransaction$DXEditor14", "")
			.formParam("gvTransaction$DXEditor14$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor14$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor14$DDD$L", "")
			.formParam("gvTransaction$DXEditor15$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor15", "CHON11040")
			.formParam("gvTransaction$DXEditor16$State", "{&quot;rawValue&quot;:&quot;1625144115917&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor16", "01/07/2021")
			.formParam("gvTransaction$DXEditor16$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor16$DDD$C", "{&quot;visibleDate&quot;:&quot;07/01/2021&quot;,&quot;initialVisibleDate&quot;:&quot;07/01/2021&quot;,&quot;selectedDates&quot;:[]}")
			.formParam("gvTransaction$DXEditor16$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvTransaction$DXEditor17$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor17", "U")
			.formParam("gvTransaction$DXEditor18$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvTransaction$DXEditor18", "C")
			.formParam("DXMVCEditorsValues", """{"PayPeriod_DDD_L":["54"],"PayPeriod":"54","EmployeeStatus":["A"],"gvEmployee_DXFREditorcol1":null,"gvEmployee_DXFREditorcol2":null,"gvEmployee_DXFREditorcol3_DDD_L":[],"gvEmployee_DXFREditorcol3":null,"gvEmployee_DXFREditorcol4_DDD_L":[],"gvEmployee_DXFREditorcol4":null,"gvEmployee_DXFREditorcol5_DDD_L":[],"gvEmployee_DXFREditorcol5":null,"gvEmployee_DXFREditorcol6":null,"gvEmployee_DXFREditorcol7":null,"gvTransaction_DXEditor1_DDD_L":["A"],"gvTransaction_DXEditor1":"A","gvTransaction_DXEditor2_DDD_L":[],"gvTransaction_DXEditor2":"36","gvTransaction_DXEditor3":"Angpow","gvTransaction_DXEditor4":new Date(2021,6,1,12,54,14,467),"gvTransaction_DXEditor5":new Date(2021,6,2,12,54,14,467),"gvTransaction_DXEditor6":"1.00","gvTransaction_DXEditor7":"30.00","gvTransaction_DXEditor8_DDD_L":["MYR"],"gvTransaction_DXEditor8":"MYR","gvTransaction_DXEditor9":"0","gvTransaction_DXEditor10_DDD_L":["MYR"],"gvTransaction_DXEditor10":"MYR","gvTransaction_DXEditor11":"1","gvTransaction_DXEditor12":"0","gvTransaction_DXEditor13_DDD_L":["PY"],"gvTransaction_DXEditor13":"PY","gvTransaction_DXEditor14_DDD_L":[],"gvTransaction_DXEditor14":null,"gvTransaction_DXEditor15":"CHON11040","gvTransaction_DXEditor16":new Date(2021,6,1,12,55,15,917),"gvTransaction_DXEditor17":"0","gvTransaction_DXEditor18":0}""")
			.formParam("DXMVCBatchEditingValuesRequestKey", "gvTransaction")
			.formParam("DXMVCBatchEditingKeyFieldName", "ID")
			.formParam("RECORDSXML", "${recordXml}")
			.check(bodyString.saveAs("bodySave"))
		)
		.exec(session => {

			val body = session("bodySave").as[String]
			println(s"Body $body")
			session
		})
		.pause(161.milliseconds)
		.exec(http("request_101")
			.get("/Content/fonts/icomoon.ttf?5vru0d"))

	val scn = scenario("Adol").exec(
		chain_0, chain_1)

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}