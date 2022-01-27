/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.nwdaf.analytics.api;

import io.nwdaf.analytics.model.AnalyticsData;
import io.nwdaf.analytics.model.EventId;
import io.nwdaf.analytics.model.ProblemDetails;
import io.nwdaf.analytics.model.ProblemDetailsAnalyticsInfoRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
@Api(value = "analytics", description = "the analytics API")
public interface AnalyticsApi {

    Logger log = LoggerFactory.getLogger(AnalyticsApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Read a NWDAF Analytics", nickname = "getNWDAFAnalytics", notes = "", response = AnalyticsData.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "nnwdaf-analyticsinfo", description = "Access to the Nnwdaf_AnalyticsInfo API")
            })    }, tags={ "NWDAF Analytics (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Containing the analytics with parameters as relevant for the requesting NF service consumer.", response = AnalyticsData.class),
        @ApiResponse(code = 204, message = "No Content (The request NWDAF Analytics data does not exist)"),
        @ApiResponse(code = 400, message = "Bad request", response = ProblemDetails.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProblemDetails.class),
        @ApiResponse(code = 404, message = "Indicates that the NWDAF Analytics resource does not exist.", response = ProblemDetails.class),
        @ApiResponse(code = 406, message = "406 Not Acceptable"),
        @ApiResponse(code = 414, message = "URI Too Long", response = ProblemDetails.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = ProblemDetails.class),
        @ApiResponse(code = 500, message = "The request is rejected by the NWDAF and more details (not only the ProblemDetails) are returned.", response = ProblemDetailsAnalyticsInfoRequest.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Generic Error") })
    @RequestMapping(value = "/analytics",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<AnalyticsData> getNWDAFAnalytics(@NotNull @ApiParam(value = "Identify the analytics.", required = true) @Valid @RequestParam(value = "event-id", required = true) EventId eventId
,@ApiParam(value = "Identifies the analytics reporting requirement information.") @Valid @RequestParam(value = "ana-req", required = false)  
,@ApiParam(value = "Identify the analytics.") @Valid @RequestParam(value = "event-filter", required = false)  
,@ApiParam(value = "To filter irrelevant responses related to unsupported features") @Valid @RequestParam(value = "supported-features", required = false) String supportedFeatures
,@ApiParam(value = "Identify the target UE information.") @Valid @RequestParam(value = "tgt-ue", required = false)  
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"sliceLoadLevelInfos\" : [ {\n    \"numOfUes\" : {\n      \"number\" : 5,\n      \"variance\" : 5.637377\n    },\n    \"loadLevelInformation\" : 6,\n    \"snssais\" : [ {\n      \"sd\" : \"sd\",\n      \"sst\" : 37\n    }, {\n      \"sd\" : \"sd\",\n      \"sst\" : 37\n    } ],\n    \"exceedLoadLevelThrInd\" : true\n  }, {\n    \"numOfUes\" : {\n      \"number\" : 5,\n      \"variance\" : 5.637377\n    },\n    \"loadLevelInformation\" : 6,\n    \"snssais\" : [ {\n      \"sd\" : \"sd\",\n      \"sst\" : 37\n    }, {\n      \"sd\" : \"sd\",\n      \"sst\" : 37\n    } ],\n    \"exceedLoadLevelThrInd\" : true\n  } ],\n  \"ueComms\" : [ {\n    \"trafChar\" : {\n      \"fDescs\" : [ {\n        \"ethTrafficFilter\" : {\n          \"destMacAddr\" : \"destMacAddr\",\n          \"fDir\" : \"\",\n          \"ethType\" : \"ethType\",\n          \"vlanTags\" : [ \"vlanTags\", \"vlanTags\" ]\n        },\n        \"ipTrafficFilter\" : \"ipTrafficFilter\"\n      }, {\n        \"ethTrafficFilter\" : {\n          \"destMacAddr\" : \"destMacAddr\",\n          \"fDir\" : \"\",\n          \"ethType\" : \"ethType\",\n          \"vlanTags\" : [ \"vlanTags\", \"vlanTags\" ]\n        },\n        \"ipTrafficFilter\" : \"ipTrafficFilter\"\n      } ],\n      \"ulVol\" : 0\n    }\n  }, {\n    \"trafChar\" : {\n      \"fDescs\" : [ {\n        \"ethTrafficFilter\" : {\n          \"destMacAddr\" : \"destMacAddr\",\n          \"fDir\" : \"\",\n          \"ethType\" : \"ethType\",\n          \"vlanTags\" : [ \"vlanTags\", \"vlanTags\" ]\n        },\n        \"ipTrafficFilter\" : \"ipTrafficFilter\"\n      }, {\n        \"ethTrafficFilter\" : {\n          \"destMacAddr\" : \"destMacAddr\",\n          \"fDir\" : \"\",\n          \"ethType\" : \"ethType\",\n          \"vlanTags\" : [ \"vlanTags\", \"vlanTags\" ]\n        },\n        \"ipTrafficFilter\" : \"ipTrafficFilter\"\n      } ],\n      \"ulVol\" : 0\n    }\n  } ],\n  \"smccExps\" : [ {\n    \"smcceUeList\" : [ {\n      \"lowLevel\" : [ null, null ],\n      \"highLevel\" : [ null, null ],\n      \"mediumLevel\" : [ null, null ]\n    }, {\n      \"lowLevel\" : [ null, null ],\n      \"highLevel\" : [ null, null ],\n      \"mediumLevel\" : [ null, null ]\n    } ]\n  }, {\n    \"smcceUeList\" : [ {\n      \"lowLevel\" : [ null, null ],\n      \"highLevel\" : [ null, null ],\n      \"mediumLevel\" : [ null, null ]\n    }, {\n      \"lowLevel\" : [ null, null ],\n      \"highLevel\" : [ null, null ],\n      \"mediumLevel\" : [ null, null ]\n    } ]\n  } ],\n  \"anaMetaInfo\" : {\n    \"dataStatProps\" : [ \"\", \"\" ],\n    \"numSamples\" : 0,\n    \"dataWindow\" : { },\n    \"accuracy\" : \"\",\n    \"strategy\" : \"\"\n  },\n  \"start\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"nfLoadLevelInfos\" : [ {\n    \"nfInstanceId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"nfStorageUsage\" : 2,\n    \"nfLoadLevelpeak\" : 7,\n    \"nfStatus\" : {\n      \"statusRegistered\" : 70\n    },\n    \"nfCpuUsage\" : 9,\n    \"nfType\" : \"\",\n    \"nfSetId\" : \"nfSetId\",\n    \"nfMemoryUsage\" : 3,\n    \"nfLoadLevelAverage\" : 4\n  }, {\n    \"nfInstanceId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"nfStorageUsage\" : 2,\n    \"nfLoadLevelpeak\" : 7,\n    \"nfStatus\" : {\n      \"statusRegistered\" : 70\n    },\n    \"nfCpuUsage\" : 9,\n    \"nfType\" : \"\",\n    \"nfSetId\" : \"nfSetId\",\n    \"nfMemoryUsage\" : 3,\n    \"nfLoadLevelAverage\" : 4\n  } ],\n  \"svcExps\" : [ {\n    \"supis\" : [ \"supis\", \"supis\" ],\n    \"svcExprc\" : { },\n    \"dnn\" : \"dnn\",\n    \"appId\" : \"appId\",\n    \"ratType\" : \"\",\n    \"frequency\" : 403833\n  }, {\n    \"supis\" : [ \"supis\", \"supis\" ],\n    \"svcExprc\" : { },\n    \"dnn\" : \"dnn\",\n    \"appId\" : \"appId\",\n    \"ratType\" : \"\",\n    \"frequency\" : 403833\n  } ],\n  \"nsiLoadLevelInfos\" : [ {\n    \"networkArea\" : {\n      \"ncgis\" : [ {\n        \"nrCellId\" : \"nrCellId\"\n      }, {\n        \"nrCellId\" : \"nrCellId\"\n      } ],\n      \"tais\" : [ {\n        \"tac\" : \"tac\"\n      }, {\n        \"tac\" : \"tac\"\n      } ],\n      \"gRanNodeIds\" : [ {\n        \"eNbId\" : \"eNbId\",\n        \"wagfId\" : \"wagfId\",\n        \"tngfId\" : \"tngfId\",\n        \"gNbId\" : {\n          \"bitLength\" : 24,\n          \"gNBValue\" : \"gNBValue\"\n        },\n        \"n3IwfId\" : \"n3IwfId\",\n        \"ngeNbId\" : \"SMacroNGeNB-34B89\"\n      }, {\n        \"eNbId\" : \"eNbId\",\n        \"wagfId\" : \"wagfId\",\n        \"tngfId\" : \"tngfId\",\n        \"gNbId\" : {\n          \"bitLength\" : 24,\n          \"gNBValue\" : \"gNBValue\"\n        },\n        \"n3IwfId\" : \"n3IwfId\",\n        \"ngeNbId\" : \"SMacroNGeNB-34B89\"\n      } ],\n      \"ecgis\" : [ {\n        \"eutraCellId\" : \"eutraCellId\",\n        \"nid\" : \"nid\",\n        \"plmnId\" : {\n          \"mnc\" : \"mnc\",\n          \"mcc\" : \"mcc\"\n        }\n      }, {\n        \"eutraCellId\" : \"eutraCellId\",\n        \"nid\" : \"nid\",\n        \"plmnId\" : {\n          \"mnc\" : \"mnc\",\n          \"mcc\" : \"mcc\"\n        }\n      } ]\n    },\n    \"nsiId\" : \"nsiId\",\n    \"resUsage\" : { },\n    \"exceedLoadLevelThrInd\" : true\n  }, {\n    \"networkArea\" : {\n      \"ncgis\" : [ {\n        \"nrCellId\" : \"nrCellId\"\n      }, {\n        \"nrCellId\" : \"nrCellId\"\n      } ],\n      \"tais\" : [ {\n        \"tac\" : \"tac\"\n      }, {\n        \"tac\" : \"tac\"\n      } ],\n      \"gRanNodeIds\" : [ {\n        \"eNbId\" : \"eNbId\",\n        \"wagfId\" : \"wagfId\",\n        \"tngfId\" : \"tngfId\",\n        \"gNbId\" : {\n          \"bitLength\" : 24,\n          \"gNBValue\" : \"gNBValue\"\n        },\n        \"n3IwfId\" : \"n3IwfId\",\n        \"ngeNbId\" : \"SMacroNGeNB-34B89\"\n      }, {\n        \"eNbId\" : \"eNbId\",\n        \"wagfId\" : \"wagfId\",\n        \"tngfId\" : \"tngfId\",\n        \"gNbId\" : {\n          \"bitLength\" : 24,\n          \"gNBValue\" : \"gNBValue\"\n        },\n        \"n3IwfId\" : \"n3IwfId\",\n        \"ngeNbId\" : \"SMacroNGeNB-34B89\"\n      } ],\n      \"ecgis\" : [ {\n        \"eutraCellId\" : \"eutraCellId\",\n        \"nid\" : \"nid\",\n        \"plmnId\" : {\n          \"mnc\" : \"mnc\",\n          \"mcc\" : \"mcc\"\n        }\n      }, {\n        \"eutraCellId\" : \"eutraCellId\",\n        \"nid\" : \"nid\",\n        \"plmnId\" : {\n          \"mnc\" : \"mnc\",\n          \"mcc\" : \"mcc\"\n        }\n      } ]\n    },\n    \"nsiId\" : \"nsiId\",\n    \"resUsage\" : { },\n    \"exceedLoadLevelThrInd\" : true\n  } ],\n  \"userDataCongInfos\" : [ {\n    \"congestionInfo\" : {\n      \"topAppListUl\" : [ {\n        \"ipTrafficFilter\" : {\n          \"flowDescriptions\" : [ \"flowDescriptions\", \"flowDescriptions\" ],\n          \"flowId\" : 6\n        }\n      }, {\n        \"ipTrafficFilter\" : {\n          \"flowDescriptions\" : [ \"flowDescriptions\", \"flowDescriptions\" ],\n          \"flowId\" : 6\n        }\n      } ],\n      \"nsi\" : {\n        \"nfStorageUsage\" : 9,\n        \"congLevel\" : 9,\n        \"nfCpuUsage\" : 6,\n        \"nfMemoryUsage\" : 8,\n        \"nfLoadLevel\" : 9\n      },\n      \"topAppListDl\" : [ null, null ],\n      \"congType\" : \"\"\n    }\n  }, {\n    \"congestionInfo\" : {\n      \"topAppListUl\" : [ {\n        \"ipTrafficFilter\" : {\n          \"flowDescriptions\" : [ \"flowDescriptions\", \"flowDescriptions\" ],\n          \"flowId\" : 6\n        }\n      }, {\n        \"ipTrafficFilter\" : {\n          \"flowDescriptions\" : [ \"flowDescriptions\", \"flowDescriptions\" ],\n          \"flowId\" : 6\n        }\n      } ],\n      \"nsi\" : {\n        \"nfStorageUsage\" : 9,\n        \"congLevel\" : 9,\n        \"nfCpuUsage\" : 6,\n        \"nfMemoryUsage\" : 8,\n        \"nfLoadLevel\" : 9\n      },\n      \"topAppListDl\" : [ null, null ],\n      \"congType\" : \"\"\n    }\n  } ],\n  \"abnorBehavrs\" : [ {\n    \"supis\" : [ null, null ],\n    \"excep\" : {\n      \"excepTrend\" : \"\",\n      \"excepId\" : \"\",\n      \"excepLevel\" : 3\n    },\n    \"addtMeasInfo\" : {\n      \"ddosAttack\" : {\n        \"ipv6Addrs\" : [ null, null ],\n        \"ipv4Addrs\" : [ null, null ]\n      },\n      \"unexpFlowTeps\" : [ null, null ],\n      \"unexpWakes\" : [ null, null ],\n      \"circums\" : [ { }, { } ]\n    }\n  }, {\n    \"supis\" : [ null, null ],\n    \"excep\" : {\n      \"excepTrend\" : \"\",\n      \"excepId\" : \"\",\n      \"excepLevel\" : 3\n    },\n    \"addtMeasInfo\" : {\n      \"ddosAttack\" : {\n        \"ipv6Addrs\" : [ null, null ],\n        \"ipv4Addrs\" : [ null, null ]\n      },\n      \"unexpFlowTeps\" : [ null, null ],\n      \"unexpWakes\" : [ null, null ],\n      \"circums\" : [ { }, { } ]\n    }\n  } ],\n  \"nwPerfs\" : [ {\n    \"nwPerfType\" : \"\"\n  }, {\n    \"nwPerfType\" : \"\"\n  } ],\n  \"ueMobs\" : [ {\n    \"duration\" : 1,\n    \"recurringTime\" : {\n      \"daysOfWeek\" : [ 1, 1, 1, 1, 1, 1 ],\n      \"timeOfDayStart\" : \"timeOfDayStart\"\n    },\n    \"locInfos\" : [ {\n      \"loc\" : {\n        \"geraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 16269,\n          \"mscNumber\" : \"mscNumber\",\n          \"vlrNumber\" : \"vlrNumber\",\n          \"locationNumber\" : \"locationNumber\",\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"eutraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 22435,\n          \"ignoreEcgi\" : false,\n          \"ignoreTai\" : false,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"nrLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 24436,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"n3gaLocation\" : {\n          \"ueIpv4Addr\" : \"198.51.100.1\",\n          \"twapId\" : {\n            \"bssId\" : \"bssId\",\n            \"ssId\" : \"ssId\"\n          },\n          \"hfcNodeId\" : {\n            \"hfcNId\" : \"hfcNId\"\n          },\n          \"protocol\" : \"\",\n          \"tnapId\" : {\n            \"bssId\" : \"bssId\",\n            \"civicAddress\" : \"\",\n            \"ssId\" : \"ssId\"\n          },\n          \"w5gbanLineType\" : \"\",\n          \"ueIpv6Addr\" : \"2001:db8:85a3::8a2e:370:7334\",\n          \"gci\" : \"gci\",\n          \"n3IwfId\" : \"n3IwfId\"\n        },\n        \"utraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 3843,\n          \"cgi\" : {\n            \"cellId\" : \"cellId\",\n            \"lac\" : \"lac\"\n          },\n          \"lai\" : {\n            \"lac\" : \"lac\"\n          },\n          \"sai\" : {\n            \"sac\" : \"sac\",\n            \"lac\" : \"lac\"\n          },\n          \"rai\" : {\n            \"rac\" : \"rac\",\n            \"lac\" : \"lac\"\n          },\n          \"geodeticInformation\" : \"geodeticInformation\"\n        }\n      }\n    }, {\n      \"loc\" : {\n        \"geraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 16269,\n          \"mscNumber\" : \"mscNumber\",\n          \"vlrNumber\" : \"vlrNumber\",\n          \"locationNumber\" : \"locationNumber\",\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"eutraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 22435,\n          \"ignoreEcgi\" : false,\n          \"ignoreTai\" : false,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"nrLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 24436,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"n3gaLocation\" : {\n          \"ueIpv4Addr\" : \"198.51.100.1\",\n          \"twapId\" : {\n            \"bssId\" : \"bssId\",\n            \"ssId\" : \"ssId\"\n          },\n          \"hfcNodeId\" : {\n            \"hfcNId\" : \"hfcNId\"\n          },\n          \"protocol\" : \"\",\n          \"tnapId\" : {\n            \"bssId\" : \"bssId\",\n            \"civicAddress\" : \"\",\n            \"ssId\" : \"ssId\"\n          },\n          \"w5gbanLineType\" : \"\",\n          \"ueIpv6Addr\" : \"2001:db8:85a3::8a2e:370:7334\",\n          \"gci\" : \"gci\",\n          \"n3IwfId\" : \"n3IwfId\"\n        },\n        \"utraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 3843,\n          \"cgi\" : {\n            \"cellId\" : \"cellId\",\n            \"lac\" : \"lac\"\n          },\n          \"lai\" : {\n            \"lac\" : \"lac\"\n          },\n          \"sai\" : {\n            \"sac\" : \"sac\",\n            \"lac\" : \"lac\"\n          },\n          \"rai\" : {\n            \"rac\" : \"rac\",\n            \"lac\" : \"lac\"\n          },\n          \"geodeticInformation\" : \"geodeticInformation\"\n        }\n      }\n    } ]\n  }, {\n    \"duration\" : 1,\n    \"recurringTime\" : {\n      \"daysOfWeek\" : [ 1, 1, 1, 1, 1, 1 ],\n      \"timeOfDayStart\" : \"timeOfDayStart\"\n    },\n    \"locInfos\" : [ {\n      \"loc\" : {\n        \"geraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 16269,\n          \"mscNumber\" : \"mscNumber\",\n          \"vlrNumber\" : \"vlrNumber\",\n          \"locationNumber\" : \"locationNumber\",\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"eutraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 22435,\n          \"ignoreEcgi\" : false,\n          \"ignoreTai\" : false,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"nrLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 24436,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"n3gaLocation\" : {\n          \"ueIpv4Addr\" : \"198.51.100.1\",\n          \"twapId\" : {\n            \"bssId\" : \"bssId\",\n            \"ssId\" : \"ssId\"\n          },\n          \"hfcNodeId\" : {\n            \"hfcNId\" : \"hfcNId\"\n          },\n          \"protocol\" : \"\",\n          \"tnapId\" : {\n            \"bssId\" : \"bssId\",\n            \"civicAddress\" : \"\",\n            \"ssId\" : \"ssId\"\n          },\n          \"w5gbanLineType\" : \"\",\n          \"ueIpv6Addr\" : \"2001:db8:85a3::8a2e:370:7334\",\n          \"gci\" : \"gci\",\n          \"n3IwfId\" : \"n3IwfId\"\n        },\n        \"utraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 3843,\n          \"cgi\" : {\n            \"cellId\" : \"cellId\",\n            \"lac\" : \"lac\"\n          },\n          \"lai\" : {\n            \"lac\" : \"lac\"\n          },\n          \"sai\" : {\n            \"sac\" : \"sac\",\n            \"lac\" : \"lac\"\n          },\n          \"rai\" : {\n            \"rac\" : \"rac\",\n            \"lac\" : \"lac\"\n          },\n          \"geodeticInformation\" : \"geodeticInformation\"\n        }\n      }\n    }, {\n      \"loc\" : {\n        \"geraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 16269,\n          \"mscNumber\" : \"mscNumber\",\n          \"vlrNumber\" : \"vlrNumber\",\n          \"locationNumber\" : \"locationNumber\",\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"eutraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 22435,\n          \"ignoreEcgi\" : false,\n          \"ignoreTai\" : false,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"nrLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 24436,\n          \"geodeticInformation\" : \"geodeticInformation\"\n        },\n        \"n3gaLocation\" : {\n          \"ueIpv4Addr\" : \"198.51.100.1\",\n          \"twapId\" : {\n            \"bssId\" : \"bssId\",\n            \"ssId\" : \"ssId\"\n          },\n          \"hfcNodeId\" : {\n            \"hfcNId\" : \"hfcNId\"\n          },\n          \"protocol\" : \"\",\n          \"tnapId\" : {\n            \"bssId\" : \"bssId\",\n            \"civicAddress\" : \"\",\n            \"ssId\" : \"ssId\"\n          },\n          \"w5gbanLineType\" : \"\",\n          \"ueIpv6Addr\" : \"2001:db8:85a3::8a2e:370:7334\",\n          \"gci\" : \"gci\",\n          \"n3IwfId\" : \"n3IwfId\"\n        },\n        \"utraLocation\" : {\n          \"geographicalInformation\" : \"geographicalInformation\",\n          \"ageOfLocationInformation\" : 3843,\n          \"cgi\" : {\n            \"cellId\" : \"cellId\",\n            \"lac\" : \"lac\"\n          },\n          \"lai\" : {\n            \"lac\" : \"lac\"\n          },\n          \"sai\" : {\n            \"sac\" : \"sac\",\n            \"lac\" : \"lac\"\n          },\n          \"rai\" : {\n            \"rac\" : \"rac\",\n            \"lac\" : \"lac\"\n          },\n          \"geodeticInformation\" : \"geodeticInformation\"\n        }\n      }\n    } ]\n  } ],\n  \"qosSustainInfos\" : [ {\n    \"qosFlowRetThd\" : {\n      \"relTimeUnit\" : \"\"\n    },\n    \"ranUeThrouThd\" : \"ranUeThrouThd\"\n  }, {\n    \"qosFlowRetThd\" : {\n      \"relTimeUnit\" : \"\"\n    },\n    \"ranUeThrouThd\" : \"ranUeThrouThd\"\n  } ],\n  \"suppFeat\" : \"suppFeat\"\n}", AnalyticsData.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AnalyticsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
