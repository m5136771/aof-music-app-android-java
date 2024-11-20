![Artboard 1-100](https://user-images.githubusercontent.com/51255499/179341798-98be3f89-d0cf-4116-b5d8-65d00f2cfb47.jpg)

# Articles of Faith Music App for Android - Java
An Android app built in Java to display sheet music and play music tracks for each of the 13 Articles of Faith—composed for members of The Church of Jesus Christ of Latter-day Saints.

## What I Learned
This project was my first fully functioning program, which helped me gain a lot of hands-on experience:
1. **Android Studio Fundamentals**: Setting up Android Studio, structuring the app, and using its tools.
2. **Source Control with Git**: Learning Git commands and version control was invaluable for tracking and managing changes.
3. **App Lifecycle Management**: Handling activities in different lifecycle stages made me appreciate the intricacies of Android development.
4. **Using Packages and Libraries**: Leveraging external libraries like PDFViewer showed me how to integrate community-created tools into my project.
5. **App Publishing**: Going through the process of preparing and publishing an app, even in a closed beta, was a huge milestone.

## What is this App?
This app is designed to help children and members of the Church of Jesus Christ of Latter-day Saints learn the 13 Articles of Faith, which are foundational beliefs of the Church. Inspired by the music composed by a friend’s father, this app provides both sheet music and audio tracks to enhance learning. The development of this app allowed me to dive into Android development, source control, and app publishing, making it a significant project in my growth as a developer.

## Features
- **Music and PDF Integration**: Each button on the Main Activity opens a PDF view of sheet music for each Article of Faith, with audio playback. Thanks to [PDFViewer by barteksc](https://github.com/barteksc/AndroidPdfViewer).
- **Complete Media Player**: The media player offers expected features like Play/Pause, Seek Bar, Time Remaining, Time Elapsed, Skip Forward/Back 15 seconds, Reset, and a toggle switch to swap between tracks with and without lyrics.
- **Orientation Support**: Both landscape and portrait modes are supported, with uninterrupted playback when switching orientations.

## Technical Details
- **Developed in Java using Android Studio**: This app leverages Android SDK components like MediaPlayer, ConstraintLayout, and FloatingActionButton for smooth and interactive multimedia experiences.
- **Modular Design**: Functions for converting time, calculating progress, and handling other utility tasks are organized into a separate `Utilities` class, ensuring a modular and reusable structure.

Key Code Files:
- **`MainActivity.java`**: Manages the home screen, offering navigation to each article’s PDF and music playback.
- **`ArticleActivity.java`**: Each article has its own activity to handle specific PDF views, media controls, and additional interactive components.
- **`Utilities.java`**: A helper class for converting milliseconds into `HH:MM:SS` format, calculating playback progress, and keeping the seek bar in sync with the playback.

## How You Can Help
### For Developers
I originally built this app in 2019, and it now needs updates:
- Update to meet current Android API standards.
- Code cleanup to remove unnecessary files and improve efficiency.
- Re-publish the app on Google Play.

### For Designers
The current artwork could use a refresh:
- Design updates for home page graphics, backgrounds, and buttons.
- Re-create the scanned sheet music digitally for a cleaner look.

### For Everyone Else
Once republished, sharing the app with those who may benefit from it would be greatly appreciated! Additionally, updated .mp3 recordings with new instruments and vocals would make the app even more engaging.

Feel free to reach out via [LinkedIn: Michael DiPaolo](https://www.linkedin.com/in/dipaolo-michael/) or contribute directly by opening an issue or submitting a pull request.

## Screenshots
<p float="left">
  <img src="https://user-images.githubusercontent.com/51255499/179341883-dddd935b-382d-43be-bd36-fb31dca3a312.png" width="400" />
  <img src="https://user-images.githubusercontent.com/51255499/179342044-5ea073cf-c981-4d8a-970d-e23fad492586.png" width="400" />
</p>
