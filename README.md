# TimeLapse
### Library for Android Native [![](https://jitpack.io/v/KPS250/TimeLapse.svg)](https://jitpack.io/#KPS250/TimeLapse)

A library which helps you to display time elasped reltaive to timeInMillis. Many apps from social/ecommerce domain always have some requirement to display time relative to a timestamp and **TimeElasped Library** handles this for you very smoothly.

**Gradle**

```
dependencies {
    implementation 'com.github.KPS250:TimeLapse:v0.1-alpha'
}
```

**How to Use**
###### XML
```
<com.krazzylabs.timelapse.ElaspedTimeTextView
    android:id="@+id/elaspedTime"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

###### KOTLIN
```
elaspedTime.setElaspedTime(1546711246379)  // OUTPUT --> just now
elaspedTime.setElaspedTime(1546710300000)  // OUTPUT --> 13m
elaspedTime.setElaspedTime(1513881000000)  // OUTPUT --> 12h
elaspedTime.setElaspedTime(1545482022176)  // OUTPUT --> 22 Dec
elaspedTime.setElaspedTime(1513881000000)  // OUTPUT --> 22 Dec 2017

```
###### JAVA
```
elaspedTime.setElaspedTime(1546711246379, true)  // OUTPUT --> just now
elaspedTime.setElaspedTime(1546710300000, true)  // OUTPUT --> 13m
elaspedTime.setElaspedTime(1513881000000, true)  // OUTPUT --> 12h
elaspedTime.setElaspedTime(1545482022176, true)  // OUTPUT --> 22 Dec
elaspedTime.setElaspedTime(1513881000000, true)  // OUTPUT --> 22 Dec 2017

```

**Configuration for Time Elasped**

In Social Networking apps like Facebook, Twitter its a standard to show todays time as **1m, 2h** and if time is more than a day then short hand date like **22 Dec** and if its more than a year than **22 Dec 2017** year is displayed. If the requirement is to show only elasped time then you can set the minimaltime parameter to **false** which is by default true in Kotlin. The second Boolean parameter is an optional parameter in Kotlin but in Java its mandatory to specify it.
```
elaspedTime.setElaspedTime(1546711246379, flase)  // OUTPUT --> just now
elaspedTime.setElaspedTime(1546710300000, false)  // OUTPUT --> 13 mins ago
elaspedTime.setElaspedTime(1513881000000, false)  // OUTPUT --> 12 hrs ago
elaspedTime.setElaspedTime(1545482022176, false)  // OUTPUT --> 14 days ago
elaspedTime.setElaspedTime(1513881000000, false)  // OUTPUT --> 1 yr ago

```

**LICENSE**
```
Copyright 2019 KrazzyLabs

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
