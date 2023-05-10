package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String project = entry.getKey();
            Set<String> developers = entry.getValue();

            if (developers.contains(developer)) {
                developerProjects.add(project);
            }
        }

        developerProjects.sort((project1, project2) -> {
            int lengthComparison = Integer.compare(project2.length(), project1.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            } else {
                return project2.compareTo(project1);
            }
        });

        return developerProjects;
    }
}
