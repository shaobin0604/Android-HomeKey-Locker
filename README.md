Android-HomeKey-Locker
======================
Utility to disable **HOME KEY** in Android Activity.

As there are a lot questions about "how to disable home button in android?" on `Stack Overflow`, such as

* [how to disable home button in android?](http://stackoverflow.com/questions/17183905/how-to-disable-home-button-in-android)
* [Android - Is It possible to disable the click of home button](http://stackoverflow.com/questions/2162182/android-is-it-possible-to-disable-the-click-of-home-button)
* [How to disable Home and other system buttons in Android?](http://stackoverflow.com/questions/17549478/how-to-disable-home-and-other-system-buttons-in-android)

This library provide a easy way to do this job.

![Android-HomeKey-Locker Sample Screenshots!][1] ![Android-HomeKey-Locker Sample Screenshots!][2]


Usage
=====
in Activity

```java
HomeKeyLocker homeKeyLoader = new HomeKeyLocker();
homeKeyLocker.lock(this);
// home key is locked since then
homeKeyLocker.unlock();
// home key is unlocked since then
```

Side Effect
===========
Lock **HOME KEY**  will also lock **BACK KEY** and **MENU KEY**.


Work
====
* Android 4.4.2
 * CM11 (Google Nexus S, Moto Defy)
* Android 4.0.3
 * Moto XT910
 * Huawei C8812
* Android 4.0.4
 * ZTE V889M
* Android 2.3.5
 * HTC Desire S (Sense 3.0)

Not Work
========
* [MIUI](http://www.miui.com/)
* [Flyme OS](http://flyme.meizu.com/flysys/en/system.jsp)

License
=======

    Copyright 2013 shaobin

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

 [1]: art/home-key-unlocked.png
 [2]: art/home-key-locked.png
