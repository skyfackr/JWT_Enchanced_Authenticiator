rootProject.name = "JWTEA"
include("src:main:java:wang:skycloud:JWTEA:Client")
findProject(":src:main:java:wang:skycloud:JWTEA:Client")?.name = "Client"
include("Client")
