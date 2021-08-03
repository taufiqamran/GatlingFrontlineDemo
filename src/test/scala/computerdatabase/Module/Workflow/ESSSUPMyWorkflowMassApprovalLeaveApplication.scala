package computerdatabase.Module.Workflow
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.collection.mutable.ArrayBuffer
import scala.util.matching.Regex
import scala.concurrent.duration._

object ESSSUPMyWorkflowMassApprovalLeaveApplication {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"

  def loadLeaveApplication = {
    exec(http("request_51")
      .get("/MassApproval/MassApprovalListing")
    )
      .exec(http("request_52")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_53")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
      .exec(http("request_54")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
      .exec(http("request_55")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
      .exec(http("request_56")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
      .exec(http("request_57")
        .get("/Content/Images/unifiedhcms_logo.png?V=01"))
      .exec(http("request_58")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_59")
        .get("/profile_picture.ashx?EmployeeID=5302"))
      .exec(http("request_60")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
      .exec(http("request_61")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
      .exec(http("request_62")
        .get("/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1"))
      .exec(http("request_63")
        .get("/Scripts/MasterDevExBundle?v=0Nfn5KbcdrNt5eTp8R1rjNA5IlQgPjvDQ2MUmQSG31o1"))
      .exec(http("request_64")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_65")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_66")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
      .exec(http("request_67")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
      .exec(http("request_68")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
      .exec(http("request_69")
        .get("/signalr/hubs")
      )
      .pause(101.milliseconds)
      .exec(http("request_70")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(1)
      .exec(http("request_71")
        .get("/DXR.axd?r=0_2314-O3Vxm"))
      .exec(http("request_72")
        .get("/DXR.axd?r=0_2321-O3Vxm"))
      .pause(238.milliseconds)
      .exec(http("request_73")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
      .exec(http("request_74")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
      .pause(617.milliseconds)
      .exec(http("request_75")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_76")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_77")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_78")
        .get("/DXR.axd?r=0_2303-O3Vxm"))
      .exec(http("request_79")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622987327194")
      )
      .exec(http("request_80")
        .post("/MassApproval/MassApprovalLeaveListingGridViewPartial")
        .formParam("CustomSearchParameters[0][Name]", "LeaveDateFrom")
        .formParam("CustomSearchParameters[0][Value]", "")
        .formParam("CustomSearchParameters[1][Name]", "LeaveDateTo")
        .formParam("CustomSearchParameters[1][Value]", "")
        .formParam("CustomSearchParameters[2][Name]", "SubmissionDateFrom")
        .formParam("CustomSearchParameters[2][Value]", "")
        .formParam("CustomSearchParameters[3][Name]", "SubmissionDateTo")
        .formParam("CustomSearchParameters[3][Value]", "")
        .formParam("CustomSearchParameters[4][Name]", "RequestorNo")
        .formParam("CustomSearchParameters[4][Value]", "")
        .formParam("CustomSearchParameters[5][Name]", "Leave")
        .formParam("CustomSearchParameters[5][Value]", "")
        .check(bodyString.saveAs("massBody"))
        .check(regex("'cpRecordsXML':'(.+?)'").saveAs("records"))
        .check(regex("'keys':\\[(.+?)]").saveAs("key"))
        .check(regex("'keys':\\[(.+?)]").transform(_.split(",").map(_.trim).toSeq).saveAs("arrayId"))
        .check(regex("'callbackState':'(.+?)'").saveAs("callBack"))



      )
      .exec(session =>{

        val bodyRedirect = session("massBody").as[String]
        val total = new StringBuilder
        val updateValue = new StringBuilder
        val arrayIds = Seq[String]()
        val record = session("records").as[String]
        val key = session("key").as[String]
        val ids = session("arrayId").as[Seq[String]]
        val callback = session("callBack").as[String]

        for(id <- ids){

          val arrayValue = ArrayBuffer[String]()
          val settingRegex = new Regex(s"$id:\\{(|.+?)\\}")
          val haha = (settingRegex.findAllIn(bodyRedirect).mkString)
          arrayIds :+ id.replace("'","")
          val arrayStrings = (haha.split("\\{"))(1).split(",(?![^(]*\\))")

          for( arrayString <- arrayStrings) {

            val value =arrayString.split(":")(1)
            val filter_value = value.replaceAll("'|}","")
            arrayValue += filter_value

          }

          arrayValue.toArray
          val stringZ = s"&quot;${id.replace("'","")}&quot;:{&quot;ROW_NO&quot;:&quot;${arrayValue(0)}&quot;,&quot;LEAVE_DATE_FROM&quot;:&quot;06/01/2021 00:00:00&quot;,&quot;LEAVE_DATE_TO&quot;:&quot;06/01/2021 00:00:00&quot;,&quot;EMPLOYEE_NO&quot;:&quot;${arrayValue(3)}&quot;,&quot;EMPLOYEE_NAME&quot;:&quot;${arrayValue(4)}&quot;,&quot;REQUEST_DATE&quot;:&quot;06/01/2021 00:00:00&quot;,&quot;LEAVE_CODE&quot;:&quot;${arrayValue(6)}&quot;,&quot;LEAVE_PERIOD_FLAG&quot;:&quot;${arrayValue(7)}&quot;,&quot;ACTUAL_DAY&quot;:&quot;${arrayValue(8)}&quot;,&quot;ACTUAL_HOUR&quot;:&quot;${arrayValue(9)}&quot;,&quot;WF_REMARKS&quot;:${arrayValue(10)},&quot;WF_STATUS&quot;:&quot;A&quot;}"
          val modified = s"&quot;${id.replace("'","")}&quot;:{&quot;11&quot;:[&quot;A&quot;,&quot;Approved&quot;,false]}"
          total.append(stringZ+",")
          updateValue.append(modified+",")

        }
        arrayIds.toArray

        val modifiedValue = total.dropRight(1)
        val updateValues = updateValue.dropRight(1)

        println(s"MofifiedValue : ${total.dropRight(1)}")
        println(s"New : ${updateValue.dropRight(1)}")
        println(s"Array id : $arrayIds")
        println(s"Key : $key")
        println(s"Records : $record")


        session.set("modifiedValue",modifiedValue).set("updateValues",updateValues).set("arrayIds",arrayIds)
      })

  }
  def approveLeaveApplication = {
    exec(http("request_85")
      .post("/MassApproval/BatchUpdateMassApproval")
      .formParam("DXCallbackName", "gvMassApprovalListing")
      .formParam("__DXCallbackArgument", """c0:SR|2;UT;KV|25;[${key}];GB|13;10|UPDATEEDIT;""")
      .formParam("gvMassApprovalListing", "{&quot;lastMultiSelectIndex&quot;:1,&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[],&quot;InsertedValues&quot;:{},&quot;UpdatedValues&quot;:{${updateValues}},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{},&quot;modifiedRowValues&quot;:{${modifiedValue}},&quot;deletedRowKeys&quot;:[]}},&quot;keys&quot;:[${key}],&quot;callbackState&quot;:&quot;${callBack}&quot;,&quot;selection&quot;:&quot;UT&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol0", "")
      .formParam("gvMassApprovalListing$DXFREditorcol1$State", "{&quot;rawValue&quot;:&quot;N&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol1", "")
      .formParam("gvMassApprovalListing$DXFREditorcol1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol1$DDD$C", "{&quot;visibleDate&quot;:&quot;06/06/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/06/2021&quot;,&quot;selectedDates&quot;:[]}")
      .formParam("gvMassApprovalListing$DXFREditorcol1$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol2$State", "{&quot;rawValue&quot;:&quot;N&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol2", "")
      .formParam("gvMassApprovalListing$DXFREditorcol2$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol2$DDD$C", "{&quot;visibleDate&quot;:&quot;06/06/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/06/2021&quot;,&quot;selectedDates&quot;:[]}")
      .formParam("gvMassApprovalListing$DXFREditorcol2$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol3", "")
      .formParam("gvMassApprovalListing$DXFREditorcol4", "")
      .formParam("gvMassApprovalListing$DXFREditorcol5$State", "{&quot;rawValue&quot;:&quot;N&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol5", "")
      .formParam("gvMassApprovalListing$DXFREditorcol5$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol5$DDD$C", "{&quot;visibleDate&quot;:&quot;06/06/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/06/2021&quot;,&quot;selectedDates&quot;:[]}")
      .formParam("gvMassApprovalListing$DXFREditorcol5$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing_DXFREditorcol6_VI", "")
      .formParam("gvMassApprovalListing$DXFREditorcol6", "")
      .formParam("gvMassApprovalListing$DXFREditorcol6$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol6$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol6$DDD$L", "")
      .formParam("gvMassApprovalListing_DXFREditorcol7_VI", "")
      .formParam("gvMassApprovalListing$DXFREditorcol7", "")
      .formParam("gvMassApprovalListing$DXFREditorcol7$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol7$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol7$DDD$L", "")
      .formParam("gvMassApprovalListing$DXFREditorcol8", "")
      .formParam("gvMassApprovalListing$DXFREditorcol9", "")
      .formParam("gvMassApprovalListing$DXFREditorcol10", "")
      .formParam("gvMassApprovalListing_DXFREditorcol11_VI", "")
      .formParam("gvMassApprovalListing$DXFREditorcol11", "")
      .formParam("gvMassApprovalListing$DXFREditorcol11$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol11$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXFREditorcol11$DDD$L", "")
      .formParam("gvMassApprovalListing$DXEditor0$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor1$State", "{&quot;rawValue&quot;:&quot;1623024000000&quot;,&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor1$DDD$C", "{&quot;visibleDate&quot;:&quot;06/06/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/06/2021&quot;,&quot;selectedDates&quot;:[]}")
      .formParam("gvMassApprovalListing$DXEditor1$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor2$State", "{&quot;rawValue&quot;:&quot;1623110400000&quot;,&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor2$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor2$DDD$C", "{&quot;visibleDate&quot;:&quot;06/06/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/06/2021&quot;,&quot;selectedDates&quot;:[]}")
      .formParam("gvMassApprovalListing$DXEditor2$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor3$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor4$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor5$State", "{&quot;rawValue&quot;:&quot;1623015694963&quot;,&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor5$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor5$DDD$C", "{&quot;visibleDate&quot;:&quot;06/06/2021&quot;,&quot;initialVisibleDate&quot;:&quot;06/06/2021&quot;,&quot;selectedDates&quot;:[]}")
      .formParam("gvMassApprovalListing$DXEditor5$DDD$C$FNPState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor6$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing_DXEditor6_VI", "")
      .formParam("gvMassApprovalListing$DXEditor6$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor6$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor6$DDD$L", "")
      .formParam("gvMassApprovalListing$DXEditor7$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing_DXEditor7_VI", "")
      .formParam("gvMassApprovalListing$DXEditor7$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor7$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor7$DDD$L", "")
      .formParam("gvMassApprovalListing$DXEditor8$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor9$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor10$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor11$State", "{&quot;validationState&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing_DXEditor11_VI", "")
      .formParam("gvMassApprovalListing$DXEditor11", "Approved")
      .formParam("gvMassApprovalListing$DXEditor11$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:1035:407:1:69:72:1:0:0:0&quot;}")
      .formParam("gvMassApprovalListing$DXEditor11$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
      .formParam("gvMassApprovalListing$DXEditor11$DDD$L", "")
      .formParam("DXMVCEditorsValues", "{}")
      .formParam("DXMVCBatchEditingValuesRequestKey", "gvMassApprovalListing")
      .formParam("DXMVCBatchEditingKeyFieldName", "ID")
      .formParam("RECORDSXML", "${records}")
      .formParam("CustomSearchParameters[0][Name]", "LeaveDateFrom")
      .formParam("CustomSearchParameters[0][Value]", "")
      .formParam("CustomSearchParameters[1][Name]", "LeaveDateTo")
      .formParam("CustomSearchParameters[1][Value]", "")
      .formParam("CustomSearchParameters[2][Name]", "SubmissionDateFrom")
      .formParam("CustomSearchParameters[2][Value]", "")
      .formParam("CustomSearchParameters[3][Name]", "SubmissionDateTo")
      .formParam("CustomSearchParameters[3][Value]", "")
      .formParam("CustomSearchParameters[4][Name]", "RequestorNo")
      .formParam("CustomSearchParameters[4][Value]", "")
      .formParam("CustomSearchParameters[5][Name]", "Leave")
      .formParam("CustomSearchParameters[5][Value]", ""))
  }
  def logout = {
    exec(http("request_86")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "f_xRIljFrmc7fwTxTSljfwDs350SXMTPnJOy8aCmsMmZtBUwAg0wUytDzoeKFDcRQgzto9IVQxk2d2TuxxJdGHNaE1JlZBEFfuvVa54sCs4RUwMpvXm0qOt1sLuSkKXiyvMia0ntY4BXR3INkxTOvQ2")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
      .check(status.is(302)))
      .exec(http("request_87")
        .get("/Account/Login")
      )
      .exec(http("request_88")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_89")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_90")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
      .exec(http("request_91")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
      .exec(http("request_92")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
      .exec(http("request_93")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(130.milliseconds)
      .exec(http("request_94")
        .get("/Content/Images/bg-login.jpg?V=03"))
  }
}
