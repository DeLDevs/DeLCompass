# DeLCompass
Compasses that can track players.

## Features
- Creation of custom tracking compasses
    - Usage: `/maketracker [optional: player]`
- Editing of targeted player for any compass
    - Usage: `/settarget [player]`
    - *Note: Must be holding the compass to edit it.*
- Right-Click with the compass to refresh the location.
    - ***Note: WORKS IN THE NETHER***
- Permissions for each command.
    - `delcompass.create`
    - `delcompass.target`

## Installation
Install it like any old plugin.
Just take the `DeLCompass_vX.X.X.jar` and stick that sucker into your plugins directory and you should be good to go!

#### Build from source
1. Clone the repo.
    ```
    git clone https://github.com/DeLDevs/DeLCompass.git DeLCompass.git`
    ```
2. Ensure that you have Gradle and java installed.
    - https://gradle.org/install/
    - https://www.java.com/en/download/
3. Inside the root directory of the repo (`DeLCompass`), run the following command to build:
    ```
    gradle build
    ```
4. The `.jar` file will be located inside the `lib/build/libs/` directory.
    - *Note: Make sure to rename it to `DeLCompass_vX.X.X.java`, replacing X.X.X with the version number.*
<br>
