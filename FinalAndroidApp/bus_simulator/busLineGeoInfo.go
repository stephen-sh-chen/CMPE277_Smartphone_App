package main

var busLinesGeoInfo = [1]string{
	"-122.14292,37.44198,0.0 -122.14318,37.44215,0.0 -122.14302,37.44219,0.0 -122.1426,37.4423,0.0 -122.14178,37.44254,0.0 -122.14137,37.44265,0.0 -122.14104,37.44275,0.0 -122.1407,37.44285,0.0 -122.14029,37.44297,0.0 -122.13976,37.44312,0.0 -122.13933,37.44324,0.0 -122.13865,37.44343,0.0 -122.13758,37.44374,0.0 -122.13684,37.44395,0.0 -122.13562,37.4443,0.0 -122.13476,37.44455,0.0 -122.13458,37.44461,0.0 -122.13353,37.4449,0.0 -122.1326,37.44516,0.0 -122.13204,37.44533,0.0 -122.13066,37.44572,0.0 -122.12976,37.44599,0.0 -122.12803,37.44649,0.0 -122.12754,37.44663,0.0 -122.1271,37.44675,0.0 -122.12666,37.44688,0.0 -122.12626,37.447,0.0 -122.12614,37.44704,0.0 -122.12609,37.44707,0.0 -122.12602,37.4471,0.0 -122.12562,37.44727,0.0 -122.1255,37.44729,0.0 -122.12537,37.44734,0.0 -122.12526,37.44739,0.0 -122.12518,37.44739,0.0 -122.12514,37.4474,0.0 -122.12511,37.44741,0.0 -122.12507,37.44744,0.0 -122.12502,37.44746,0.0 -122.12497,37.44748,0.0 -122.12492,37.4475,0.0 -122.12487,37.44752,0.0 -122.1248,37.44754,0.0 -122.12475,37.44755,0.0 -122.12471,37.44756,0.0 -122.12465,37.44757,0.0 -122.12459,37.44758,0.0 -122.12445,37.4476,0.0 -122.12422,37.44762,0.0 -122.12368,37.44769,0.0 -122.12345,37.44772,0.0 -122.12339,37.44772,0.0 -122.12335,37.44772,0.0 -122.12328,37.44772,0.0 -122.12321,37.44772,0.0 -122.12314,37.44772,0.0 -122.12309,37.44772,0.0 -122.12305,37.44772,0.0 -122.12299,37.44771,0.0 -122.12294,37.44771,0.0 -122.12286,37.4477,0.0 -122.12271,37.44767,0.0 -122.12256,37.44764,0.0 -122.12247,37.44762,0.0 -122.12237,37.44759,0.0 -122.12231,37.44757,0.0 -122.12229,37.44756,0.0 -122.12224,37.44754,0.0 -122.12216,37.44751,0.0 -122.12206,37.44747,0.0 -122.12203,37.44745,0.0 -122.12198,37.44742,0.0 -122.12191,37.44739,0.0 -122.12184,37.44734,0.0 -122.12179,37.44731,0.0 -122.12174,37.44728,0.0 -122.12171,37.44726,0.0 -122.12164,37.44721,0.0 -122.12158,37.44716,0.0 -122.12155,37.44713,0.0 -122.12142,37.447,0.0 -122.12131,37.4469,0.0 -122.12125,37.44684,0.0 -122.12123,37.44682,0.0 -122.1212,37.44679,0.0 -122.12119,37.44677,0.0 -122.12108,37.44665,0.0 -122.12075,37.44635,0.0 -122.12072,37.44633,0.0 -122.12063,37.44625,0.0 -122.12052,37.44614,0.0 -122.12043,37.44606,0.0 -122.12037,37.446,0.0 -122.12025,37.44588,0.0 -122.12012,37.44577,0.0 -122.11994,37.44561,0.0 -122.11983,37.44553,0.0 -122.11974,37.44547,0.0 -122.11967,37.44542,0.0 -122.11958,37.44538,0.0 -122.11945,37.44534,0.0 -122.11885,37.44476,0.0 -122.11838,37.44432,0.0 -122.11615,37.44219,0.0 -122.11449,37.44062,0.0 -122.11427,37.44041,0.0 -122.11412,37.44026,0.0 -122.1139,37.44006,0.0 -122.11377,37.43994,0.0 -122.11365,37.43982,0.0 -122.1105,37.43684,0.0 -122.10648,37.43302,0.0 -122.10569,37.43222,0.0 -122.10542,37.43196,0.0 -122.10514,37.4317,0.0 -122.1041,37.43069,0.0 -122.10388,37.43049,0.0 -122.10343,37.43006,0.0 -122.10324,37.42988,0.0 -122.10207,37.42877,0.0 -122.10151,37.42823,0.0 -122.10143,37.42816,0.0 -122.10125,37.42798,0.0 -122.10086,37.42761,0.0 -122.1,37.42678,0.0 -122.09918,37.42601,0.0 -122.09876,37.42562,0.0 -122.09848,37.42537,0.0 -122.09804,37.42498,0.0 -122.0976,37.42463,0.0 -122.09727,37.42436,0.0 -122.09653,37.42381,0.0 -122.09627,37.42362,0.0 -122.09586,37.42332,0.0 -122.09536,37.42296,0.0 -122.09426,37.42217,0.0 -122.09287,37.42116,0.0 -122.09259,37.42094,0.0 -122.09258,37.42094,0.0 -122.09252,37.42089,0.0 -122.09248,37.42086,0.0 -122.09244,37.42083,0.0 -122.0924,37.42081,0.0 -122.09034,37.41932,0.0 -122.08999,37.41905,0.0 -122.08713,37.41699,0.0 -122.08698,37.41688,0.0 -122.0869,37.41683,0.0 -122.08668,37.41667,0.0 -122.08666,37.41666,0.0 -122.08666,37.41665,0.0 -122.08662,37.41663,0.0 -122.08661,37.41662,0.0 -122.08634,37.41643,0.0 -122.08629,37.41639,0.0 -122.08543,37.41575,0.0 -122.08476,37.41527,0.0 -122.08398,37.41471,0.0 -122.08397,37.41471,0.0 -122.08396,37.4147,0.0 -122.08395,37.4147,0.0 -122.08387,37.41463,0.0 -122.08382,37.4146,0.0 -122.08303,37.41407,0.0 -122.08219,37.4136,0.0 -122.08199,37.4135,0.0 -122.08149,37.41323,0.0 -122.08105,37.41303,0.0 -122.0806,37.41282,0.0 -122.08041,37.41273,0.0 -122.07938,37.41231,0.0 -122.07817,37.41182,0.0 -122.078,37.41175,0.0 -122.07798,37.41174,0.0 -122.07757,37.41157,0.0 -122.07698,37.41133,0.0 -122.07613,37.41096,0.0 -122.07535,37.41063,0.0 -122.07409,37.41014,0.0 -122.07214,37.40935,0.0 -122.0709,37.40885,0.0 -122.07083,37.40882,0.0 -122.07081,37.40881,0.0 -122.0708,37.40881,0.0 -122.07079,37.40881,0.0 -122.07075,37.40879,0.0 -122.07067,37.40876,0.0 -122.07064,37.40874,0.0 -122.07062,37.40873,0.0 -122.07055,37.40871,0.0 -122.07013,37.40855,0.0 -122.07007,37.40853,0.0 -122.07006,37.40853,0.0 -122.07005,37.40852,0.0 -122.06986,37.40846,0.0 -122.06964,37.40838,0.0 -122.06958,37.40836,0.0 -122.06957,37.40836,0.0 -122.06956,37.40836,0.0 -122.06925,37.40825,0.0 -122.06907,37.4082,0.0 -122.06905,37.40819,0.0 -122.06875,37.4081,0.0 -122.06867,37.40809,0.0 -122.06831,37.40798,0.0 -122.0681,37.40792,0.0 -122.0673,37.40774,0.0 -122.06644,37.40756,0.0 -122.06638,37.40754,0.0 -122.06636,37.40754,0.0 -122.06634,37.40753,0.0 -122.06633,37.40753,0.0 -122.06626,37.40752,0.0 -122.06624,37.40751,0.0 -122.06413,37.40706,0.0 -122.06375,37.40697,0.0 -122.06086,37.40634,0.0 -122.0602,37.4062,0.0 -122.05737,37.40558,0.0 -122.05612,37.4053,0.0 -122.05575,37.4052,0.0 -122.05523,37.40506,0.0 -122.05471,37.40492,0.0 -122.05194,37.40416,0.0 -122.05172,37.40411,0.0 -122.0514,37.40403,0.0 -122.05139,37.40402,0.0 -122.05126,37.40399,0.0 -122.05125,37.40399,0.0 -122.05124,37.40399,0.0 -122.05117,37.40397,0.0 -122.0511,37.40395,0.0 -122.05093,37.40392,0.0 -122.05078,37.40388,0.0 -122.04737,37.40313,0.0 -122.04665,37.40298,0.0 -122.04592,37.40282,0.0 -122.03742,37.40096,0.0 -122.03644,37.40074,0.0 -122.03578,37.40059,0.0 -122.03547,37.40041,0.0 -122.03542,37.40038,0.0 -122.03536,37.40035,0.0 -122.03532,37.40031,0.0 -122.03526,37.40027,0.0 -122.03524,37.40023,0.0 -122.03522,37.4002,0.0 -122.0352,37.40017,0.0 -122.03519,37.40013,0.0 -122.03518,37.4001,0.0 -122.03518,37.40006,0.0 -122.03518,37.40004,0.0 -122.03518,37.4,0.0 -122.03519,37.39996,0.0 -122.0352,37.39993,0.0 -122.03523,37.39987,0.0 -122.03527,37.39983,0.0 -122.03531,37.39979,0.0 -122.03535,37.39975,0.0 -122.0354,37.39971,0.0 -122.03548,37.39965,0.0 -122.03559,37.39959,0.0 -122.03568,37.39955,0.0 -122.0358,37.39951,0.0 -122.03594,37.39947,0.0 -122.03605,37.39946,0.0 -122.03617,37.39945,0.0 -122.03627,37.39946,0.0 -122.03635,37.39949,0.0 -122.03643,37.39952,0.0 -122.03651,37.39957,0.0 -122.03656,37.39963,0.0 -122.03661,37.3997,0.0 -122.03663,37.39975,0.0 -122.03664,37.39981,0.0 -122.03664,37.39987,0.0 -122.03664,37.3999,0.0 -122.03663,37.39993,0.0 -122.03662,37.39996,0.0 -122.03662,37.39998,0.0 -122.0366,37.40001,0.0 -122.03659,37.40003,0.0 -122.03657,37.40006,0.0 -122.03654,37.40009,0.0 -122.03651,37.40011,0.0 -122.03648,37.40013,0.0 -122.03645,37.40016,0.0 -122.03638,37.4002,0.0 -122.03631,37.40024,0.0 -122.03626,37.40027,0.0 -122.03619,37.40031,0.0 -122.03614,37.40034,0.0 -122.03612,37.40036,0.0 -122.03609,37.40039,0.0 -122.03607,37.40043,0.0 -122.03582,37.40053,0.0 -122.03569,37.40059,0.0 -122.0354,37.40071,0.0 -122.03539,37.40071,0.0 -122.03471,37.40098,0.0 -122.03431,37.40112,0.0 -122.03373,37.40132,0.0 -122.03326,37.40147,0.0 -122.03288,37.40158,0.0 -122.0322,37.40177,0.0 -122.03157,37.40192,0.0 -122.03092,37.40208,0.0 -122.03012,37.40229,0.0 -122.02931,37.40249,0.0 -122.02776,37.40287,0.0 -122.02707,37.40303,0.0 -122.02675,37.40309,0.0 -122.02655,37.40313,0.0 -122.0265,37.40314,0.0 -122.02604,37.40323,0.0 -122.02285,37.40373,0.0 -122.02208,37.4039,0.0 -122.02054,37.40425,0.0 -122.01864,37.40469,0.0 -122.01341,37.40589,0.0 -122.01317,37.40595,0.0 -122.01202,37.40621,0.0 -122.01151,37.40632,0.0 -122.01126,37.40638,0.0 -122.01016,37.40664,0.0 -122.00941,37.4068,0.0 -122.00849,37.40701,0.0 -122.00771,37.40719,0.0 -122.00702,37.40735,0.0 -122.00621,37.40754,0.0 -122.00487,37.40782,0.0 -122.00415,37.40798,0.0 -122.00333,37.40816,0.0 -122.00264,37.40831,0.0 -122.00144,37.40857,0.0 -122.00109,37.40863,0.0 -122.00024,37.40881,0.0 -121.99937,37.40901,0.0 -121.99873,37.40914,0.0 -121.99855,37.40918,0.0 -121.99786,37.40933,0.0 -121.99614,37.40971,0.0 -121.99586,37.40977,0.0 -121.99399,37.41017,0.0 -121.99247,37.4105,0.0 -121.99165,37.41068,0.0 -121.99012,37.41101,0.0 -121.98905,37.41127,0.0 -121.98854,37.41139,0.0 -121.98803,37.41153,0.0 -121.98744,37.41171,0.0 -121.98718,37.41178,0.0 -121.98686,37.41188,0.0 -121.98658,37.41196,0.0 -121.98656,37.41197,0.0 -121.98607,37.41213,0.0 -121.98517,37.41245,0.0 -121.98458,37.41266,0.0 -121.98442,37.41272,0.0 -121.98324,37.41322,0.0 -121.98282,37.41338,0.0 -121.9825,37.41351,0.0 -121.98197,37.41374,0.0 -121.98163,37.41388,0.0 -121.98076,37.41425,0.0 -121.98038,37.41441,0.0 -121.98024,37.41447,0.0 -121.98019,37.41449,0.0 -121.98,37.41457,0.0 -121.97932,37.41486,0.0 -121.97869,37.41512,0.0 -121.97815,37.41535,0.0 -121.97765,37.41557,0.0 -121.97746,37.41565,0.0 -121.97741,37.41566,0.0 -121.97734,37.41569,0.0 -121.97573,37.41636,0.0 -121.97404,37.41709,0.0 -121.97398,37.41711,0.0 -121.97355,37.41729,0.0 -121.97319,37.41744,0.0 -121.97318,37.41744,0.0 -121.97306,37.4175,0.0 -121.97301,37.41753,0.0 -121.97275,37.41763,0.0 -121.97193,37.41798,0.0 -121.97175,37.41805,0.0 -121.97151,37.41814,0.0 -121.97138,37.41819,0.0 -121.97125,37.41823,0.0 -121.97108,37.41829,0.0 -121.97097,37.41832,0.0 -121.97089,37.41835,0.0 -121.97058,37.41843,0.0 -121.97033,37.41849,0.0 -121.9701,37.41854,0.0 -121.97007,37.41855,0.0 -121.96981,37.4186,0.0 -121.96967,37.41862,0.0 -121.96948,37.41865,0.0 -121.96934,37.41867,0.0 -121.96921,37.41869,0.0 -121.96904,37.4187,0.0 -121.96883,37.41872,0.0 -121.96862,37.41873,0.0 -121.96838,37.41874,0.0 -121.9683,37.41874,0.0 -121.96808,37.41874,0.0 -121.96777,37.41875,0.0 -121.96746,37.41877,0.0 -121.96711,37.41878,0.0 -121.96645,37.4188,0.0 -121.96528,37.41884,0.0 -121.96398,37.41889,0.0 -121.96319,37.41891,0.0 -121.96221,37.41895,0.0 -121.96146,37.41898,0.0 -121.96121,37.41899,0.0 -121.9609,37.41901,0.0 -121.96012,37.41907,0.0 -121.95938,37.41913,0.0 -121.9592,37.41914,0.0 -121.95849,37.4192,0.0 -121.95802,37.41924,0.0 -121.95731,37.41928,0.0 -121.95722,37.41929,0.0 -121.95692,37.4193,0.0 -121.95625,37.41931,0.0 -121.95511,37.41931,0.0 -121.9548,37.4193,0.0 -121.95405,37.4193,0.0 -121.95263,37.4193,0.0 -121.94875,37.4193,0.0 -121.94749,37.4193,0.0 -121.94636,37.41929,0.0 -121.94428,37.41929,0.0 -121.94405,37.41929,0.0 -121.94383,37.41932,0.0 -121.9436,37.41936,0.0 -121.94333,37.4194,0.0 -121.94292,37.41949,0.0 -121.93989,37.42019,0.0 -121.93988,37.42019,0.0 -121.93987,37.42019,0.0 -121.93974,37.42022,0.0 -121.93973,37.42023,0.0 -121.93968,37.42024,0.0 -121.93797,37.42063,0.0 -121.93487,37.42133,0.0 -121.9332,37.42171,0.0 -121.93241,37.42188,0.0 -121.93213,37.42194,0.0 -121.93128,37.42209,0.0 -121.93095,37.42214,0.0 -121.93054,37.42218,0.0 -121.92981,37.42228,0.0 -121.92928,37.42234,0.0 -121.92885,37.42239,0.0 -121.92678,37.42256,0.0 -121.92585,37.42267,0.0 -121.92553,37.42265,0.0 -121.9251,37.4227,0.0 -121.92468,37.42277,0.0 -121.92415,37.42288,0.0 -121.92396,37.42292,0.0 -121.92377,37.42298,0.0 -121.92287,37.42324,0.0 -121.92231,37.4234,0.0 -121.92193,37.42349,0.0 -121.92164,37.42355,0.0 -121.92127,37.42361,0.0 -121.92079,37.42369,0.0 -121.92052,37.42373,0.0 -121.92038,37.42377,0.0 -121.92017,37.42383,0.0 -121.92003,37.42387,0.0 -121.91971,37.42398,0.0 -121.91968,37.424,0.0 -121.91937,37.42413,0.0 -121.91901,37.42434,0.0 -121.919,37.42435,0.0 -121.91896,37.42438,0.0 -121.91843,37.42474,0.0 -121.91814,37.42493,0.0 -121.91783,37.42511,0.0 -121.91759,37.42522,0.0 -121.91743,37.42529,0.0 -121.91737,37.42531,0.0 -121.91732,37.42532,0.0 -121.9172,37.42536,0.0 -121.91699,37.42542,0.0 -121.9168,37.42547,0.0 -121.91677,37.42548,0.0 -121.91655,37.42554,0.0 -121.91634,37.42559,0.0 -121.91627,37.42562,0.0 -121.916,37.42569,0.0 -121.91574,37.42576,0.0 -121.91497,37.42598,0.0 -121.91482,37.42603,0.0 -121.91396,37.4263,0.0 -121.91299,37.42659,0.0 -121.91241,37.42673,0.0 -121.91214,37.4268,0.0 -121.91149,37.42696,0.0 -121.91129,37.42702,0.0 -121.9112,37.42705,0.0 -121.91109,37.4271,0.0 -121.91093,37.42717,0.0 -121.91078,37.42726,0.0 -121.91068,37.42733,0.0 -121.91056,37.42742,0.0 -121.91042,37.42755,0.0 -121.91036,37.42761,0.0 -121.91021,37.4278,0.0 -121.91012,37.42798,0.0 -121.91006,37.42817,0.0 -121.90998,37.42843,0.0 -121.90993,37.42864,0.0 -121.90985,37.42899,0.0 -121.9098,37.42915,0.0 -121.90975,37.42929,0.0 -121.90973,37.42934,0.0 -121.9097,37.4294,0.0 -121.90968,37.42944,0.0 -121.90964,37.42951,0.0 -121.9096,37.42956,0.0 -121.90954,37.42963,0.0 -121.90949,37.42969,0.0 -121.90943,37.42974,0.0 -121.90939,37.42978,0.0 -121.90933,37.42983,0.0 -121.90926,37.42989,0.0 -121.90892,37.43015,0.0 -121.90862,37.43038,0.0 -121.90835,37.43059,0.0 -121.90821,37.43069,0.0 -121.90816,37.43073,0.0 -121.90811,37.43076,0.0 -121.90804,37.43081,0.0 -121.90798,37.43085,0.0 -121.90788,37.43091,0.0 -121.9078,37.43095,0.0 -121.90772,37.43099,0.0 -121.90759,37.43104,0.0 -121.90741,37.43112,0.0 -121.90721,37.43121,0.0 -121.90704,37.43127,0.0 -121.90696,37.4313,0.0 -121.90689,37.43132,0.0 -121.90674,37.43137,0.0 -121.90662,37.4314,0.0 -121.90651,37.43143,0.0 -121.90644,37.43145,0.0 -121.90628,37.43148,0.0 -121.90614,37.43151,0.0 -121.90594,37.43154,0.0 -121.90567,37.43157,0.0 -121.90546,37.4316,0.0 -121.90543,37.4316,0.0 -121.9049,37.43165,0.0 -121.90386,37.43176,0.0 -121.90338,37.43182,0.0 -121.9029,37.43187,0.0 -121.90217,37.43194,0.0 -121.90137,37.43201,0.0 -121.9005,37.43213,0.0 -121.89964,37.43222,0.0 -121.89946,37.43224,0.0 -121.8995,37.43235,0.0",
}