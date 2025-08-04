package com.students.profile.beans;

import java.util.List;

public record UserDetails(User user, List<Result> result) {
}
