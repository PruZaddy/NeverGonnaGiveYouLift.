# Never Gonna Give You Lift
Android Rickroll app. GitHub Actions builds a debug APK on each push to main.

## Video payload
Place the video at `app/src/main/res/raw/rickroll.mp4` (create the raw folder if needed). The app plays the bundled video on launch and loops it. Until the video is committed, the app shows a placeholder message.

## Build
Open **Actions > Build Android APK**, run the workflow, then download the debug APK from the run's **Artifacts** section. This is a sideloadable debug build, not a Play Store release.
