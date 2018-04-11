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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoCustomEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPRewardedVideoCustomEventPtr extends Ptr<MPRewardedVideoCustomEvent, MPRewardedVideoCustomEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPRewardedVideoCustomEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPRewardedVideoCustomEvent() {}
    protected MPRewardedVideoCustomEvent(Handle h, long handle) { super(h, handle); }
    protected MPRewardedVideoCustomEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPRewardedVideoCustomEventDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPRewardedVideoCustomEventDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeSdkWithParameters:")
    public native void initializeSdkWithParameters(NSDictionary<?, ?> parameters);
    @Method(selector = "requestRewardedVideoWithCustomEventInfo:")
    public native void requestRewardedVideoWithCustomEventInfo(NSDictionary<?, ?> info);
    @Method(selector = "hasAdAvailable")
    public native boolean hasAdAvailable();
    @Method(selector = "presentRewardedVideoFromViewController:")
    public native void presentRewardedVideoFromViewController(UIViewController viewController);
    @Method(selector = "enableAutomaticImpressionAndClickTracking")
    public native boolean enableAutomaticImpressionAndClickTracking();
    @Method(selector = "handleAdPlayedForCustomEventNetwork")
    public native void handleAdPlayedForCustomEventNetwork();
    @Method(selector = "handleCustomEventInvalidated")
    public native void handleCustomEventInvalidated();
    @Method(selector = "setCachedInitializationParameters:")
    public native void setCachedInitializationParameters(NSDictionary<?, ?> params);
    @Method(selector = "cachedInitializationParameters")
    public native NSDictionary<?, ?> cachedInitializationParameters();
    @Method(selector = "setCachedInitializationParameters:forNetwork:")
    public static native void setCachedInitializationParameters$forNetwork$(NSDictionary<?, ?> params, String network);
    @Method(selector = "cachedInitializationParametersForNetwork:")
    public static native NSDictionary<?, ?> cachedInitializationParametersForNetwork(String network);
    @Method(selector = "allCachedNetworks")
    public static native NSArray<NSString> allCachedNetworks();
    @Method(selector = "clearCache")
    public static native void clearCache();
    /*</methods>*/
}
