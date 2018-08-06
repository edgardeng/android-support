# Android-Support 

> Something about Google Android Support Library. 

## v7 appcompat library

This library includes support for material design user interface implementations.

Note: This library depends on the v4 Support Library.

Here are a few of the key classes included in the v7 appcompat library:

* [ActionBar](./docs/actionbar) - Provides an implementation of the action bar user interface pattern. 

* AppCompatActivity - Adds an application activity class that can be used as a base class for activities that use the Support Library action bar implementation.

* AppCompatDialog - Adds a dialog class that can be used as a base class for AppCompat themed dialogs.

* ShareActionProvider - Adds support for a standardized sharing action (such as email or posting to social applications) that can be included in an action bar.


The Gradle build script dependency identifier for this library is as follows:

```
com.android.support:appcompat-v7:27.1.1
```

## v4 app library

* ActivityCompat - 启动activity和添加动画






## v7 cardview library

This library adds support for the CardView widget, which lets you show information inside cards that have a consistent look on any app. These cards are useful for material design implementations, and are used extensively in layouts for TV apps.

The Gradle build script dependency identifier for this library is as follows:
```
com.android.support:cardview-v7:27.1.1
```
## v7 gridlayout library
After you download the Android Support Libraries, this library adds support for the GridLayout class, which allows you to arrange user interface elements using a grid of rectangular cells. For detailed information about the v7 gridlayout library APIs, see the android.support.v7.widget package in the API reference.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:gridlayout-v7:27.1.1

## v7 mediarouter library

This library provides MediaRouter, MediaRouteProvider, and related media classes that support Google Cast.

In general, the APIs in the v7 mediarouter library provide a means of controlling the routing of media channels and streams from the current device to external screens, speakers, and other destination devices. The library includes APIs for publishing app-specific media route providers, for discovering and selecting destination devices, for checking media status, and more. For detailed information about the v7 mediarouter library APIs, see the android.support.v7.media package in the API reference.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:mediarouter-v7:27.1.1
The v7 mediarouter library APIs introduced in Support Library r18 are subject to change in later revisions of the Support Library. At this time, we recommend using the library only in connection with Google Cast.

## v7 palette library

The v7 palette support library includes the Palette class, which lets you extract prominent colors from an image. For example, a music app could use a Palette object to extract the major colors from an album cover, and use those colors to build a color-coordinated song title card.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:palette-v7:27.1.1

## v7 recyclerview library

The recyclerview library adds the RecyclerView class. This class provides support for the RecyclerView widget, a view for efficiently displaying large data sets by providing a limited window of data items.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:recyclerview-v7:27.1.1

## v7 Preference Support Library

The preference package provides APIs to support adding preference objects, such as CheckBoxPreference and ListPreference, for users to modify UI settings.

The v7 Preference library adds support for interfaces, such as Preference.OnPreferenceChangeListener and Preference.OnPreferenceClickListener, and classes, such as CheckBoxPreference and ListPreference.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:preference-v7:27.1.1


## Vector Drawable Library
Provides support for static vector graphics.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:support-vector-drawable:27.1.1

## Animated Vector Drawable Library

Provides support for animated vector graphics.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:animated-vector-drawable:27.1.1

## Annotations Support Library

The Annotation package provides APIs to support adding annotation metadata to your apps.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:support-annotations:27.1.1

## Design Support Library

The Design package provides APIs to support adding material design components and patterns to your apps.

The Design Support library adds support for various material design components and patterns for app developers to build upon, such as navigation drawers, floating action buttons (FAB), snackbars, and tabs.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:design:27.1.1

## Custom Tabs Support Library

The Custom Tabs package provides APIs to support adding and managing custom tabs in your apps.

The Custom Tabs Support library adds support for various classes, such as Custom Tabs Service and Custom Tabs Callback.

This package requires API level 15 or higher. The Gradle build script dependency identifier for this library is as follows:

com.android.support:customtabs:27.1.1

## Percent Support Library

The Percent package provides APIs to support adding and managing percentage based dimensions in your app.

Note: As of release 26.0.0, the Percent Support library is deprecated. Clients of this module should migrate to the new ConstraintLayout widget, which is provided as a separate artifact in SDK Manager.

The Percent Support library adds support for the PercentLayoutHelper.PercentLayoutParams interface and various classes, such as PercentFrameLayout and PercentRelativeLayout.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:percent:27.1.1

## ExifInterface Support Library

Exif tags store information such as the orientation, date and time, camera information, and the location directly in a JPEG or RAW file. The ExifInterface class unbundles support for reading Exif information from JPEG and raw (DNG, CR2, NEF, NRW, ARW, RW2, ORF, PEF, SRW and RAF) formatted files, and setting the Exif information on JPEG image files.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:exifinterface:27.1.1


## App Recommendation Support Library for TV

The App Recommendation package provides APIs to support adding content recommendations in your app running on TV devices.

The App library adds support for annotations, such as ContentRecommendation.ContentMaturity and various classes, such as ContentRecommendation and RecommendationExtender.

This package requires API level 21 or higher. The Gradle build script dependency identifier for this library is as follows:

com.android.support:recommendation:27.1.1

## Wear UI Library

This library has APIs for building user interfaces for Wear apps. The APIs, available in the android.support.wear.widget package, replace the corresponding APIs in the Wearable Support Library.

For more information, see Using the Wear UI Library.

The Gradle build script dependency identifier for this library is as follows:

com.android.support:wear:27.1.1

