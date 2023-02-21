plugins {
    war
}

dependencies {
    implementation(project(":regularLibA"))
    implementation(project(":regularLibB"))
    implementation(project(":tomcatLib"))
}