package computerdatabase.Module.Workflow

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import computerdatabase.Module.Claim.Form.MyWorkFlowClaimApprove._
import computerdatabase.Module.Claim.Form.MyWorkFlowClaimReject._
import computerdatabase.Module.Claim.Form.MyWorkflowClaimSave._

object ESSSUPMyWorkflowClaim {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
  val uri4 = "https://fonts.googleapis.com/css"

    def loadApplication = {
      exec(http("My Workflow Claim Page")
        .get("/works/request_lst.aspx")
        .check(bodyString.saveAs("WorkflowClaim"))
        .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(|.+?)" />""").saveAs("viewState"))

      )
        .exec(http("request_66")
          .get(uri4 + "?family=Open+Sans:300,400,600,700")
        )
        .exec(http("request_67")
          .get(uri4 + "?family=Roboto:400,300,500,700")
        )
        .exec(http("request_68")
          .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
        )
        .exec(http("request_69")
          .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
        )
        .exec(http("request_70")
          .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
        )
        .exec(http("request_71")
          .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
        )
        .exec(http("request_72")
          .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
        )
        .exec(http("request_73")
          .post("/verify_access.ashx")
        )
        .exec(http("request_74")
          .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
        )
        .pause(119.milliseconds)
        .exec(http("request_75")
          .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
        )
        .exec(http("request_76")
          .get("/Notifications/GetNotificationCounts")
        )
        .exec(http("request_77")
          .get("/Account/VerifyAccess")
        )
        .exec(http("request_78")
          .get("/Notifications/ViewNotifications?type=Wb6RlA4XG6fXKkO5Hk+GmIsUR9pknj7q3I9naTLLruuzpo/KsTQEpmowv4wwz1bchOb5vkqCEGER3nGPvCReWZviC1CokqCCaHkc/45e9Ojj3kmNls4ebMYaadYaBQ/6BOf4+DD78A6iWGEv3r+lGg8c43+Witis11IMeIFTs5M=")
        )
        .exec(http("request_79")
          .get(uri3 + "?v=4.7.0")
        )
        .exec(http("request_80")
          .get("/Account/VerifyAccess")
        )
        .exec(http("request_81")
          .get("/Notifications/GetNotificationsList?row=8")
        )
        .pause(96)
    }

    def searchClaimApplication = {
      exec(http("request_67")
        .post("/works/request_lst.aspx")
        .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$btnSearch")
        .formParam("__EVENTARGUMENT", "")
        .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
        .formParam("__VIEWSTATE", "${viewState}")
        .formParam("__VIEWSTATEGENERATOR", "197FAB68")
        .formParam("ctl00$ctl00$ctl00$selCultureName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "A")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "claimapplication")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl28$gpCustomPager$txtPageSize", "50")
        .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(.+?)" />""").saveAs("viewStateSearch"))
      )
        .exec(http("request_68")
          .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
        .exec(http("request_69")
          .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
        .exec(http("request_70")
          .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
        .exec(http("request_71")
          .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
        .exec(http("request_72")
          .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
        .exec(http("request_73")
          .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
        .exec(http("request_74")
          .get(uri4 + "?family=Open+Sans:300,400,600,700"))
        .exec(http("request_75")
          .get(uri4 + "?family=Roboto:400,300,500,700"))
        .exec(http("request_76")
          .post("/verify_access.ashx")
        )
        .exec(http("request_77")
          .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
        )
        .exec(http("request_78")
          .get(uri3 + "?v=4.7.0")
        )
        .pause(119.milliseconds)
        .exec(http("request_79")
          .get("/Notifications/GetNotificationCounts")
        )
        .exec(http("request_80")
          .get("/Notifications/ViewNotifications?type=jBgzokyX9OpkV7JRRrELDe1naSlYjQWQFKRQfXeU6HQwY5CFdOxrPVrDZCycRLuwD7sQLBKMVFdD8gE1+inSDr8EiNhjVNZkR5A/ATgTb0rfKNsYdT2h2+6kkRuAUFtXDbkUoqlb1sd1xPT+IOIkW8RZ/YWreRGnsj8vmYuixz4=")
        )
        .exec(http("request_81")
          .get("/Notifications/GetNotificationsList?row=8")
        )
    }

    def clickFirstClaimRow = {
    exec(http("request_82")
      .post("/works/request_lst.aspx")
      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl02$ctl00")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewStateSearch}")
      .formParam("__VIEWSTATEGENERATOR", "197FAB68")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "A")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "claimapplication")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl28$gpCustomPager$txtPageSize", "50")
      .check(status.is(302))
      //.check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(.+?)" />""").saveAs("viewStateClick"))
      .check(header("Location").saveAs("url")))
      .exec(http("Open Claim Form")
        .get("${url}")
        .check(status.is(200))
        .check(bodyString.saveAs("Claim Form"))
        .check(css("input[name='hdnAgentID']", "value").saveAs("agentId"))
        .check(regex("\"REQUEST_NO\\\\\":\\\\\"(|.+?)\\\\\"").saveAs("requestNo"))
        .check(regex("\\\\\"WF_ITEMID\\\\\":([0-9]+)").saveAs("itemId"))
        .check(regex("JSON\\.parse\\('\\[\\{\\\\\"PARENT_ID\\\\\":(.+?),\\\\\"AGENTID").saveAs("parentId"))
        .check(regex("JSON\\.parse\\('\\[\\{\\\\\"PARENT_ID\\\\\":${parentId},\\\\\"AGENTID\\\\\":(.+?),\\\\\"WF_STATUS").saveAs("updateAgentId"))
        .check(regex("\\\\\"EMPLOYEE_NO\\\\\":\\\\\"(.+?)\\\\\"").saveAs("empNo"))
        .check(regex("\\\\\"WF_ITEMID\\\\\":${itemId},\\\\\"APP_SOURCE\\\\\":null,\\\\\"EMPLOYEE_ID\\\\\":([0-9]+)").saveAs("employeeId"))
        .check(regex("\\{\\\\\"AGENTID\\\\\":${updateAgentId},\\\\\"MONITOR_ID\\\\\":(.+?),").saveAs("monitorId"))
        .check(css("input[class='idfield']", "data-idstring").saveAs("idString"))
        .check(css("input[name='claim_sub_code${idString}_VI']", "value").saveAs("claimSubCode"))
        .check(css("input[name='dtStartDate${idString}']", "value").saveAs("fromDate"))
        .check(css("input[name='dtEndDate${idString}']", "value").saveAs("toDate"))
        .check(css("input[name='cbClaimType${idString}_VI']", "value").saveAs("claimCode"))
        .check(css("input[class='idfield']", "value").saveAs("id"))
        .check(css("input[name='hdnActionType']", "value").saveAs("actionType"))

      )
      .exec(session=>{
        val bodyClaim = session("Claim Form").as[String]
        val requestNo = session("requestNo").as[String]
        val url = session("url").as[String]
        val agentId = session("agentId").as[String]
        val actionType = session("actionType").as[String]
        val id = session("id").as[String]
        val parentId = session("parentId").as[String]
        val uagentId = session("updateAgentId").as[String]
        val idString = session("idString").as[String]
        val employeeId = session("employeeId").as[String]
        val empNo = session("empNo").as[String]
        val claimCode = session("claimCode").as[String]
        val claimSubCode = session("claimSubCode").as[String]
        val fromDate = session("fromDate").as[String]
        val endDate = session("toDate").as[String]
        val itemId = session("itemId").as[String]
        val monitorId = session("monitorId").as[String]

        println(s"toDate : $endDate")
        println(s"fromDate : $fromDate")
        println(s"claimSub : $claimSubCode")
        println(s"claimCode :$claimCode")
        println(s"Url : $url")
        println(s"RequestNo : $requestNo")
        println(s"agentId : $agentId")
        println(s"agentType : $actionType")
        println(s"Id : $id")
        println(s"Id String : $idString")
        println(s"parentId :$parentId")
        println(s"uagentId : $uagentId")
        println(s"Emp id :$employeeId")
        println(s"empNo :$empNo")
        println(s"itemId :$itemId")
        println(s"Monitor :$monitorId")

        session
      })

      .exec(http("request_84")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
      .exec(http("request_85")
        .get("/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1"))
      .exec(http("request_86")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
      .exec(http("request_87")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
      .exec(http("request_88")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
      .exec(http("request_89")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
      .exec(http("request_90")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_91")
        .get(uri4 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_92")
        .get(uri4 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_93")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
      .exec(http("request_94")
        .get("/Scripts/MasterDevExBundle?v=0Nfn5KbcdrNt5eTp8R1rjNA5IlQgPjvDQ2MUmQSG31o1"))
      .exec(http("request_95")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
      .exec(http("request_96")
        .get("/signalr/hubs")
      )
      .exec(http("request_97")
        .get("/Content/Images/unifiedhcms_logo.png?V=01"))
      .exec(http("request_98")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
      .exec(http("request_99")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
      .exec(http("request_100")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_101")
        .get("/profile_picture.ashx?EmployeeID=1"))
      .exec(http("request_102")
        .get("/profile_picture.ashx?EmployeeID=7317"))
      .exec(http("request_103")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(226.milliseconds)
      .exec(http("request_104")
        .get("/DXR.axd?r=0_2216-O3Vxm"))
      .exec(http("request_105")
        .get("/DXR.axd?r=0_2223-O3Vxm"))
      .exec(http("request_106")
        .get("/Notifications/GetNotificationUserId")
      )
      .pause(250.milliseconds)
      .exec(http("request_107")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=CLKM&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622535423263")
      )
      .exec(http("request_108")
        .get("/Notifications/GetNotificationCounts")
      )
      .pause(2)
      .exec(http("request_109")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=CLKM&connectionToken=LZWUxAMLVFxZdDlM0irjHLWRYimG0drkW%2BlJfotIaxmSmqxmvWV5w4d45OV796g9xhhhiZG37xPvATOKWDbkDFPUcjMYnQVvNTOi5oXuU1QPfdsHBLTVEsQmPmF6d2P2OFChhcNk3WjLdSdaM%2BS%2FU%2F9TF0WIafZRq4ZvgcKPxXY%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1622535423264")
      )
      .pause(2)
      .exec(http("request_110")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FClaim%2FClaimApplicationW%3FValue%3D3c56414c55453e3c4147454e5449443e3332383c2f4147454e5449443e3c47524f55504147454e5449443e3138313c2f47524f55504147454e5449443e3c414354494f4e5f545950453e413c2f414354494f4e5f545950453e3c4d4f4e49544f525f49443e303c2f4d4f4e49544f525f49443e3c534d4f44453e413c2f534d4f44453e3c444154415345543e636c61696d6170706c69636174696f6e3c2f444154415345543e3c524551554553544f525f49443e373331373c2f524551554553544f525f49443e3c2f56414c55453e&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._q9ojbu&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=55125")
      )
      .pause(1)
      .exec(http("request_111")
        .post("/Account/VerifyAccess")
      )
      .exec(http("request_112")
        .get("/DXR.axd?r=0_2303-O3Vxm"))
    }

    def claimSaveForm = {
        exec(saveForm)
        .pause(2)
        .exec(http("request_114")
          .get("/works/request_lst.aspx")
        )
        .exec(http("request_115")
          .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
        .exec(http("request_116")
          .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
        .exec(http("request_117")
          .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
        .exec(http("request_118")
          .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
        .exec(http("request_119")
          .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
        .exec(http("request_120")
          .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
        .exec(http("request_121")
          .get(uri4 + "?family=Open+Sans:300,400,600,700"))
        .exec(http("request_122")
          .get(uri4 + "?family=Roboto:400,300,500,700"))
        .exec(http("request_123")
          .post("/verify_access.ashx")
        )
        .exec(http("request_124")
          .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
        )
        .exec(http("request_125")
          .get(uri3 + "?v=4.7.0")
        )
        .pause(145.milliseconds)
        .exec(http("request_126")
          .get("/Notifications/GetNotificationCounts")
        )
        .exec(http("request_127")
          .get("/Notifications/ViewNotifications?type=cu1Pxf5hpXL5MZLrarBXA3nMz9Pqj1H4Ebosslxt13MeEJAG2APOUhxmFxOsCeiveXfqtuSz7P/qFasDOUXFONlEBGjoV4adxLcCz5YA9dgO+Oqg+MCCN5LwfIR4BnjoOtSjy/C4LibPmnHGcESoO+3R8EIU/G1caRwlPTkkFFs=")
        )
        .pause(119.milliseconds)
        .exec(http("request_128")
          .get("/Notifications/GetNotificationsList?row=8")
        )
    }
    def claimApproveForm = {
      exec(saveApprove)
        .pause(2)
        .exec(http("request_114")
          .get("/works/request_lst.aspx")
        )
        .exec(http("request_115")
          .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
        .exec(http("request_116")
          .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
        .exec(http("request_117")
          .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
        .exec(http("request_118")
          .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
        .exec(http("request_119")
          .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
        .exec(http("request_120")
          .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
        .exec(http("request_121")
          .get(uri4 + "?family=Open+Sans:300,400,600,700"))
        .exec(http("request_122")
          .get(uri4 + "?family=Roboto:400,300,500,700"))
        .exec(http("request_123")
          .post("/verify_access.ashx")
        )
        .exec(http("request_124")
          .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
        )
        .exec(http("request_125")
          .get(uri3 + "?v=4.7.0")
        )
        .pause(145.milliseconds)
        .exec(http("request_126")
          .get("/Notifications/GetNotificationCounts")
        )
        .exec(http("request_127")
          .get("/Notifications/ViewNotifications?type=cu1Pxf5hpXL5MZLrarBXA3nMz9Pqj1H4Ebosslxt13MeEJAG2APOUhxmFxOsCeiveXfqtuSz7P/qFasDOUXFONlEBGjoV4adxLcCz5YA9dgO+Oqg+MCCN5LwfIR4BnjoOtSjy/C4LibPmnHGcESoO+3R8EIU/G1caRwlPTkkFFs=")
        )
        .pause(119.milliseconds)
        .exec(http("request_128")
          .get("/Notifications/GetNotificationsList?row=8")
        )
    }

    def claimRejectForm = {
      exec(saveReject)
        .pause(2)
        .exec(http("request_114")
          .get("/works/request_lst.aspx")
        )
        .exec(http("request_115")
          .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
        .exec(http("request_116")
          .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
        .exec(http("request_117")
          .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
        .exec(http("request_118")
          .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
        .exec(http("request_119")
          .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
        .exec(http("request_120")
          .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
        .exec(http("request_121")
          .get(uri4 + "?family=Open+Sans:300,400,600,700"))
        .exec(http("request_122")
          .get(uri4 + "?family=Roboto:400,300,500,700"))
        .exec(http("request_123")
          .post("/verify_access.ashx")
        )
        .exec(http("request_124")
          .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
        )
        .exec(http("request_125")
          .get(uri3 + "?v=4.7.0")
        )
        .pause(145.milliseconds)
        .exec(http("request_126")
          .get("/Notifications/GetNotificationCounts")
        )
        .exec(http("request_127")
          .get("/Notifications/ViewNotifications?type=cu1Pxf5hpXL5MZLrarBXA3nMz9Pqj1H4Ebosslxt13MeEJAG2APOUhxmFxOsCeiveXfqtuSz7P/qFasDOUXFONlEBGjoV4adxLcCz5YA9dgO+Oqg+MCCN5LwfIR4BnjoOtSjy/C4LibPmnHGcESoO+3R8EIU/G1caRwlPTkkFFs=")
        )
        .pause(119.milliseconds)
        .exec(http("request_128")
          .get("/Notifications/GetNotificationsList?row=8")
        )
    }

    def logout = {
      exec(http("Logout Process")
        .post("/works/request_lst.aspx")
        .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$lbLogout")
        .formParam("__EVENTARGUMENT", "")
        .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
        .formParam("__VIEWSTATE", "${viewState}")
        .formParam("__VIEWSTATEGENERATOR", "197FAB68")
        .formParam("ctl00$ctl00$ctl00$selCultureName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl12$gpCustomPager$txtPageSize", "50")
        .check(status.is(302)))
        .exec(http("Login - After Logout")
          .get("/Account/Login")
        )
        .exec(http("request_84")
          .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
        )
        .exec(http("request_85")
          .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-4WXkk")
        )
        .exec(http("request_86")
          .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-lUXkk")
        )
        .exec(http("request_87")
          .get("/DXR.axd?r=1_58-lUXkk")
        )
        .exec(http("request_88")
          .get("/bundles/jquery?v=w1vknpWt6KqlZcHeJQvaK6VbvvXt1Go8HcGH_DqKzzo1")
        )
        .pause(133.milliseconds)
        .exec(http("request_89")
          .get("/Content/Images/bg-login.jpg?V=03")
        )
        .exec(http("request_90")
          .get("/Content/fonts/icomoon.ttf?5vru0d")
        )
    }




}
