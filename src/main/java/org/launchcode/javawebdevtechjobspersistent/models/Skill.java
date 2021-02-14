package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    @NotNull
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Location is required")
    @Size(min = 1, max = 100, message ="Location must be between 1 & 100 characters")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill(String n) {
        this.description = n;
    }

    public Skill() {}


}