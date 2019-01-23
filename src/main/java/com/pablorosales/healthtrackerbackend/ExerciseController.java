package com.pablorosales.healthtrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ExerciseController {

@Autowired
private ExerciseRepository exerciseRepository;

@PostMapping(value="/exercises")
public void saveExercise(){

}


}
