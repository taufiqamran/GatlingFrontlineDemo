package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BasicSalarySimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://orisoftst.orisoftsaas.com")
		.disableFollowRedirect
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"sec-gpc" -> "1",
		"upgrade-insecure-requests" -> "1")

	val headers_19 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1")

	val headers_20 = Map("Origin" -> "https://orisoftst.orisoftsaas.com")

	val headers_27 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dxcss" -> "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css",
		"dxscript" -> "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_29 = Map(
		"accept" -> "text/plain, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json; charset=UTF-8",
		"dxcss" -> "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css",
		"dxscript" -> "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_56 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dxcss" -> "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css",
		"dxscript" -> "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_58 = Map(
		"accept" -> "text/plain, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json; charset=UTF-8",
		"dxcss" -> "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css",
		"dxscript" -> "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_61 = Map(
		"accept" -> "text/html, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"dxcss" -> "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css",
		"dxscript" -> "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49",
		"origin" -> "https://orisoftst.orisoftsaas.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_62 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"sec-gpc" -> "1")

	val headers_63 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"dxcss" -> "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css",
		"dxscript" -> "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49",
		"origin" -> "https://orisoftst.orisoftsaas.com",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"sec-gpc" -> "1",
		"x-requested-with" -> "XMLHttpRequest")

    val uri1 = "https://maps.googleapis.com/maps/api/js"
    val uri3 = "https://fonts.googleapis.com/css"

	val chain_0 = exec(http("request_0")
			.get("/Transaction/BasicSalary")
			.headers(headers_0)
			.check(status.is(302)))
		.pause(7)
		.exec(http("request_1")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_2")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_3")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_4")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_5")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_6")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_7")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_8")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_9")
			.get("/TransactionMY/BasicSalary/MY/Listing")
			.headers(headers_0))
		.exec(http("request_10")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_11")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_12")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_13")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_14")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_15")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.exec(http("request_16")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_17")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("request_18")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_19")
			.get("/signalr/hubs")
			.headers(headers_19))
		.exec(http("request_20")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			.headers(headers_20))
		.pause(1)
		.exec(http("request_21")
			.get("/DXR.axd?r=0_5687-O3Vxm"))
		.exec(http("request_22")
			.get("/DXR.axd?r=0_2314-O3Vxm"))
		.exec(http("request_23")
			.get("/DXR.axd?r=0_2321-O3Vxm"))
		.exec(http("request_24")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.exec(http("request_25")
			.get("/DXR.axd?r=0_2216-O3Vxm"))
		.exec(http("request_26")
			.get("/DXR.axd?r=0_2316-O3Vxm"))
		.pause(522.milliseconds)
		.exec(http("request_27")
			.get("/Notifications/GetNotificationCounts")
			.headers(headers_27))
		.exec(http("request_28")
			.get("/Notifications/GetNotificationUserId")
			.headers(headers_27))
		.exec(http("request_29")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624615063429")
			.headers(headers_29))
		.pause(2)
		.exec(http("request_30")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=8DbwCCYC1xPY7ep%2BQq%2BJlwNSKmG8J1qMEDG5CXPeKLaHQRBSMHuAeSHha6mnBnGGQNyCpajLDiSpXP4pcMDGApKR57JPD8dXYk%2Fc7NEQS61M%2BFqxORfV5PqP7dT5UMjmI%2BfJv9qCvRdxiCaFUDOHOSkTzdFToeyq8x2rUF1zE9k%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624615063430")
			.headers(headers_29))
		.pause(2)
		.exec(http("request_31")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_32")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_33")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_34")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_35")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_36")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_37")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_38")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_39")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_40")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_41")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_42")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_43")
			.get("/TransactionMY/BasicSalary/MY/Details")
			.headers(headers_0))
		.exec(http("request_44")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_45")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.exec(http("request_46")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_47")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("request_48")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_49")
			.get("/signalr/hubs")
			.headers(headers_19))
		.exec(http("request_50")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			.headers(headers_20))
		.pause(1)
		.exec(http("request_51")
			.get("/DXR.axd?r=0_2314-O3Vxm"))
		.exec(http("request_52")
			.get("/DXR.axd?r=0_2321-O3Vxm"))
		.exec(http("request_53")
			.get("/DXR.axd?r=0_2316-O3Vxm"))
		.exec(http("request_54")
			.get("/DXR.axd?r=0_2216-O3Vxm"))
		.exec(http("request_55")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.pause(605.milliseconds)
		.exec(http("request_56")
			.get("/Notifications/GetNotificationCounts")
			.headers(headers_56))
		.exec(http("request_57")
			.get("/Notifications/GetNotificationUserId")
			.headers(headers_56))
		.exec(http("request_58")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624615070074")
			.headers(headers_58))
		.pause(1)
		.exec(http("request_59")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=ZpkietBR7O5QNOLfDQdN6pY65VrpkZWht4lkUYZb5B6nMEZe3gY5t5CUJj%2FYJkAUmZtoJjWI3LnSdSX8z6uScazhd1CFK7vGvqDrGeuytUTfI3k3WeyGFJNhb2nMzjbAimKbuAtPGXf3Xug21z6xqeLNwTV52TwXOjdQ%2BOwsKB0%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624615070075")
			.headers(headers_58))
		.pause(1)
		.exec(http("request_60")
			.get("/DXR.axd?r=0_2303-O3Vxm"))
		.exec(http("request_61")
			.post("/TransactionMY/BasicContribGridViewPartial")
			.headers(headers_61)
			.formParam("DXCallbackName", "gvContrib")
			.formParam("__DXCallbackArgument", "c0:KV|2;[];GB|19;14|CUSTOMCALLBACK0|;")
			.formParam("gvContrib", "{&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[],&quot;InsertedValues&quot;:{},&quot;UpdatedValues&quot;:{},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{},&quot;modifiedRowValues&quot;:{},&quot;deletedRowKeys&quot;:[]}},&quot;keys&quot;:[],&quot;callbackState&quot;:&quot;aM8Oovt1qXUggpu2Hl6qLWDiQZyO+KL5Y+u7yxACdBbpdc79kcZmvbs57CH73d6TBF0BF3XepYZ26XbkzelmKeOmx0hlTxeCF4ysPmWsfJ4Hqd5hnQpzLF6xDG/3JKOBpKcYAN8femFURzyjeB5W+kjZUWwDyANTFPwAPoMSTOOMFmLR7SZvUwTQXUXN9C+e3mJOuUMn5tsJk4w1z/BVG8sNRUF5BuWvHDMmwmfJqzGlgnkCPRFaR8wpo/w4hPwE4madYTkDicDY/mJ4gt7bjHNZyeGfUm/lwyKcm9GaUDt/bn3jCcLhel7e47Ug8sYU90vn+Fa76bBGsO3ocoRhOJxVHUflBf0smQRQl/vMlw7zBU/eB2HsNVGCUHtZjULLyzS8agqWPWDBfH1nVf/1sZ6X1PQBtDa3F4NeAHtowSOVcmtvt+xTd7siUx50hrKB2KJktXaZNct/4cVneTZNBPqfxA5Cl8QxH8Zdi9m5FVc=&quot;,&quot;selection&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXFREditorcol1_VI", "")
			.formParam("gvContrib$DXFREditorcol1", "")
			.formParam("gvContrib$DXFREditorcol1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvContrib$DXFREditorcol1$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXFREditorcol1$DDD$L", "")
			.formParam("gvContrib$DXFREditorcol2", "")
			.formParam("gvContrib_DXFREditorcol3_VI", "")
			.formParam("gvContrib$DXFREditorcol3", "")
			.formParam("gvContrib$DXFREditorcol3$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvContrib$DXFREditorcol3$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXFREditorcol3$DDD$L", "")
			.formParam("gvContrib$DXEditor1$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXEditor1_VI", "")
			.formParam("gvContrib$DXEditor1", "")
			.formParam("gvContrib$DXEditor1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvContrib$DXEditor1$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXEditor1$DDD$L", "")
			.formParam("gvContrib$DXEditor2$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXEditor2", "")
			.formParam("gvContrib$DXEditor3$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXEditor3_VI", "")
			.formParam("gvContrib$DXEditor3", "")
			.formParam("gvContrib$DXEditor3$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvContrib$DXEditor3$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXEditor3$DDD$L", "")
			.formParam("DXMVCEditorsValues", """{"LOCATION_ID_DDD_L":[279],"LOCATION_ID":279,"TRX_CODE":null,"TRX_DESCRIPTION":null,"LOCAL_DESCRIPTION":null,"INCOME_TYPE_DDD_L":["0"],"INCOME_TYPE":"0","STATUS_CODE_DDD_L":["A"],"STATUS_CODE":"A","AFFECT_FLAG01":0,"AFFECT_FLAG02":0,"AFFECT_FLAG04":0,"AFFECT_FLAG03":0,"AFFECT_FLAG06":0,"AFFECT_FLAG05":0,"REMARKS":null,"gvContrib_DXFREditorcol1_DDD_L":[],"gvContrib_DXFREditorcol1":null,"gvContrib_DXFREditorcol2":null,"gvContrib_DXFREditorcol3_DDD_L":[],"gvContrib_DXFREditorcol3":null,"gvContrib_DXEditor1_DDD_L":[],"gvContrib_DXEditor1":null,"gvContrib_DXEditor2":null,"gvContrib_DXEditor3_DDD_L":[],"gvContrib_DXEditor3":null}""")
			.formParam("DXMVCBatchEditingValuesRequestKey", "gvContrib")
			.formParam("DXMVCBatchEditingKeyFieldName", "ID")
			.formParam("RECORDSXML", "&lt;RECORDS&gt;&lt;/RECORDS&gt;")
			.formParam("LocId", "279"))
		.pause(686.milliseconds)
		.exec(http("request_62")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FTransactionMY%2FBasicSalary%2FMY%2FDetails&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._dcqwvd&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=43614")
			.headers(headers_62))
		.pause(6)
		.exec(http("request_63")
			.post("/Account/VerifyAccess")
			.headers(headers_63))
		.exec(http("request_64")
			.post("/Transaction/SaveTransaction?TransactionType=S_0")
			.headers(headers_63)
			.formParam("__RequestVerificationToken", "7uy2zFBInhnxYtTwdJqW_RHjP7_6q0jwojeDGcTC7ufXq4IHc6rH302p8F7QHGcRI9izWjVPlekFQZmHpQPqr_wJgL9r5Us8RgwbMHGeAIR3m7WMKpc8D3dAes4o3p4X--38mfSgssb4-vkLeaTPNQ2")
			.formParam("ID", "0")
			.formParam("ROWVERSION", "")
			.formParam("CUSTOMER_CODE", "")
			.formParam("EDITION_ID", "0")
			.formParam("tcTransaction", "{&quot;activeTabIndex&quot;:6}")
			.formParam("LOCATION_ID$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("LOCATION_ID_VI", "279")
			.formParam("LOCATION_ID", "ARC")
			.formParam("LOCATION_ID$DDDState", "{&quot;windowsState&quot;:&quot;1:1:12000:317:225:1:283:196:1:0:0:0&quot;}")
			.formParam("LOCATION_ID$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("LOCATION_ID$DDD$L", "279")
			.formParam("LOCATION_ID", "0")
			.formParam("TRX_CODE$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("TRX_CODE", "ABC123z")
			.formParam("TRX_DESCRIPTION$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("TRX_DESCRIPTION", "zxc")
			.formParam("LOCAL_DESCRIPTION", "")
			.formParam("INCOME_TYPE_VI", "0")
			.formParam("INCOME_TYPE", "Fixed")
			.formParam("INCOME_TYPE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("INCOME_TYPE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("INCOME_TYPE$DDD$L", "0")
			.formParam("STATUS_CODE_VI", "A")
			.formParam("STATUS_CODE", "Active")
			.formParam("STATUS_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("STATUS_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("STATUS_CODE$DDD$L", "A")
			.formParam("AFFECT_FLAG01", "U")
			.formParam("AFFECT_FLAG02", "U")
			.formParam("AFFECT_FLAG04", "U")
			.formParam("AFFECT_FLAG03", "U")
			.formParam("AFFECT_FLAG06", "U")
			.formParam("AFFECT_FLAG05", "U")
			.formParam("REMARKS", "")
			.formParam("gvContrib", "{&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[],&quot;InsertedValues&quot;:{},&quot;UpdatedValues&quot;:{},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{},&quot;modifiedRowValues&quot;:{},&quot;deletedRowKeys&quot;:[]}},&quot;keys&quot;:[],&quot;callbackState&quot;:&quot;aM8Oovt1qXUggpu2Hl6qLWDiQZyO+KL5Y+u7yxACdBbpdc79kcZmvbs57CH73d6TBF0BF3XepYZ26XbkzelmKeOmx0hlTxeCF4ysPmWsfJ4Hqd5hnQpzLF6xDG/3JKOBpKcYAN8femFURzyjeB5W+kjZUWwDyANTFPwAPoMSTOOMFmLR7SZvUwTQXUXN9C+e3mJOuUMn5tsJk4w1z/BVG8sNRUF5BuWvHDMmwmfJqzGlgnkCPRFaR8wpo/w4hPwE4madYTkDicDY/mJ4gt7bjHNZyeGfUm/lwyKcm9GaUDt/bn3jCcLhel7e47Ug8sYU90vn+Fa76bBGsO3ocoRhOJxVHUflBf0smQRQl/vMlw7zBU/eB2HsNVGCUHtZjULLyzS8agqWPWDBfH1nVf/1sZ6X1PQBtDa3F4NeAHtowSOVcmtvt+xTd7siUx50hrKB2KJktXaZNct/4cVneTZNBPqfxA5Cl8QxH8Zdi9m5FVc=&quot;,&quot;selection&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXFREditorcol1_VI", "")
			.formParam("gvContrib$DXFREditorcol1", "")
			.formParam("gvContrib$DXFREditorcol1$DDD$L", "")
			.formParam("gvContrib$DXFREditorcol2", "")
			.formParam("gvContrib_DXFREditorcol3_VI", "")
			.formParam("gvContrib$DXFREditorcol3", "")
			.formParam("gvContrib$DXFREditorcol3$DDD$L", "")
			.formParam("gvContrib_DXEditor1_VI", "")
			.formParam("gvContrib$DXEditor1", "")
			.formParam("gvContrib$DXEditor1$DDD$L", "")
			.formParam("gvContrib$DXEditor2", "")
			.formParam("gvContrib_DXEditor3_VI", "")
			.formParam("gvContrib$DXEditor3", "")
			.formParam("gvContrib$DXEditor3$DDD$L", "")
			.formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
			.formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
			.formParam("DXMVCEditorsValues", """{"LOCATION_ID_DDD_L":[279],"LOCATION_ID":279,"TRX_CODE":"ABC123z","TRX_DESCRIPTION":"zxc","LOCAL_DESCRIPTION":null,"INCOME_TYPE_DDD_L":["0"],"INCOME_TYPE":"0","STATUS_CODE_DDD_L":["A"],"STATUS_CODE":"A","AFFECT_FLAG01":0,"AFFECT_FLAG02":0,"AFFECT_FLAG04":0,"AFFECT_FLAG03":0,"AFFECT_FLAG06":0,"AFFECT_FLAG05":0,"REMARKS":null,"gvContrib_DXFREditorcol1_DDD_L":[],"gvContrib_DXFREditorcol1":null,"gvContrib_DXFREditorcol2":null,"gvContrib_DXFREditorcol3_DDD_L":[],"gvContrib_DXFREditorcol3":null,"gvContrib_DXEditor1_DDD_L":[],"gvContrib_DXEditor1":null,"gvContrib_DXEditor2":null,"gvContrib_DXEditor3_DDD_L":[],"gvContrib_DXEditor3":null}"""))
		.pause(3)
		.exec(http("request_65")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_66")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_67")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_68")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_69")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_70")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_71")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_72")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_73")
			.get("/TransactionMY/BasicSalary/MY/Listing")
			.headers(headers_0))
		.exec(http("request_74")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_75")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_76")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_77")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_78")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_79")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.exec(http("request_80")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_81")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("request_82")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_83")
			.get("/signalr/hubs")
			.headers(headers_19))
		.exec(http("request_84")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			.headers(headers_20))
		.pause(994.milliseconds)
		.exec(http("request_85")
			.get("/DXR.axd?r=0_5687-O3Vxm"))
		.exec(http("request_86")
			.get("/DXR.axd?r=0_2314-O3Vxm"))

