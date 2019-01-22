package com.pablorosales.healthtrackerbackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long id;
  public String nameOfExercise;
  public String reps;
  public String description;
  public String timeStamp;

  public Exercise (){};

  public Exercise(String nameOfExercise, String reps, String description, String timeStamp){
    this.nameOfExercise = nameOfExercise;
    this.reps = reps;
    this.description = description;
    this.timeStamp = timeStamp;
  }

  @Override
  public String toString(){
    return "Exercise: " + this.nameOfExercise + "\nReps: " + this.reps + "\nDescription: " + this.description + "\nCompleted on: " + this.timeStamp;
  }

}
