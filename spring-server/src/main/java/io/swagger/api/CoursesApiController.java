package io.swagger.api;

import io.swagger.model.Course;
import io.swagger.model.Tag;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-27T11:04:39.957334107Z[GMT]")
@RestController
public class CoursesApiController implements CoursesApi {

    private static final Logger log = LoggerFactory.getLogger(CoursesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CoursesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Course> addCourse(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new course in the school", required=true, schema=@Schema()) @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCourse(@Parameter(in = ParameterIn.PATH, description = "course id to delete", required=true, schema=@Schema()) @PathVariable("courseId") Long courseId,@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Course>> findCoursesByStatus(@Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter" ,schema=@Schema(allowableValues={ "available", "pending" }
, defaultValue="available")) @Valid @RequestParam(value = "status", required = false, defaultValue="available") String status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Course>>(objectMapper.readValue("[ {\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n}, {\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Course>> findCoursesByTags(@Parameter(in = ParameterIn.QUERY, description = "Tags to filter by" ,schema=@Schema()) @Valid @RequestParam(value = "tags", required = false) List<String> tags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Course>>(objectMapper.readValue("[ {\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n}, {\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> getCourseById(@Parameter(in = ParameterIn.PATH, description = "ID of course to return", required=true, schema=@Schema()) @PathVariable("courseId") Long courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCourseWithForm(@Parameter(in = ParameterIn.PATH, description = "ID of course that needs to be updated", required=true, schema=@Schema()) @PathVariable("courseId") Long courseId,@Parameter(in = ParameterIn.QUERY, description = "Name of course that needs to be updated" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name,@Parameter(in = ParameterIn.QUERY, description = "Status of course that needs to be updated" ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> updatecourse(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent course in the school", required=true, schema=@Schema()) @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\n  \"name\" : \"Basic English\",\n  \"id\" : 10,\n  \"tags\" : [ {\n    \"name\" : \"name\",\n    \"id\" : 0\n  }, {\n    \"name\" : \"name\",\n    \"id\" : 0\n  } ],\n  \"status\" : \"available\"\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

}
