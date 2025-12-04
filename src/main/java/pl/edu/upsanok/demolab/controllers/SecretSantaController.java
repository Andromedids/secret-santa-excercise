package pl.edu.upsanok.demolab.controllers;

import static org.springframework.http.HttpStatus.OK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.upsanok.demolab.controllers.dtos.SantaResult;
import pl.edu.upsanok.demolab.controllers.dtos.UserDto;

@RestController
public class SecretSantaController {
  private List<String> participants = new ArrayList<>();
  private Map<String, String> secretSantaResults = new HashMap<>();

  @GetMapping(path = "/good-people")
  public ResponseEntity<List<UserDto>> getParticipants(
  ) {
    List<UserDto> goodPeople = new ArrayList<>();
    // fill in this method so that it returns all participants in proper format.
    // No need to change the below `return new ResponseEntity...`

    return new ResponseEntity<>(
        goodPeople,
        OK
    );
  }

  @PostMapping(path = "/good-people")
  public ResponseEntity<UserDto> addParticipant(
      @RequestBody UserDto userDto
  ) {
    // TODO STEP 5
    // fill in this method so that it adds new participants.
    // No need to change the below `return new ResponseEntity...`

    return new ResponseEntity<>(
        userDto,
        OK
    );
  }

  @PostMapping(path = "/santa-assignments/draw")
  public ResponseEntity<Void> drawSecretSanta(
  ) {
    // TODO STEP 8
    // fill in this method so that it calculates who drew whom

    return new ResponseEntity<>(
        OK
    );
  }

  @GetMapping(path = "/santa-assignments")
  public ResponseEntity<List<SantaResult>> getSantas(
  ) {
    List<SantaResult> response = new ArrayList<>();
    // TODO STEP 14
    // fill in this method. Add proper data to `response` variable.
    // No need to change the below `return new Response...`
    return new ResponseEntity<>(
        response,
        OK
    );
  }

  @GetMapping(path = "/santa-assignments/{santaName}")
  public ResponseEntity<SantaResult> getOneSanta(
      @PathVariable("santaName") String santaName
  ) {
    // TODO STEP 17
    // fill in this method and return proper variable inside ResponseEntity instead of ??? in the line below
    // return new ResponseEntity<>(??, OK);

    // then remove the last return
    return new ResponseEntity<>(OK); // <- once you implement logic, remove this line
  }

  // TODO STEP 12 - implement DELETE method

}