val chain_1 = exec(http("request_87")
			.get("/DXR.axd?r=0_2321-O3Vxm"))
		.exec(http("request_88")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.exec(http("request_89")
			.get("/DXR.axd?r=0_2216-O3Vxm"))
		.exec(http("request_90")
			.get("/DXR.axd?r=0_2316-O3Vxm"))
		.pause(648.milliseconds)
		.exec(http("request_91")
			.get("/Notifications/GetNotificationUserId")
			.headers(headers_27))
		.exec(http("request_92")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624615088949")
			.headers(headers_29))
		.exec(http("request_93")
			.get("/Notifications/GetNotificationCounts")
			.headers(headers_27))
		.pause(758.milliseconds)
		.exec(http("request_94")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=U7ljuq5OUPatkc9YsKIc%2BDKh%2FMNe5X1PMEH6lLQWnosJ7qGwyqOwPNQjvYGJiyoxeYMXpoSlAL7%2Fod1%2BwLoyEDIfrgk89NVjERBLGlYFzyhMbMigU6rToL6Jw%2FMHGDbkB2VjZZepJWFTluU7Yaiko27KySkfuQoWQIFxa4CfkrU%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1624615088950")
			.headers(headers_29))
		.pause(3)
		.exec(http("request_95")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FTransactionMY%2FBasicSalary%2FMY%2FListing&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._nq00y7&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=105465")
			.headers(headers_62))

	val scn = scenario("BasicSalarySimulation").exec(
		chain_0, chain_1)

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}