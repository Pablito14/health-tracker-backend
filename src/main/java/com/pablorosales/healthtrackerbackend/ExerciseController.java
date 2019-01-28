package com.pablorosales.healthtrackerbackend;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class ExerciseController {

@Autowired
public ExerciseRepository exerciseRepository;

  @PostMapping(value = "/exercises")
  public void postExercise(@RequestParam String title, @RequestParam String quantity, @RequestParam String description) {
    Exercise newExercise = new Exercise(title, quantity, description);
    exerciseRepository.save(newExercise);
  }

  @GetMapping(value = "/exercises")
  public String getExercises() {
    Gson gson = new Gson();
    return gson.toJson(exerciseRepository.findAll());
  }

}