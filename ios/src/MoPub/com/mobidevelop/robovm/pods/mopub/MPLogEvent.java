/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobidevelop.robovm.pods.mopub;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPLogEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPLogEventPtr extends Ptr<MPLogEvent, MPLogEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPLogEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPLogEvent() {}
    protected MPLogEvent(Handle h, long handle) { super(h, handle); }
    protected MPLogEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEventCategory:eventName:")
    public MPLogEvent(String eventCategory, String eventName) { super((SkipInit) null); initObject(initWithEventCategory$eventName$(eventCategory, eventName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "eventName")
    public native String getEventName();
    @Property(selector = "setEventName:")
    public native void setEventName(String v);
    @Property(selector = "eventCategory")
    public native String getEventCategory();
    @Property(selector = "setEventCategory:")
    public native void setEventCategory(String v);
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "scribeCategory")
    public native MPLogEventScribeCategory getScribeCategory();
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "setAdUnitId:")
    public native void setAdUnitId(String v);
    @Property(selector = "adCreativeId")
    public native String getAdCreativeId();
    @Property(selector = "setAdCreativeId:")
    public native void setAdCreativeId(String v);
    @Property(selector = "dspCreativeId")
    public native String getDspCreativeId();
    @Property(selector = "setDspCreativeId:")
    public native void setDspCreativeId(String v);
    @Property(selector = "adType")
    public native String getAdType();
    @Property(selector = "setAdType:")
    public native void setAdType(String v);
    @Property(selector = "adNetworkType")
    public native String getAdNetworkType();
    @Property(selector = "setAdNetworkType:")
    public native void setAdNetworkType(String v);
    @Property(selector = "adSize")
    public native @ByVal CGSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(@ByVal CGSize v);
    @Property(selector = "appName")
    public native String getAppName();
    @Property(selector = "setAppName:")
    public native void setAppName(String v);
    @Property(selector = "appStoreId")
    public native String getAppStoreId();
    @Property(selector = "setAppStoreId:")
    public native void setAppStoreId(String v);
    @Property(selector = "appBundleId")
    public native String getAppBundleId();
    @Property(selector = "setAppBundleId:")
    public native void setAppBundleId(String v);
    @Property(selector = "appVersion")
    public native String getAppVersion();
    @Property(selector = "setAppVersion:")
    public native void setAppVersion(String v);
    @Property(selector = "performanceDurationMs")
    public native @MachineSizedUInt long getPerformanceDurationMs();
    @Property(selector = "requestId")
    public native String getRequestId();
    @Property(selector = "setRequestId:")
    public native void setRequestId(String v);
    @Property(selector = "requestStatusCode")
    public native @MachineSizedUInt long getRequestStatusCode();
    @Property(selector = "setRequestStatusCode:")
    public native void setRequestStatusCode(@MachineSizedUInt long v);
    @Property(selector = "requestURI")
    public native String getRequestURI();
    @Property(selector = "setRequestURI:")
    public native void setRequestURI(String v);
    @Property(selector = "requestRetries")
    public native @MachineSizedUInt long getRequestRetries();
    @Property(selector = "setRequestRetries:")
    public native void setRequestRetries(@MachineSizedUInt long v);
    @Property(selector = "sdkVersion")
    public native String getSdkVersion();
    @Property(selector = "deviceModel")
    public native String getDeviceModel();
    @Property(selector = "deviceOSVersion")
    public native String getDeviceOSVersion();
    @Property(selector = "deviceSize")
    public native @ByVal CGSize getDeviceSize();
    @Property(selector = "geoLat")
    public native double getGeoLat();
    @Property(selector = "geoLon")
    public native double getGeoLon();
    @Property(selector = "geoAccuracy")
    public native double getGeoAccuracy();
    @Property(selector = "networkType")
    public native MPLogEventNetworkType getNetworkType();
    @Property(selector = "networkOperatorCode")
    public native String getNetworkOperatorCode();
    @Property(selector = "networkOperatorName")
    public native String getNetworkOperatorName();
    @Property(selector = "networkISOCountryCode")
    public native String getNetworkISOCountryCode();
    @Property(selector = "networkSIMCode")
    public native String getNetworkSIMCode();
    @Property(selector = "networkSIMOperatorName")
    public native String getNetworkSIMOperatorName();
    @Property(selector = "networkSimISOCountryCode")
    public native String getNetworkSimISOCountryCode();
    @Property(selector = "clientAdvertisingId")
    public native String getClientAdvertisingId();
    @Property(selector = "clientDoNotTrack")
    public native boolean isClientDoNotTrack();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEventCategory:eventName:")
    protected native @Pointer long initWithEventCategory$eventName$(String eventCategory, String eventName);
    @Method(selector = "serialize")
    public native String serialize();
    @Method(selector = "asDictionary")
    public native NSDictionary<?, ?> asDictionary();
    @Method(selector = "timestampAsEpoch")
    public native @MachineSizedUInt long timestampAsEpoch();
    @Method(selector = "recordEndTime")
    public native void recordEndTime();
    @Method(selector = "setLogEventProperties:")
    public native void setLogEventProperties(MPAdConfigurationLogEventProperties logEventProperties);
    /*</methods>*/
}
