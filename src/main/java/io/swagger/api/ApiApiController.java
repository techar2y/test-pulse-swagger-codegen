package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse204;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-20T22:16:26.513Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<InlineResponse200>> apiEmployeeGetAllOffsetGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "Specifies the number of the to be displayed", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("offset") Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InlineResponse200>>(objectMapper.readValue("[ {\n  \"department_id\" : 1,\n  \"department_name\" : \"department_name\",\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"position\" : \"position\",\n  \"salary\" : 5,\n  \"position_id\" : 6\n}, {\n  \"department_id\" : 1,\n  \"department_name\" : \"department_name\",\n  \"name\" : \"name\",\n  \"id\" : 0,\n  \"position\" : \"position\",\n  \"salary\" : 5,\n  \"position_id\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InlineResponse200>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InlineResponse200>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<InlineResponse2002>> apiEmployeeGetAvgSalaryByDepartmentOffsetGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "Specifies the number of the to be displayed", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("offset") Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InlineResponse2002>>(objectMapper.readValue("[ {\n  \"department_name\" : \"department_name\",\n  \"average_salary\" : 0\n}, {\n  \"department_name\" : \"department_name\",\n  \"average_salary\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InlineResponse2002>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InlineResponse2002>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<InlineResponse2003>> apiEmployeeGetAvgSalaryByPositionOffsetGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "Specifies the number of the to be displayed", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("offset") Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InlineResponse2003>>(objectMapper.readValue("[ {\n  \"department_name\" : \"department_name\",\n  \"position\" : 0\n}, {\n  \"department_name\" : \"department_name\",\n  \"position\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InlineResponse2003>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InlineResponse2003>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<InlineResponse2001>> apiEmployeeGetAvgSalaryGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InlineResponse2001>>(objectMapper.readValue("[ {\n  \"average_salary\" : 0\n}, {\n  \"average_salary\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InlineResponse2001>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InlineResponse2001>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
