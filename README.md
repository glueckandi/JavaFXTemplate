Template for Java 11 with JavaFX
===========

* [Source from OpenJFX](https://openjfx.io/)
* [Maven plugin (for further details)](https://github.com/openjfx/javafx-maven-plugin )

Tested with Amazon Corretto 11 LTS on Windows 10

https://docs.aws.amazon.com/de_de/corretto/latest/corretto-11-ug/downloads-list.html

Build with IntelliJ (Sidebar on the right) -> Maven -> javafx:jlink

After image was built, create a new batch file inside target\App
that contains

		START /MIN testfx.bat

With that script, the command line window is startet in the background.