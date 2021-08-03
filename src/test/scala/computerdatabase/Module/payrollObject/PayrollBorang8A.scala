package computerdatabase.Module.payrollObject

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object PayrollBorang8A {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {
    exec(http("Borang 8A Page")
			.get("/Report/Borang8AReport")
			.check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
			)
		.exec(http("request_73")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.exec(http("request_74")
			.get("/signalr/hubs")
			)
		.pause(835.milliseconds)
		.exec(http("request_75")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
			)
		.exec(http("request_76")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
			)
		.exec(http("request_77")
			.get("/DXR.axd?r=0_2314-O3Vxm")
			)
		.exec(http("request_78")
			.get("/DXR.axd?r=0_2216-O3Vxm")
			)
		.exec(http("request_79")
			.get("/DXR.axd?r=0_2316-O3Vxm")
			)
		.pause(238.milliseconds)
		.exec(http("request_80")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_81")
			.get("/DXR.axd?r=0_2303-O3Vxm")
			)
		.exec(http("request_82")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_83")
			.post("/Borang8AReport/ComboBoxDisplay")
			
			.formParam("objectLabel", "PayrollMonth")
			.formParam("comboBoxValue", "6"))
		.exec(http("request_84")
			.post("/Borang8AReport/ComboBoxDisplay")
			
			.formParam("objectLabel", "EMPLOYER_AGENCY_ID")
			.formParam("comboBoxValue", ""))
		.exec(http("request_85")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_86")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_87")
			.post("/Borang8AReport/CheckBoxListDisplay")
			
			.formParam("objectLabel", "EmployeeStatus")
			.formParam("objectSelectedIds[]", "A")
			.formParam("objectSelectedIds[]", "L")
			.formParam("objectSelectedIds[]", "I"))
		.exec(http("request_88")
			.post("/Borang8AReport/CascadeComboBoxDisplay")
			
			.formParam("objectLabel", "PayPeriod")
			.formParam("isAllSelected", "false"))
		.exec(http("request_89")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_90")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_91")
			.post("/Borang8AReport/ComboBoxDisplay")
			
			.formParam("objectLabel", "PAY_BY")
			.formParam("comboBoxValue", "Q"))
		.pause(158.milliseconds)
		.exec(http("request_92")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_93")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622521412372")
			)
		.exec(http("request_94")
			.post("/Borang8AReport/CheckBoxListDisplay")
			
			.formParam("objectLabel", "Option")
			.formParam("objectSelectedIds[]", "1"))
		.exec(http("request_95")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=0iHRR8tTZlp4OqrQ0QrGCiodT7q5avnO8CEqJG%2FnAdwYW87NtZSTZumNeC5wsuNmg7pS6%2FUfPgcCAmv%2BVuw9BqdMHxcDumbbKjwYfKONNKxsD5MLZ5kkW%2F6i%2FaxgOltfNJ2GdsVSvrqIGLT3NfzDTAJtXZLHsGMQglJMOOc11Po%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622521412373")
			)
		.exec(http("request_96")
			.get("/Notifications/GetNotificationCounts")
			)
		.pause(2)
		.exec(http("request_97")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_98")
			.post("/Borang8AReport/ComboBoxDisplay")
			
			.formParam("objectLabel", "EMPLOYER_AGENCY_ID")
			.formParam("comboBoxValue", "79"))
		.exec(http("request_99")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_100")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FReport%2FBorang8AReport&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._efec96&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=78122")
			)
		.exec(http("request_101")
			.post("/Borang8AReport/GetCascadeChildDropdown")
			
			.formParam("criteriaObject[Type]", "CascadeComboBox")
			.formParam("criteriaObject[Name]", "PayPeriod")
			.formParam("criteriaObject[Label]", "PayPeriod")
			.formParam("criteriaObject[GroupId]", "1")
			.formParam("criteriaObject[IsRequired]", "False")
			.formParam("criteriaObject[CascadeDropDownListProperties][TextField]", "PAY_PERIOD_DESCRIPTION")
			.formParam("criteriaObject[CascadeDropDownListProperties][ValueField]", "ID")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterField]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][0][ParameterName]", "EmployerAgencySOCSO")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][0][FilterField]", "LOCATION_ID")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][0][FilterOperator]", "0")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][0][TargetDatasourceName]", "SocsoEmployerAgencyNo")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][0][TargetDatasourceProperty]", "ID")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][1][ParameterName]", "PayMonths")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][1][FilterField]", "PAYROLL_MONTH")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][1][FilterOperator]", "0")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][1][TargetDatasourceName]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][1][TargetDatasourceProperty]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][2][ParameterName]", "PayrollYear")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][2][FilterField]", "PAYROLL_YEAR")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][2][FilterOperator]", "0")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][2][TargetDatasourceName]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][FilterFieldList][2][TargetDatasourceProperty]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][DatasourceName]", "PayPeriods")
			.formParam("criteriaObject[CascadeDropDownListProperties][DisplayFormatString]", "{0}")
			.formParam("criteriaObject[CascadeDropDownListProperties][SourceFrom]", "0")
			.formParam("criteriaObject[CascadeDropDownListProperties][DefaultIndex]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][0][Name]", "PAY_PERIOD_DESCRIPTION")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][0][Label]", "PayPeriod")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][0][Width]", "250")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][0][ColumnDisplayFormatString]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][1][Name]", "COMPANY.LOCATION_CODE")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][1][Label]", "Company")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][1][Width]", "50")
			.formParam("criteriaObject[CascadeDropDownListProperties][ColumnsList][1][ColumnDisplayFormatString]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][CascadeControl]", "")
			.formParam("criteriaObject[CascadeDropDownListProperties][LoadOnDemand]", "true")
			.formParam("criteriaObject[CascadeDropDownListProperties][SelectAllMode]", "true")
			.formParam("criteriaObject[CascadeDropDownListProperties][DefaultSelectAll]", "true")
			.formParam("criteriaObject[CascadeDropDownListProperties][IsMultiSelection]", "true")
			.formParam("criteriaObject[CascadeDropDownListProperties][SelectedIndexChangedJsCallBack2]", "")
			.formParam("ParentId", "")
			.formParam("CustomSearchParameters[0][Name]", "EmployerAgencySOCSO")
			.formParam("CustomSearchParameters[0][Value]", "79")
			.formParam("CustomSearchParameters[1][Name]", "PayrollYear")
			.formParam("CustomSearchParameters[1][Value]", "2021")
			.formParam("CustomSearchParameters[2][Name]", "PayMonths")
			.formParam("CustomSearchParameters[2][Value]", "6")
			.formParam("CustomSearchParameters[3][Name]", "PayPeriod")
			.formParam("CustomSearchParameters[3][Value]", "")
			.formParam("CustomSearchParameters[4][Name]", "EmployeeStatus")
			.formParam("CustomSearchParameters[4][Value]", "A,L,I")
			.formParam("CustomSearchParameters[5][Name]", "Option")
			.formParam("CustomSearchParameters[5][Value]", "1")
			.formParam("CustomSearchParameters[6][Name]", "Location")
			.formParam("CustomSearchParameters[6][Value]", "")
			.formParam("CustomSearchParameters[7][Name]", "LevelRanges")
			.formParam("CustomSearchParameters[7][Value]", "|||||||||")
			.formParam("CustomSearchParameters[8][Name]", "Category")
			.formParam("CustomSearchParameters[8][Value]", "")
			.formParam("CustomSearchParameters[9][Name]", "Grade")
			.formParam("CustomSearchParameters[9][Value]", "")
			.formParam("CustomSearchParameters[10][Name]", "Employee")
			.formParam("CustomSearchParameters[10][Value]", "")
			.formParam("CustomSearchParameters[11][Name]", "HireDateFrom")
			.formParam("CustomSearchParameters[11][Value]", "")
			.formParam("CustomSearchParameters[12][Name]", "HireDateTo")
			.formParam("CustomSearchParameters[12][Value]", "")
			.formParam("CustomSearchParameters[13][Name]", "TerminationDateFrom")
			.formParam("CustomSearchParameters[13][Value]", "")
			.formParam("CustomSearchParameters[14][Name]", "TerminationDateTo")
			.formParam("CustomSearchParameters[14][Value]", "")
			.formParam("CustomSearchParameters[15][Name]", "PaymentMode")
			.formParam("CustomSearchParameters[15][Value]", "Q")
			.formParam("CustomSearchParameters[16][Name]", "ReferenceNo")
			.formParam("CustomSearchParameters[16][Value]", ""))
		.exec(http("request_102")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_103")
			.post("/Borang8AReport/CascadeComboBoxDisplay")
			
			.formParam("objectLabel", "PayPeriod")
			.formParam("objectSelectedIds[]", "351")
			.formParam("isAllSelected", "true"))
		.pause(2)
		.exec(http("request_104")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_105")
			.post("/Report/GenerateXtraReport")
			
			.formParam("CustomSearchParameters[0][Name]", "EmployerAgencySOCSO")
			.formParam("CustomSearchParameters[0][Value]", "79")
			.formParam("CustomSearchParameters[1][Name]", "PayrollYear")
			.formParam("CustomSearchParameters[1][Value]", "2021")
			.formParam("CustomSearchParameters[2][Name]", "PayMonths")
			.formParam("CustomSearchParameters[2][Value]", "6")
			.formParam("CustomSearchParameters[3][Name]", "PayPeriod")
			.formParam("CustomSearchParameters[3][Value]", "351")
			.formParam("CustomSearchParameters[4][Name]", "EmployeeStatus")
			.formParam("CustomSearchParameters[4][Value]", "A,L,I")
			.formParam("CustomSearchParameters[5][Name]", "Option")
			.formParam("CustomSearchParameters[5][Value]", "1")
			.formParam("CustomSearchParameters[6][Name]", "Location")
			.formParam("CustomSearchParameters[6][Value]", "")
			.formParam("CustomSearchParameters[7][Name]", "LevelRanges")
			.formParam("CustomSearchParameters[7][Value]", "|||||||||")
			.formParam("CustomSearchParameters[8][Name]", "Category")
			.formParam("CustomSearchParameters[8][Value]", "")
			.formParam("CustomSearchParameters[9][Name]", "Grade")
			.formParam("CustomSearchParameters[9][Value]", "")
			.formParam("CustomSearchParameters[10][Name]", "Employee")
			.formParam("CustomSearchParameters[10][Value]", "")
			.formParam("CustomSearchParameters[11][Name]", "HireDateFrom")
			.formParam("CustomSearchParameters[11][Value]", "")
			.formParam("CustomSearchParameters[12][Name]", "HireDateTo")
			.formParam("CustomSearchParameters[12][Value]", "")
			.formParam("CustomSearchParameters[13][Name]", "TerminationDateFrom")
			.formParam("CustomSearchParameters[13][Value]", "")
			.formParam("CustomSearchParameters[14][Name]", "TerminationDateTo")
			.formParam("CustomSearchParameters[14][Value]", "")
			.formParam("CustomSearchParameters[15][Name]", "PaymentMode")
			.formParam("CustomSearchParameters[15][Value]", "Q")
			.formParam("CustomSearchParameters[16][Name]", "ReferenceNo")
			.formParam("CustomSearchParameters[16][Value]", "")
			.formParam("ReportObjectTypeName", "Reports.Statutory.Borang8AReport"))
		.pause(173.milliseconds)
		.exec(http("request_106")
			.get("/DXR.axd?r=24_367-N3Vxm")
			)
		.pause(164.milliseconds)
		.exec(http("request_107")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "startBuild")
			.formParam("arg", "%7B%22reportId%22%3A%22f205e6adc8dd4b549b03dfc6e593d3b4%22%2C%22reportUrl%22%3A%22%22%2C%22drillDownKeys%22%3A%5B%5D%2C%22sortingState%22%3A%5B%5D%2C%22timeZoneOffset%22%3A480%2C%22parameters%22%3A%5B%5D%7D"))
		.pause(392.milliseconds)
		.exec(http("request_108")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getBuildStatus")
			.formParam("arg", "%7B%22documentId%22%3A%225599ca9b33664b11bb70e8599fc62c9f%22%2C%22timeOut%22%3A120000%7D"))
		.pause(293.milliseconds)
		.exec(http("request_109")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getBuildStatus")
			.formParam("arg", "%7B%22documentId%22%3A%225599ca9b33664b11bb70e8599fc62c9f%22%2C%22timeOut%22%3A120000%7D"))
		.exec(http("request_110")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getDocumentData")
			.formParam("arg", "5599ca9b33664b11bb70e8599fc62c9f"))
