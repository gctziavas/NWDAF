/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.nwdaf.analytics.api;

import io.nwdaf.analytics.model.ContextData;
import io.nwdaf.analytics.model.ProblemDetails;
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
@Api(value = "context", description = "the context API")
public interface ContextApi {

    Logger log = LoggerFactory.getLogger(ContextApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Get context information related to analytics subscriptions.", nickname = "getNwdafContext", notes = "", response = ContextData.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "nnwdaf-analyticsinfo", description = "Access to the Nnwdaf_AnalyticsInfo API")
            })    }, tags={ "NWDAF Context API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Contains context information related to analytics subscriptions corresponding with one or more context identifiers.", response = ContextData.class),
        @ApiResponse(code = 204, message = "No Content (No context information could be retrieved for the requested context identifiers)."),
        @ApiResponse(code = 400, message = "Bad request", response = ProblemDetails.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProblemDetails.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class),
        @ApiResponse(code = 406, message = "406 Not Acceptable"),
        @ApiResponse(code = 414, message = "URI Too Long", response = ProblemDetails.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = ProblemDetails.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProblemDetails.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Generic Error") })
    @RequestMapping(value = "/nnwdaf-analyticsinfo/v1/context",
        produces = { "application/json", "application/problem+json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ContextData> getNwdafContext(@NotNull @ApiParam(value = "Identifies specific context information related to analytics subscriptions.", required = true) @Valid @RequestParam(value = "context-ids", required = true)String contextIds  
,@ApiParam(value = "Identfies the type(s) of the analytics context information the consumer wishes to receive.") @Valid @RequestParam(value = "req-context", required = false) String reqContext  
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"contextElems\" : [ {\n    \"aggrSubs\" : [ {\n      \"producerSetId\" : \"producerSetId\",\n      \"producerId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n      \"subscriptionId\" : \"subscriptionId\",\n      \"nwdafEvSub\" : {\n        \"supportedFeatures\" : \"supportedFeatures\",\n        \"evtReq\" : {\n          \"notifMethod\" : \"{}\",\n          \"partitionCriteria\" : [ \"{}\", \n}", ContextData.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ContextApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
