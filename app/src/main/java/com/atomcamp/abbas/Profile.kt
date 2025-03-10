package com.atomcamp.abbas

import androidx.annotation.DrawableRes

sealed class Data(
    open val userName: String,
    open val name: String,
)

data class Profile(
    override val userName: String,
    override val name: String,
): Data(
    userName = userName,
    name = name,
) {
    companion object {
        val Example1 = Profile(
            userName = "abbas",
            name = "Abbas",
        )

        val Example2 = Profile(
            userName = "rehan",
            name = "Rehan",
        )

        val Example3 = Profile(
            userName = "ahad",
            name = "Ahad",
        )

        val Example4 = Profile(
            userName = "abdullah",
            name = "Abdullah",
        )

        val Example5 = Profile(
            userName = "shahad",
            name = "Shahad",
        )

        val Example6 = Profile(
            userName = "muhammad",
            name = "Muhammad",
        )

        val Example7 = Profile(
            userName = "raghad",
            name = "Raghad",
        )

        val Example8 = Profile(
            userName = "renad",
            name = "Renad",
        )
    }
}

data class ProfileExtended(
    override val userName: String,
    override val name: String,
    @DrawableRes val profilePic: Int,
): Data(
    userName = userName,
    name = name,
) {
    companion object {
        val Example1 = ProfileExtended(
            userName = "abbas-extended",
            name = "Abbas",
            profilePic = R.drawable.abbas_profile,
        )
    }
}