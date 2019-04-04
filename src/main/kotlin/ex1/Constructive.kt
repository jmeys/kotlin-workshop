package ex1

/*
 * Java-dev: We would like to add some sort of second constructor to set the age of our Person
 * Kotlin-dev: I got this
 *
 * Make all tests in PersonTest succeed.
 *
 * Tip: dXNlIHRoZSBwb3dlciBvZiBhcmd1bWVudCBkZWZhdWx0cyB0byBhdm9pZCBjcmVhdGluZyBhIHNlY29uZCBjb25zdHJ1Y3Rvcg==
 */
class Person(val name: String) {

    fun greeting(otherPerson: Person) =
        "$name greets ${otherPerson.name}!"
}
