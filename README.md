ICStudy
=======

Abstract
--------
Students with severe visual impairments (partially blind), cannot participate in the educational process as well as other students: they cannot see the classroom board, or read books/notes. ICStudy is a solution developed by SciFY which helps students with such conditions attend classes and participate. It is also an open call to all developers to help, so that a useful, fully functional and stable version can be made.

Implementation
--------------
The ICStudy project involves both software and hardware solutions, this means we should be able to utilize hardware (interactive boards, mobile devices) and build software accordingly. The current version (Beta) is an extended implementation of [ICSee][1].

We can support filtering on feed live-streamed from another computer (through UDP). This partially solves the problem described in the above section, if the school uses an interactive (digital) board.

Installation - Dependencies
---------------------------
1. Install Yasm (assembler /disassembler for the Intel x86 architecture) by running sudo apt-get install yasm
2. In order for the Server code to run, download and install ffmpeg protocol (Warning: Do not download it from aptitude, choose this link instead: <a href="https://www.ffmpeg.org">https://www.ffmpeg.org</a>)
3. In order for the Server code to run, jre (Java Runtime Environment) 7 or higher is required.
4. In order for the Server code to run on windows, an additional UScreenCapture library is required. Get it from <a href="http://www.umediaserver.net/umediaserver/download.html">here.</a>
4. This project makes use of a Laravel sub-project (initialized as a Git submodule) in order for the client and the server to communicate. Read more in the README of the submodule.

Compilation
-----------
This is a Maven-based project (<a href="https://maven.apache.org/">https://maven.apache.org</a>), so, in order for all the dependencies to load, you should first run the required Maven commands

<b>The following steps should be followed for both sub-directories</b> (ICStudy_Client and ICStudy_Server)

1. mvn validate (Validate that the project is correct and all necessary information is available)
2. mvn package -Dplatform.dependencies (Take the compiled code and package it in its distributable format, such as a JAR, along with the dependencies)

Deployment
----------
For the Server application:
Run java -jar ICStudy_Server/target/ICStudy_Server-1.0-SNAPSHOT-jar-with-dependencies.jar

For the Client application:
Run java -jar ICStudy_Client/target/ICStudy-1.0-SNAPSHOT-jar-with-dependencies.jar

User/developer guidelines
-------------------------
Download the User Guidelines from <a href="http://icstudy.projects.development1.scify.org/www/files/ICStudyinstallationinstructions.pdf">here.</a>

Download the Developer Guidelines from <a href="http://icstudy.projects.development1.scify.org/www/files/ICStudy_developer_guidelines.pdf">here.</a>

Πίνακας παραδοτέων
------------------

<table>
  <tr>
    <th width="50px">Α/ Α</th>
    <th>Περιγραφή δράσης</th>
    <th>Τεκμηρίωση</th>
  </tr>
  <tr>
    <td>Α</td>
    <td>Υλοποίηση της εφαρμογής ICStudy</td>
    <td>Το ICStudy υπάρχει διαθέσιμο στο GitHub και εγκατεστημένη στο Ειδικό Δημοτικό Σχολείο Τυφλών Καλλιθέας.</td>
  </tr>
  <tr>
    <td>Β</td>
    <td colspan="2">Υλικό για διασφάλιση της δυνατότητας διάχυσης του ICSee</td>
  </tr>
  <tr>
    <td>Β1</td>
    <td>Προσφορά του κώδικα της εφαρμογής ως ανοικτού κώδικα.</td>
    <td>Το έργο βρισκεται στο GitHub σε αυτόν τον σύνδεσμο:
        https://github.com/ellak-monades-aristeias/ICStudy-v1</td>
  </tr>
  <tr>
    <td>Β2</td>
    <td>Υποστηρικτικό υλικό</td>
    <td>Η τεκμηρίωση είναι στο GitHub.</td>
  </tr>
  <tr>
    <td>Γ</td>
    <td colspan="2">Προώθηση του ICStudy</td>
  </tr>
  <tr>
    <td>Γ1</td>
    <td>Δοκιμαστική εγκατάσταση της συνολικής λύσης σε ένα σχολείο και δημιουργία σχετικού προωθητικού υλικού.</td>
    <td>Εγκατάσταση στο Ειδικό Δημοτικό Σχολείο Τυφλών Καλλιθέας και προώθηση στα κοινωνικά δίκτυα της SciFY</td>
  </tr>
  <tr>
    <td>Γ2</td>
    <td>Προώθηση του ICStudy, της συνεργασίας με την ΕΛ/ΛΑΚ, και των σημαντικών εξελίξεων του project μέσω του δικτύου συνεργατών, των δράσεων και μέσων επικοινωνίας της SciFY</td>
    <td>Στο Newsletter της SciFY (http://eepurl.com/bAuv11)
        Στα Social media της SciFY
        <ul>
        <li>Google+ (https://goo.gl/cLQQVR)</li>
        <li>Facebook
        (https://www.facebook.com/SciFY.org)</li>
        <li>Twitter
        (https://twitter.com/scify_org)</li>
        </ul>
        Ειδική παρουσίαση στην ημέρα Λευκού Μπαστουνιού, όπως φαίνεται και στο προφίλ μας στο Facebook</td>
  </tr>
</table>

Main Technologies
-----------------
<a href="http://opencv.org/"><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/3/32/OpenCV_Logo_with_text_svg_version.svg/750px-OpenCV_Logo_with_text_svg_version.svg.png" alt="OpenCV" width="100px"></a>

<a href="http://openjdk.java.net/"><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/OpenJDK_logo.png/200px-OpenJDK_logo.png" alt="Java" width="100px"></a>

[1]: http://www.scify.gr/site/en/projects/in-progress/icsee

