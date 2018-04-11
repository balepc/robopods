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
package com.mobidevelop.robovm.pods.applovin;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALSdk/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALSdkPtr extends Ptr<ALSdk, ALSdkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALSdk.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALSdk() {}
    protected ALSdk(Handle h, long handle) { super(h, handle); }
    protected ALSdk(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sdkKey")
    public native String getSdkKey();
    @Property(selector = "settings")
    public native ALSdkSettings getSettings();
    @Property(selector = "mediationProvider")
    public native String getMediationProvider();
    @Property(selector = "setMediationProvider:")
    public native void setMediationProvider(String v);
    @Property(selector = "adService")
    public native ALAdService getAdService();
    @Property(selector = "nativeAdService")
    public native ALNativeAdService getNativeAdService();
    @Property(selector = "postbackService")
    public native ALPostbackService getPostbackService();
    @Property(selector = "eventService")
    public native ALEventService getEventService();
    @Property(selector = "userIdentifier")
    public native String getUserIdentifier();
    @Property(selector = "setUserIdentifier:")
    public native void setUserIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setPluginVersion:")
    public native void setPluginVersion(String pluginVersion);
    @Method(selector = "initializeSdk")
    public native void initializeSdk();
    @Method(selector = "version")
    public static native String version();
    @Method(selector = "versionCode")
    public static native @MachineSizedUInt long versionCode();
    @Method(selector = "initializeSdk")
    public static native void initializeSdk();
    @Method(selector = "shared")
    public static native ALSdk shared();
    @Method(selector = "sharedWithKey:")
    public static native ALSdk sharedWithKey(String sdkKey);
    @Method(selector = "sharedWithKey:settings:")
    public static native ALSdk sharedWithKey$settings$(String sdkKey, ALSdkSettings settings);
    /*</methods>*/
}