/*		.exec(http("request_111")
			.get("/Report/DXXRDV.axd?actionKey=getPage&unifier=79d3a96c-181e-1311-363a-00a3284b104c&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%225599ca9b33664b11bb70e8599fc62c9f%22%2C%22resolution%22%3A96%7D")
			)*/
		.exec(http("request_112")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getBrickMap")
			.formParam("arg", "%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%225599ca9b33664b11bb70e8599fc62c9f%22%7D"))
/*		.exec(http("request_113")
			.get("/Report/DXXRDV.axd?actionKey=getPage&unifier=79d3a96c-181e-1311-363a-00a3284b104c&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%225599ca9b33664b11bb70e8599fc62c9f%22%2C%22resolution%22%3A85%7D")
			)*/

		.pause(1)
		.exec(http("request_114")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_115")
			.post("/Report/GenerateXtraReport")
			
			.formParam("CustomSearchParameters[0][Name]", "EmployerAgencySOCSO")
			.formParam("CustomSearchParameters[0][Value]", "79")
			.formParam("CustomSearchParameters[1][Name]", "PayrollYear")
			.formParam("CustomSearchParameters[1][Value]", "2021")
			.formParam("CustomSearchParameters[2][Name]", "PayMonths")
			.formParam("CustomSearchParameters[2][Value]", "6")
			.formParam("CustomSearchParameters[3][Name]", "PayPeriod")
			.formParam("CustomSearchParameters[3][Value]", "351")
			.formParam("CustomSearchParameters[4][Name]", "EmployeeStatus")
			.formParam("CustomSearchParameters[4][Value]", "A,L,I")
			.formParam("CustomSearchParameters[5][Name]", "Option")
			.formParam("CustomSearchParameters[5][Value]", "1")
			.formParam("CustomSearchParameters[6][Name]", "Location")
			.formParam("CustomSearchParameters[6][Value]", "")
			.formParam("CustomSearchParameters[7][Name]", "LevelRanges")
			.formParam("CustomSearchParameters[7][Value]", "|||||||||")
			.formParam("CustomSearchParameters[8][Name]", "Category")
			.formParam("CustomSearchParameters[8][Value]", "")
			.formParam("CustomSearchParameters[9][Name]", "Grade")
			.formParam("CustomSearchParameters[9][Value]", "")
			.formParam("CustomSearchParameters[10][Name]", "Employee")
			.formParam("CustomSearchParameters[10][Value]", "")
			.formParam("CustomSearchParameters[11][Name]", "HireDateFrom")
			.formParam("CustomSearchParameters[11][Value]", "")
			.formParam("CustomSearchParameters[12][Name]", "HireDateTo")
			.formParam("CustomSearchParameters[12][Value]", "")
			.formParam("CustomSearchParameters[13][Name]", "TerminationDateFrom")
			.formParam("CustomSearchParameters[13][Value]", "")
			.formParam("CustomSearchParameters[14][Name]", "TerminationDateTo")
			.formParam("CustomSearchParameters[14][Value]", "")
			.formParam("CustomSearchParameters[15][Name]", "PaymentMode")
			.formParam("CustomSearchParameters[15][Value]", "Q")
			.formParam("CustomSearchParameters[16][Name]", "ReferenceNo")
			.formParam("CustomSearchParameters[16][Value]", "")
			.formParam("ReportObjectTypeName", "Reports.Statutory.Borang8AReport"))
		.pause(274.milliseconds)
		.exec(http("request_116")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "startBuild")
			.formParam("arg", "%7B%22reportId%22%3A%220772d9c0b1d241849cd1591a7f11dd93%22%2C%22reportUrl%22%3A%22%22%2C%22drillDownKeys%22%3A%5B%5D%2C%22sortingState%22%3A%5B%5D%2C%22timeZoneOffset%22%3A480%2C%22parameters%22%3A%5B%5D%7D"))
		.pause(285.milliseconds)
		.exec(http("request_117")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getBuildStatus")
			.formParam("arg", "%7B%22documentId%22%3A%2259e664f7c7c3479d9a24071b37ec1a6d%22%2C%22timeOut%22%3A120000%7D"))
		.pause(283.milliseconds)
		.exec(http("request_118")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getBuildStatus")
			.formParam("arg", "%7B%22documentId%22%3A%2259e664f7c7c3479d9a24071b37ec1a6d%22%2C%22timeOut%22%3A120000%7D"))
		.exec(http("request_119")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getDocumentData")
			.formParam("arg", "59e664f7c7c3479d9a24071b37ec1a6d"))

