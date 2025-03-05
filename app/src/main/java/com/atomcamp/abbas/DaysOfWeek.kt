package com.atomcamp.abbas

enum class DaysOfWeek(
    val value: String,
) {

    MONDAY(
        value = "Monday",
    ),
    TUESDAY(
        value = "Tuesday",
    ),
    WEDNESDAY(
        value = "Wednesday",
    ),
    THURSDAY(
        value = "Thursday",
    ),
    FRIDAY(
        value = "Friday",
    ),
    SATURDAY(
        value = "Saturday",
    ),
    SUNDAY(
        value = "Sunday",
    ),
    ;

    fun dayInWeek(): Int {
        return this.ordinal + 1
    }
}