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
package com.mobidevelop.robovm.pods.amplitude;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Amplitude/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AmplitudePtr extends Ptr<Amplitude, AmplitudePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Amplitude.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Amplitude() {}
    protected Amplitude(Handle h, long handle) { super(h, handle); }
    protected Amplitude(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "apiKey")
    public native String getApiKey();
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    @Property(selector = "deviceId")
    public native String getDeviceId();
    @Property(selector = "setDeviceId:")
    public native void setDeviceId(String v);
    @Property(selector = "instanceName")
    public native String getInstanceName();
    @Property(selector = "propertyListPath")
    public native String getPropertyListPath();
    @Property(selector = "optOut")
    public native boolean isOptOut();
    @Property(selector = "setOptOut:")
    public native void setOptOut(boolean v);
    @Property(selector = "eventUploadThreshold")
    public native int getEventUploadThreshold();
    @Property(selector = "setEventUploadThreshold:")
    public native void setEventUploadThreshold(int v);
    @Property(selector = "eventUploadMaxBatchSize")
    public native int getEventUploadMaxBatchSize();
    @Property(selector = "setEventUploadMaxBatchSize:")
    public native void setEventUploadMaxBatchSize(int v);
    @Property(selector = "eventMaxCount")
    public native int getEventMaxCount();
    @Property(selector = "setEventMaxCount:")
    public native void setEventMaxCount(int v);
    @Property(selector = "eventUploadPeriodSeconds")
    public native int getEventUploadPeriodSeconds();
    @Property(selector = "setEventUploadPeriodSeconds:")
    public native void setEventUploadPeriodSeconds(int v);
    @Property(selector = "minTimeBetweenSessionsMillis")
    public native @MachineSizedSInt long getMinTimeBetweenSessionsMillis();
    @Property(selector = "setMinTimeBetweenSessionsMillis:")
    public native void setMinTimeBetweenSessionsMillis(@MachineSizedSInt long v);
    @Property(selector = "trackingSessionEvents")
    public native boolean isTrackingSessionEvents();
    @Property(selector = "setTrackingSessionEvents:")
    public native void setTrackingSessionEvents(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeApiKey:")
    public native void initializeApiKey(String apiKey);
    @Method(selector = "initializeApiKey:userId:")
    public native void initializeApiKey$userId$(String apiKey, String userId);
    @Method(selector = "logEvent:")
    public native void logEvent(String eventType);
    @Method(selector = "logEvent:withEventProperties:")
    public native void logEvent$withEventProperties$(String eventType, NSDictionary<?, ?> eventProperties);
    @Method(selector = "logEvent:withEventProperties:outOfSession:")
    public native void logEvent$withEventProperties$outOfSession$(String eventType, NSDictionary<?, ?> eventProperties, boolean outOfSession);
    @Method(selector = "logEvent:withEventProperties:withGroups:")
    public native void logEvent$withEventProperties$withGroups$(String eventType, NSDictionary<?, ?> eventProperties, NSDictionary<?, ?> groups);
    @Method(selector = "logEvent:withEventProperties:withGroups:outOfSession:")
    public native void logEvent$withEventProperties$withGroups$outOfSession$(String eventType, NSDictionary<?, ?> eventProperties, NSDictionary<?, ?> groups, boolean outOfSession);
    @Method(selector = "logEvent:withEventProperties:withGroups:withLongLongTimestamp:outOfSession:")
    public native void logEvent$withEventProperties$withGroups$withLongLongTimestamp$outOfSession$(String eventType, NSDictionary<?, ?> eventProperties, NSDictionary<?, ?> groups, long longLongTimestamp, boolean outOfSession);
    @Method(selector = "logEvent:withEventProperties:withGroups:withTimestamp:outOfSession:")
    public native void logEvent$withEventProperties$withGroups$withTimestamp$outOfSession$(String eventType, NSDictionary<?, ?> eventProperties, NSDictionary<?, ?> groups, NSNumber timestamp, boolean outOfSession);
    @Method(selector = "logRevenue:")
    public native void logRevenue(NSNumber amount);
    @Method(selector = "logRevenue:quantity:price:")
    public native void logRevenue$quantity$price$(String productIdentifier, @MachineSizedSInt long quantity, NSNumber price);
    @Method(selector = "logRevenue:quantity:price:receipt:")
    public native void logRevenue$quantity$price$receipt$(String productIdentifier, @MachineSizedSInt long quantity, NSNumber price, NSData receipt);
    @Method(selector = "logRevenueV2:")
    public native void logRevenueV2(AMPRevenue revenue);
    @Method(selector = "identify:")
    public native void identify(AMPIdentify identify);
    @Method(selector = "identify:outOfSession:")
    public native void identify$outOfSession$(AMPIdentify identify, boolean outOfSession);
    @Method(selector = "setUserProperties:")
    public native void setUserProperties(NSDictionary<?, ?> userProperties);
    @Method(selector = "setUserProperties:replace:")
    public native void setUserProperties$replace$(NSDictionary<?, ?> userProperties, boolean replace);
    @Method(selector = "clearUserProperties")
    public native void clearUserProperties();
    @Method(selector = "setGroup:groupName:")
    public native void setGroup$groupName$(String groupType, NSObject groupName);
    @Method(selector = "setOffline:")
    public native void setOffline(boolean offline);
    @Method(selector = "enableLocationListening")
    public native void enableLocationListening();
    @Method(selector = "disableLocationListening")
    public native void disableLocationListening();
    @Method(selector = "updateLocation")
    public native void updateLocation();
    @Method(selector = "useAdvertisingIdForDeviceId")
    public native void useAdvertisingIdForDeviceId();
    @Method(selector = "printEventsCount")
    public native void printEventsCount();
    @Method(selector = "getDeviceId")
    public native String getDeviceId();
    @Method(selector = "regenerateDeviceId")
    public native void regenerateDeviceId();
    @Method(selector = "getSessionId")
    public native long getSessionId();
    @Method(selector = "uploadEvents")
    public native void uploadEvents();
    @Method(selector = "initializeApiKey:userId:startSession:")
    public native void initializeApiKey$userId$startSession$(String apiKey, String userId, boolean startSession);
    @Method(selector = "startSession")
    public native void startSession();
    @Method(selector = "instance")
    public static native Amplitude instance();
    @Method(selector = "instanceWithName:")
    public static native Amplitude instanceWithName(String instanceName);
    @Method(selector = "initializeApiKey:")
    public static native void initializeApiKey(String apiKey);
    @Method(selector = "initializeApiKey:userId:")
    public static native void initializeApiKey$userId$(String apiKey, String userId);
    @Method(selector = "logEvent:")
    public static native void logEvent(String eventType);
    @Method(selector = "logEvent:withEventProperties:")
    public static native void logEvent$withEventProperties$(String eventType, NSDictionary<?, ?> eventProperties);
    @Method(selector = "logRevenue:")
    public static native void logRevenue(NSNumber amount);
    @Method(selector = "logRevenue:quantity:price:")
    public static native void logRevenue$quantity$price$(String productIdentifier, @MachineSizedSInt long quantity, NSNumber price);
    @Method(selector = "logRevenue:quantity:price:receipt:")
    public static native void logRevenue$quantity$price$receipt$(String productIdentifier, @MachineSizedSInt long quantity, NSNumber price, NSData receipt);
    @Method(selector = "uploadEvents")
    public static native void uploadEvents();
    @Method(selector = "setUserProperties:")
    public static native void setUserProperties(NSDictionary<?, ?> userProperties);
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "enableLocationListening")
    public static native void enableLocationListening();
    @Method(selector = "disableLocationListening")
    public static native void disableLocationListening();
    @Method(selector = "useAdvertisingIdForDeviceId")
    public static native void useAdvertisingIdForDeviceId();
    @Method(selector = "printEventsCount")
    public static native void printEventsCount();
    @Method(selector = "getDeviceId")
    public static native String getDeviceId();
    /*</methods>*/
}
