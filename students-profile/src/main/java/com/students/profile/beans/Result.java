package com.students.profile.beans;

import java.util.List;

public record Result(int id, boolean passingStatus, List<Subjects> subjectsList) {
}
