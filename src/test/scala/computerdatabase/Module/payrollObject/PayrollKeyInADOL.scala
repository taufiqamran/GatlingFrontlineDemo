package computerdatabase.Module.payrollObject

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object PayrollKeyInADOL {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadApplication = {
    exec(http("Key in ADOL Page")
      .get("/PayrollTransaction/Index")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken2"))
    )
      .exec(http("request_56")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1")
      )
      .exec(http("request_57")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41")
      )
      .exec(http("request_58")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7")
      )
      .exec(http("request_59")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1")
      )
      .exec(http("request_60")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1")
      )
      .exec(http("request_61")
        .get("/Content/Images/unifiedhcms_logo.png?V=01")
      )
      .exec(http("request_62")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1")
      )
      .exec(http("request_63")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_64")
        .get("/profile_picture.ashx?EmployeeID=5302")
      )
      .exec(http("request_65")
        .get("/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1")
      )
      .exec(http("request_66")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1")
      )
      .exec(http("request_67")
        .get("/Scripts/MasterDevExBundle?v=0Nfn5KbcdrNt5eTp8R1rjNA5IlQgPjvDQ2MUmQSG31o1")
      )
      .exec(http("request_68")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A")
      )
      .exec(http("request_69")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1")
      )
      .exec(http("request_70")
        .get(uri3 + "?family=Open+Sans:300,400,600,700")
      )
      .exec(http("request_71")
        .get(uri3 + "?family=Roboto:400,300,500,700")
      )
      .exec(http("request_72")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm")
      )
      .exec(http("request_73")
        .get("/signalr/hubs")
      )
      .exec(http("request_74")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(718.milliseconds)
      .exec(http("request_75")
        .get("/DXR.axd?r=0_2314-O3Vxm")
      )
      .exec(http("request_76")
        .get("/DXR.axd?r=0_2216-O3Vxm")
      )
      .exec(http("request_77")
        .get("/DXR.axd?r=0_2316-O3Vxm")
      )
      .exec(http("request_78")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_79")
        .get("/DXR.axd?r=0_2303-O3Vxm")
      )
      .exec(http("request_80")
        .post("/PayrollTransaction/ComboBoxDisplay")

        .formParam("objectLabel", "PayPeriod")
        .formParam("comboBoxValue", ""))
      .exec(http("request_81")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_82")
        .post("/PayrollTransaction/CheckBoxListDisplay")

        .formParam("objectLabel", "EmployeeStatus")
        .formParam("objectSelectedIds[]", "A"))
      .pause(171.milliseconds)
      .exec(http("request_83")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_84")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_85")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623140846738")
      )
      .pause(248.milliseconds)
      .exec(http("request_86")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=zIJzsLeJcJXnYOt7fj1Wufc2BfPUkcm%2BwPS1tohD6DzrfHrvja%2F20vwbx5EoCloHKfW3TltHFsdhTkCm97DJjKKmKRCRVs2VTV7YAIddwjSyvLa%2FeDXABW%2BrXfZYxF9aMloziRd8iPF%2Fs7m3iyQjY1R1ZWbJ90gQWWzpoDhrq2Q%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623140846739")
      )
      .pause(2)
      .exec(http("request_87")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_88")
        .post("/PayrollTransaction/ComboBoxDisplay")

        .formParam("objectLabel", "PayPeriod")
        .formParam("comboBoxValue", "347"))
      .pause(859.milliseconds)
      .exec(http("request_89")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_90")
        .post("/PayrollTransaction/CheckBoxListDisplay")

        .formParam("objectLabel", "EmployeeStatus")
        .formParam("objectSelectedIds[]", "A")
        .formParam("objectSelectedIds[]", "L"))
      .pause(129.milliseconds)
      .exec(http("request_91")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FPayrollTransaction%2FIndex&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._x6fil8&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=129350")
      )
      .exec(http("request_92")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_93")
        .post("/PayrollTransaction/CheckBoxListDisplay")

        .formParam("objectLabel", "EmployeeStatus")
        .formParam("objectSelectedIds[]", "A")
        .formParam("objectSelectedIds[]", "L")
        .formParam("objectSelectedIds[]", "I"))
      .pause(1)
      .exec(http("request_94")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_95")
        .post("/PayrollTransaction/PartialTabEmployee")

        .formParam("Customsearchparameters[0][Name]", "PayPeriod")
        .formParam("Customsearchparameters[0][Value]", "347")
        .formParam("Customsearchparameters[1][Name]", "EmployeeStatus")
        .formParam("Customsearchparameters[1][Value]", "A,L,I")
        .formParam("StartsWith", "all"))
      .exec(http("request_96")
        .get("/DXR.axd?r=0_2223-O3Vxm")
      )
      .exec(http("request_97")
        .get("/DXR.axd?r=0_2321-O3Vxm")
      )
      .exec(http("request_98")
        .get("/Account/VerifyAccess")
      )
      .exec(http("request_99")
        .get("/PayrollTransaction/PartialPayrollTransactionGridview?EmploymentPrimaryId=2802&PayPeriodId=347")
      )
      .pause(4)
      .exec(http("request_100")
        .get("/Account/VerifyAccess")
      )
  }

  def openPayrollId = {
    exec(http("request_101")
        .get("/PayrollTransaction/PartialPayrollTransactionGridview?EmploymentPrimaryId=11841&PayPeriodId=347")
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
      .pause(9)
      .exec(http("request_102")
        .post("/PayrollTransaction/TxncodeComboboxPartial")

        .formParam("DXCallbackName", "gvTransaction_DXEditor2")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|4;0:99;")
        .formParam("gvTransaction$DXEditor2$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction_DXEditor2_VI", "")
        .formParam("gvTransaction$DXEditor2", "")
        .formParam("DXMVCEditorsValues", """{"PayPeriod_DDD_L":["347"],"PayPeriod":"347","EmployeeStatus":["A","L","I"],"gvEmployee_DXFREditorcol1":null,"gvEmployee_DXFREditorcol2":null,"gvEmployee_DXFREditorcol3_DDD_L":[],"gvEmployee_DXFREditorcol3":null,"gvEmployee_DXFREditorcol4_DDD_L":[],"gvEmployee_DXFREditorcol4":null,"gvEmployee_DXFREditorcol5_DDD_L":[],"gvEmployee_DXFREditorcol5":null,"gvEmployee_DXFREditorcol6":null,"gvEmployee_DXFREditorcol7":null,"gvTransaction_DXEditor1_DDD_L":["A"],"gvTransaction_DXEditor1":"A","gvTransaction_DXEditor2_DDD_L":[],"gvTransaction_DXEditor2":null,"gvTransaction_DXEditor3":null,"gvTransaction_DXEditor4":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor5":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor6":"1.00","gvTransaction_DXEditor7":"0.00","gvTransaction_DXEditor8_DDD_L":["MYR"],"gvTransaction_DXEditor8":"MYR","gvTransaction_DXEditor9":"0","gvTransaction_DXEditor10_DDD_L":["MYR"],"gvTransaction_DXEditor10":"MYR","gvTransaction_DXEditor11":"1","gvTransaction_DXEditor12":"0","gvTransaction_DXEditor13_DDD_L":["PY"],"gvTransaction_DXEditor13":"PY","gvTransaction_DXEditor14_DDD_L":[],"gvTransaction_DXEditor14":null,"gvTransaction_DXEditor15":"KM00023","gvTransaction_DXEditor16":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor17":null,"gvTransaction_DXEditor18":1}""")
        .formParam("TRX_TYPE", "A")
        .formParam("PAY_PERIOD_ID", "347"))
      .exec(http("request_103")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_104")
        .post("/PayrollTransaction/GetAmountByQtyRate")

        .formParam("TrxType", "A")
        .formParam("TrxCode", "")
        .formParam("Qty", "1")
        .formParam("Rate", "0")
        .formParam("EmploymentPrimaryId", "11841")
        .formParam("PayPeriodID", "347")
        .formParam("TrxDate", "2021/06/08")
        .formParam("EffectiveDate", "2021/06/08"))
      .pause(2)
      .exec(http("request_105")
        .post("/PayrollTransaction/TxncodeComboboxPartial")

        .formParam("DXCallbackName", "gvTransaction_DXEditor2")
        .formParam("__DXCallbackArgument", "c0:LECC|0;;LBCRI|4;0:99;CBCF|4;meal;")
        .formParam("gvTransaction$DXEditor2$State", "{&quot;validationState&quot;:&quot;-The Code field is required.&quot;}")
        .formParam("gvTransaction_DXEditor2_VI", "")
        .formParam("gvTransaction$DXEditor2", "meal")
        .formParam("DXMVCEditorsValues", """{"PayPeriod_DDD_L":["347"],"PayPeriod":"347","EmployeeStatus":["A","L","I"],"gvEmployee_DXFREditorcol1":null,"gvEmployee_DXFREditorcol2":null,"gvEmployee_DXFREditorcol3_DDD_L":[],"gvEmployee_DXFREditorcol3":null,"gvEmployee_DXFREditorcol4_DDD_L":[],"gvEmployee_DXFREditorcol4":null,"gvEmployee_DXFREditorcol5_DDD_L":[],"gvEmployee_DXFREditorcol5":null,"gvEmployee_DXFREditorcol6":null,"gvEmployee_DXFREditorcol7":null,"gvTransaction_DXEditor1_DDD_L":["A"],"gvTransaction_DXEditor1":"A","gvTransaction_DXEditor2_DDD_L":[],"gvTransaction_DXEditor2":null,"gvTransaction_DXEditor3":null,"gvTransaction_DXEditor4":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor5":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor6":"1.00","gvTransaction_DXEditor7":"0.00","gvTransaction_DXEditor8_DDD_L":["MYR"],"gvTransaction_DXEditor8":"MYR","gvTransaction_DXEditor9":"0","gvTransaction_DXEditor10_DDD_L":["MYR"],"gvTransaction_DXEditor10":"MYR","gvTransaction_DXEditor11":"1","gvTransaction_DXEditor12":"0","gvTransaction_DXEditor13_DDD_L":["PY"],"gvTransaction_DXEditor13":"PY","gvTransaction_DXEditor14_DDD_L":[],"gvTransaction_DXEditor14":null,"gvTransaction_DXEditor15":"KM00023","gvTransaction_DXEditor16":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor17":null,"gvTransaction_DXEditor18":1}""")
        .formParam("TRX_TYPE", "A")
        .formParam("PAY_PERIOD_ID", "347"))
      .pause(1)
      .exec(http("request_106")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_107")
        .post("/PayrollTransaction/GetTransactionByTypeCode")

        .formParam("Type", "A")
        .formParam("Code", "MEAL008")
        .formParam("EffectiveDate", "2021/06/08")
        .formParam("EmploymentPrimaryId", "11841")
        .formParam("PayPeriodId", "347")
        .formParam("TrxQty", "1")
        .formParam("TrxDate", "2021/06/08"))
      .exec(http("request_108")
        .post("/PayrollTransaction/TxncodeComboboxPartial")

        .formParam("DXCallbackName", "gvTransaction_DXEditor2")
        .formParam("__DXCallbackArgument", "c0:CBSI|0;;")
        .formParam("gvTransaction$DXEditor2$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction_DXEditor2_VI", "")
        .formParam("gvTransaction$DXEditor2", "")
        .formParam("DXMVCEditorsValues", """{"PayPeriod_DDD_L":["347"],"PayPeriod":"347","EmployeeStatus":["A","L","I"],"gvEmployee_DXFREditorcol1":null,"gvEmployee_DXFREditorcol2":null,"gvEmployee_DXFREditorcol3_DDD_L":[],"gvEmployee_DXFREditorcol3":null,"gvEmployee_DXFREditorcol4_DDD_L":[],"gvEmployee_DXFREditorcol4":null,"gvEmployee_DXFREditorcol5_DDD_L":[],"gvEmployee_DXFREditorcol5":null,"gvEmployee_DXFREditorcol6":null,"gvEmployee_DXFREditorcol7":null,"gvTransaction_DXEditor1_DDD_L":["A"],"gvTransaction_DXEditor1":"A","gvTransaction_DXEditor2_DDD_L":[],"gvTransaction_DXEditor2":null,"gvTransaction_DXEditor3":null,"gvTransaction_DXEditor4":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor5":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor6":"1.00","gvTransaction_DXEditor7":"0.00","gvTransaction_DXEditor8_DDD_L":["MYR"],"gvTransaction_DXEditor8":"MYR","gvTransaction_DXEditor9":"0","gvTransaction_DXEditor10_DDD_L":["MYR"],"gvTransaction_DXEditor10":"MYR","gvTransaction_DXEditor11":"1","gvTransaction_DXEditor12":"0","gvTransaction_DXEditor13_DDD_L":["PY"],"gvTransaction_DXEditor13":"PY","gvTransaction_DXEditor14_DDD_L":[],"gvTransaction_DXEditor14":null,"gvTransaction_DXEditor15":"KM00023","gvTransaction_DXEditor16":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor17":null,"gvTransaction_DXEditor18":1}""")
        .formParam("TRX_TYPE", "A")
        .formParam("PAY_PERIOD_ID", "347"))
      .pause(3)
      .exec(http("request_109")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_110")
        .post("/PayrollTransaction/GetAmountByQtyRate")

        .formParam("TrxType", "A")
        .formParam("TrxCode", "MEAL008")
        .formParam("Qty", "2.00")
        .formParam("Rate", "8")
        .formParam("EmploymentPrimaryId", "11841")
        .formParam("PayPeriodID", "347")
        .formParam("TrxDate", "2021/06/08")
        .formParam("EffectiveDate", "2021/06/08"))
      .pause(2)
    }
      def updatePayrollAdol = {
      exec(http("request_111")
        .post("/PayrollTransaction/BatchUpdateTransaction?EmploymentPrimaryId=11841&PayPeriodId=347")

        .formParam("DXCallbackName", "gvTransaction")
        .formParam("__DXCallbackArgument", """c0:KV|82;["${arrayKey}"];GB|13;10|UPDATEEDIT;""")
        .formParam("gvTransaction", "{&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[-1],&quot;InsertedValues&quot;:{&quot;-1&quot;:{&quot;1&quot;:[&quot;A&quot;,&quot;Allowance&quot;,false],&quot;2&quot;:[&quot;MEAL008&quot;,&quot;MEAL008&quot;,false],&quot;3&quot;:[&quot;MEAL ALLOWANCE&quot;,&quot;MEAL ALLOWANCE&quot;,false],&quot;6&quot;:[&quot;2.00&quot;,&quot;2.00&quot;,false],&quot;7&quot;:[&quot;8.00&quot;,&quot;8.00&quot;,false],&quot;9&quot;:[16,&quot;16.00&quot;,false],&quot;12&quot;:[16,&quot;16.00&quot;,false]}},&quot;UpdatedValues&quot;:{},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{&quot;-1&quot;:{&quot;TRX_TYPE&quot;:&quot;A&quot;,&quot;TRX_CODE&quot;:&quot;MEAL008&quot;,&quot;V_TRANSACTIONS.SHORT_DESCRIPTION&quot;:&quot;MEAL ALLOWANCE&quot;,&quot;TRX_DATE&quot;:&quot;06/08/2021 16:27:41.378&quot;,&quot;EFFECTIVE_DATE&quot;:&quot;06/08/2021 16:27:41.378&quot;,&quot;QTY&quot;:&quot;2.00&quot;,&quot;RATE&quot;:&quot;8.00&quot;,&quot;CURRENCY_CODE&quot;:&quot;MYR&quot;,&quot;ORI_AMOUNT&quot;:&quot;16&quot;,&quot;BASE_CURRENCY&quot;:&quot;MYR&quot;,&quot;EXCHANGE_RATE&quot;:&quot;1&quot;,&quot;AMOUNT&quot;:&quot;16&quot;,&quot;OPTION_FLAG&quot;:&quot;PY&quot;,&quot;COST_CENTER_CODE&quot;:&quot;&quot;,&quot;CREATED_BY&quot;:&quot;KM00023&quot;,&quot;CREATED_DATE&quot;:&quot;06/08/2021 16:27:41.378&quot;,&quot;STATUS_CODE&quot;:null,&quot;recalculate_flag&quot;:&quot;1&quot;}},&quot;modifiedRowValues&quot;:{},&quot;deletedRowKeys&quot;:[]}},&quot;keys&quot;:['${arrayKey}'],&quot;callbackState&quot;:&quot;JBQpRUGIG/JtvgkyvHUrt1F8+tuvQJ1BshF9puMh+wAV3DD6A1C2IW4rqu1zla0sWIuS8O++HLz7dQNntKq7YJYzkwiSbPlfToCTZ4vDb+0njtlcI3ej6JMKxGA4Bx3UgmBHRhwC5EY9XIKjKTx6sUtNn2oGZWs1ok9n+CPLaV+XUwjuFpE95xv1BuYZBrwt516UxNWEEdup4IYEuFC6CV/uogzS6FAOCngbh+H0VoRHWB7HrLSUVyn2VZqf9XTp40uGzDjjbg5tY13YWQavcSVOdm2Kpv74GgXSE/X07w51Ez0JGEmvwAlqlQSvuEjneE2okRlGQJGpFlsi9l0yPUBbbpiQjABlxLGr5uLxSpSjy00dtodS8W+LeE78+CWKxH83t1uSq5aYh1hCsk6MNG0S58tU5JsdNjUHa7y3CWr6maZbPzCYyaZ3hvfjAq5ttGYSymTNNCoZhhKsJ6fOYIG5+DFo6AJJ9n44saGGbyQcZQRG/oF6Anjpdu60g5c7E+SxfOzGPqqaaMYbpyjk5136F4881YhdMMxdCFQkN35AK87RDkV8KTrNHrLMM4PmIB5bEU4amgvmLAyPSxskOI4UX3gFu5igqCSNbDT/g7vv4Vc4zy58Xyoq9dAPxLOu&quot;,&quot;scrollState&quot;:[0,0],&quot;selection&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor1$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction_DXEditor1_VI", "A")
        .formParam("gvTransaction$DXEditor1", "Allowance")
        .formParam("gvTransaction$DXEditor1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:72:157:1:85:165:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor1$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;,&quot;DeletedItems&quot;:&quot;1|71|G0|10|Government&quot;,&quot;InsertedItems&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor1$DDD$L", "A")
        .formParam("gvTransaction$DXEditor2$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction_DXEditor2_VI", "MEAL008")
        .formParam("gvTransaction$DXEditor2", "MEAL008")
        .formParam("gvTransaction$DXEditor2$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:152:341:1:450:52:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor2$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;LECC|0;;&quot;}")
        .formParam("gvTransaction$DXEditor2$DDD$L", "MEAL008")
        .formParam("gvTransaction$DXEditor6$State", "{&quot;rawValue&quot;:&quot;2.00&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor6", "2.00")
        .formParam("gvTransaction$DXEditor7$State", "{&quot;rawValue&quot;:&quot;8.00&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor7", "8.00")
        .formParam("gvTransaction$DXEditor3$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor3", "MEAL ALLOWANCE")
        .formParam("gvTransaction$DXEditor4$State", "{&quot;rawValue&quot;:&quot;1623169661378&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor4", "08/06/2021")
        .formParam("gvTransaction$DXEditor4$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor4$DDD$C", "{&quot;visibleDate&quot;:&quot;06/08/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/08/2021&quot;,&quot;selectedDates&quot;:[]}")
        .formParam("gvTransaction$DXEditor4$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor5$State", "{&quot;rawValue&quot;:&quot;1623169661378&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor5", "08/06/2021")
        .formParam("gvTransaction$DXEditor5$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor5$DDD$C", "{&quot;visibleDate&quot;:&quot;06/08/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/08/2021&quot;,&quot;selectedDates&quot;:[]}")
        .formParam("gvTransaction$DXEditor5$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor8$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction_DXEditor8_VI", "MYR")
        .formParam("gvTransaction$DXEditor8", "MYR")
        .formParam("gvTransaction$DXEditor8$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor8$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor8$DDD$L", "MYR")
        .formParam("gvTransaction$DXEditor9$State", "{&quot;rawValue&quot;:&quot;16&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor9", "16.00")
        .formParam("gvTransaction$DXEditor10$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction_DXEditor10_VI", "MYR")
        .formParam("gvTransaction$DXEditor10", "MYR")
        .formParam("gvTransaction$DXEditor10$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor10$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor10$DDD$L", "MYR")
        .formParam("gvTransaction$DXEditor11$State", "{&quot;rawValue&quot;:&quot;1&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor11", "1.000000")
        .formParam("gvTransaction$DXEditor12$State", "{&quot;rawValue&quot;:&quot;16&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor12", "16.00")
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
        .formParam("gvTransaction$DXEditor15", "KM00023")
        .formParam("gvTransaction$DXEditor16$State", "{&quot;rawValue&quot;:&quot;1623169661378&quot;,&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor16", "08/06/2021")
        .formParam("gvTransaction$DXEditor16$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor16$DDD$C", "{&quot;visibleDate&quot;:&quot;06/08/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/08/2021&quot;,&quot;selectedDates&quot;:[]}")
        .formParam("gvTransaction$DXEditor16$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
        .formParam("gvTransaction$DXEditor17$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor17", "I")
        .formParam("gvTransaction$DXEditor18$State", "{&quot;validationState&quot;:&quot;&quot;}")
        .formParam("gvTransaction$DXEditor18", "C")
        .formParam("DXMVCEditorsValues", """{"PayPeriod_DDD_L":["347"],"PayPeriod":"347","EmployeeStatus":["A","L","I"],"gvEmployee_DXFREditorcol1":null,"gvEmployee_DXFREditorcol2":null,"gvEmployee_DXFREditorcol3_DDD_L":[],"gvEmployee_DXFREditorcol3":null,"gvEmployee_DXFREditorcol4_DDD_L":[],"gvEmployee_DXFREditorcol4":null,"gvEmployee_DXFREditorcol5_DDD_L":[],"gvEmployee_DXFREditorcol5":null,"gvEmployee_DXFREditorcol6":null,"gvEmployee_DXFREditorcol7":null,"gvTransaction_DXEditor1_DDD_L":["A"],"gvTransaction_DXEditor1":"A","gvTransaction_DXEditor2_DDD_L":["MEAL008"],"gvTransaction_DXEditor2":"MEAL008","gvTransaction_DXEditor3":"MEAL ALLOWANCE","gvTransaction_DXEditor4":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor5":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor6":"2.00","gvTransaction_DXEditor7":"8.00","gvTransaction_DXEditor8_DDD_L":["MYR"],"gvTransaction_DXEditor8":"MYR","gvTransaction_DXEditor9":"16","gvTransaction_DXEditor10_DDD_L":["MYR"],"gvTransaction_DXEditor10":"MYR","gvTransaction_DXEditor11":"1","gvTransaction_DXEditor12":"16","gvTransaction_DXEditor13_DDD_L":["PY"],"gvTransaction_DXEditor13":"PY","gvTransaction_DXEditor14_DDD_L":[],"gvTransaction_DXEditor14":null,"gvTransaction_DXEditor15":"KM00023","gvTransaction_DXEditor16":new Date(2021,5,8,16,27,41,378),"gvTransaction_DXEditor17":null,"gvTransaction_DXEditor18":1}""")
        .formParam("DXMVCBatchEditingValuesRequestKey", "gvTransaction")
        .formParam("DXMVCBatchEditingKeyFieldName", "ID")
        .formParam("RECORDSXML", "${recordXml}"))
      .pause(17)
      }

  def logout = {
    exec(http("Logout Submission")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationToken2}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
      .check(status.is(302)))
      .exec(http("Login After Logout")
        .get("/Account/Login")
      )
      .exec(http("request_114")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1")
      )
      .exec(http("request_115")
        .get("/DXR.axd?r=1_58-N3Vxm")
      )
      .exec(http("request_116")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
      )
      .exec(http("request_117")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm")
      )
      .exec(http("request_118")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm")
      )
      .exec(http("request_119")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_120")
        .get("/Content/Images/bg-login.jpg?V=03")
      )
  }

}