/*		.exec(http("request_120")
			.get("/Report/DXXRDV.axd?actionKey=getPage&unifier=a6fc093c-2383-65c8-d96b-32b0c71c26ff&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%2259e664f7c7c3479d9a24071b37ec1a6d%22%2C%22resolution%22%3A96%7D")
			)*/

		.exec(http("request_121")
			.post("/Report/DXXRDV.axd")
			
			.formParam("actionKey", "getBrickMap")
			.formParam("arg", "%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%2259e664f7c7c3479d9a24071b37ec1a6d%22%7D"))

/*		.exec(http("request_122")
			.get("/Report/DXXRDV.axd?actionKey=getPage&unifier=a6fc093c-2383-65c8-d96b-32b0c71c26ff&arg=%7B%22pageIndex%22%3A0%2C%22documentId%22%3A%2259e664f7c7c3479d9a24071b37ec1a6d%22%2C%22resolution%22%3A85%7D")
			)*/

		.pause(5)
  
  }

  def logout = {
    exec(http("Submit Logout")
			.post("/Account/LogOff")
			
			.formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
			.formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
			.formParam("DXCss", "/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/jquery-ui.css")
			.check(status.is(302)))
		.exec(http("request_124")
			.get("/Account/Login")
			)
		.exec(http("request_125")
			.get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1")
			)
		.exec(http("request_126")
			.get("/DXR.axd?r=1_58-N3Vxm")
			)
		.exec(http("request_127")
			.get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
			)
		.exec(http("request_128")
			.get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
			)
		.exec(http("request_129")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
			)
		.exec(http("request_130")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.exec(http("request_131")
			.get("/Content/Images/bg-login.jpg?V=03")
			)
  }




}