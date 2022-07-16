![Artboard 1-100](https://user-images.githubusercontent.com/51255499/179341798-98be3f89-d0cf-4116-b5d8-65d00f2cfb47.jpg)

# Articles of Faith Music App for Android - Java
Android App developed in Java to display sheet music and play associated music, written and composed for members of The Church of Jesus Christ of Latter-day Saints.

## What is this?
A friend's father wrote and composed music to help children who are members of The Church of Jesus Christ of Latter-day Saints learn the 13 Articles of Faith (foundational beliefs). In order to help share his work with people who may find it useful, she and her husband asked me to develop an app.

## Who is it for?
Parents and Primary teachers may find the content helpful (though the process of writing the code, working through issues, and eventually prepping it for publish was fun and extremely beneficial for my progress as a developer).

## Technically, how does it work?
Built in Android Studio using Java.
Each button on the Main Activity takes you to a PDF view of sheet music for each of the 13 songs included. (<a href="https://github.com/barteksc/AndroidPdfViewer">PDFViewer</a> thanks to barteksc)

At the PDF view, a Floating Action Button transforms into a media player when clicked. I coded each individual part of the player; it has all commonly expected features (Time Remaining, Time Elapsed, Seek Bar, Skip Forward/Back 15sec, Play/Pause, Reset to Beginning), in addition to a toggle switch that swaps between .mp3 tracks with and without lyrics.

Landscape and portrait modes work, and it will not interrupt song position when switching between the two.

## How can you help?
### Fellow developers:
I originally built this app in 2019, so the published app in the Google Play Store has expired.
It needs...
<ul>
  <li>to be updated for the current Android APK,</li>
  <li>cleaned up (remove unnecessary docs & lines of code),</li>
  <li>and be re-published on Google so the public can use it.</li>
  <li>while always looking for ways to make code more efficient and take up less space.</li>
</ul>

### Designers:
The current artwork was provided to me by the owner, but it needs a facelift. It needs...
<ul>
  <li>Graphics for home page, background, buttons, etc.</li>
  <li>PDF sheet music is scanned in; needs to be re-made digitally so it's cleaner.</li>
</ul>

### Everyone Else:
Once it's published again, it will need some sharing to help people find out about it.
Also, the .mp3 recordings are old; it would be amazing to find people talented with different instruments and singers to re-record the music.

I would be super grateful to hear from anyone interested in contributing. Feel free to submit an issue or pull request, or connect with me on <a href="https://www.linkedin.com/in/dipaolo-michael/">LinkedIn: Michael DiPaolo</a>. 

## Screenshots
<p float="left">
<img src="https://user-images.githubusercontent.com/51255499/179341883-dddd935b-382d-43be-bd36-fb31dca3a312.png" width="500" />
<img src="https://user-images.githubusercontent.com/51255499/179342044-5ea073cf-c981-4d8a-970d-e23fad492586.png" width="500" />
</p>

