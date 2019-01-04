A library which helps you to display time elasped reltive to timeInMillis. Many apps like social/ecommerce always have some requirement to display time relative to a timestamp and **TimeElasped Library** handles this for you very smoothly.

**Gradle**

```
dependencies {
    implementation 'com.github.krazzylabs.timelasped:library:1.0.0'
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
elaspedTime.setElaspedTime(1545482022176)
```

###### LICENSE
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
