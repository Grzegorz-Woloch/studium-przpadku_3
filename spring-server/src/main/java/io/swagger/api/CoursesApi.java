/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.44).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Course;
import io.swagger.model.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-27T11:04:39.957334107Z[GMT]")
@Validated
public interface CoursesApi {

    @Operation(summary = "Add a new course to the school", description = "Add a new course to the school", tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/courses",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Course> addCourse(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new course in the school", required=true, schema=@Schema()) @Valid @RequestBody Course body);


    @Operation(summary = "Deletes a course", description = "delete a course", security = {
        @SecurityRequirement(name = "coursestore_auth", scopes = {
            "write:courses",
"read:courses"        })    }, tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid course value") })
    @RequestMapping(value = "/courses/{courseId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCourse(@Parameter(in = ParameterIn.PATH, description = "course id to delete", required=true, schema=@Schema()) @PathVariable("courseId") Long courseId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Finds courses by status", description = "Multiple status values can be provided with comma separated strings", security = {
        @SecurityRequirement(name = "coursestore_auth", scopes = {
            "write:courses",
"read:courses"        })    }, tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Course.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid status value") })
    @RequestMapping(value = "/courses/findByStatus",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> findCoursesByStatus(@Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter" ,schema=@Schema(allowableValues={ "available", "pending" }
, defaultValue="available")) @Valid @RequestParam(value = "status", required = false, defaultValue="available") String status);


    @Operation(summary = "Finds Courses by tags", description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", security = {
        @SecurityRequirement(name = "coursestore_auth", scopes = {
            "write:courses",
"read:courses"        })    }, tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Course.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid tag value") })
    @RequestMapping(value = "/courses/findByTags",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> findCoursesByTags(@Parameter(in = ParameterIn.QUERY, description = "Tags to filter by" ,schema=@Schema()) @Valid @RequestParam(value = "tags", required = false) List<String> tags);


    @Operation(summary = "Find course by ID", description = "Returns a single course", security = {
        @SecurityRequirement(name = "api_key"),
@SecurityRequirement(name = "coursestore_auth", scopes = {
            "write:courses",
"read:courses"        })    }, tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "course not found") })
    @RequestMapping(value = "/courses/{courseId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Course> getCourseById(@Parameter(in = ParameterIn.PATH, description = "ID of course to return", required=true, schema=@Schema()) @PathVariable("courseId") Long courseId);


    @Operation(summary = "Updates a course in the school with form data", description = "", security = {
        @SecurityRequirement(name = "coursestore_auth", scopes = {
            "write:courses",
"read:courses"        })    }, tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/courses/{courseId}",
        method = RequestMethod.POST)
    ResponseEntity<Void> updateCourseWithForm(@Parameter(in = ParameterIn.PATH, description = "ID of course that needs to be updated", required=true, schema=@Schema()) @PathVariable("courseId") Long courseId, @Parameter(in = ParameterIn.QUERY, description = "Name of course that needs to be updated" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name, @Parameter(in = ParameterIn.QUERY, description = "Status of course that needs to be updated" ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status);


    @Operation(summary = "Update an existing course", description = "Update an existing course by Id", tags={ "course" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "course not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/courses",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Course> updatecourse(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent course in the school", required=true, schema=@Schema()) @Valid @RequestBody Course body);

}

