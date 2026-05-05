package com.tw.step.rover.roversystem;

import com.tw.step.rover.commands.RoverCommands;
import com.tw.step.rover.rover.Rover;

import java.util.ArrayList;
import java.util.HashMap;

public class RoverSystem {
    private HashMap<String, Rover>  rovers = new HashMap<>();
    private HashMap<String, RoverCommands> roverCommandsList = new HashMap<>();

    public void addRover(Rover rover, String id) {
        this.rovers.put(id, rover);
    }

    public void addCommands(RoverCommands roverCommands, String id) {
        this.roverCommandsList.put(id, roverCommands);
    }

    public void execute() {
        roverCommandsList.forEach((id, roverCommands) -> {
            roverCommands.execute(rovers.get(id));
        });
    }

    @Override
    public String toString() {
        return rovers.toString();
    }
}
