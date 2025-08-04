package com.results.students.bean;

import java.util.List;

public record Result(int id, boolean passingStatus, List<Subjects> subjectsList) {
}
