package ex3

/*
 * Without touching our User class, we would like to be able to call:
 * user.isValid()   instead of   isValid(user)
 *
 * Tip: Y3JlYXRlIGFuIGV4dGVudGlvbiBmdW50aW9u
 */

fun processUser(user: User) {
    if (isValid(user)) {
        println("⚙️🛠 processing user ${user.name}")
    }
}

fun isValid(user: User): Boolean {
    return user.username.isNotBlank()
}
